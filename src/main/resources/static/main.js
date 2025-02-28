let stompClient = null;

function connect(event) {
    const socket = new SockJS('/ws');
    stompClient = Stomp.over(socket);
    stompClient.connect({}, onConnected, onError);
    event.preventDefault();
}

function onConnected() {
    stompClient.subscribe('/topic/public', onMessageReceived);

    stompClient.send("/app/chat.addUser", {}, JSON.stringify({ sender: document.querySelector('#name').value, type: 'JOIN' }));
    
    document.querySelector('.connecting').classList.add('hidden');
    document.querySelector('#chat-page').classList.remove('hidden');
}

function onError(error) {
    console.error('Could not connect to WebSocket server. Please refresh the page.');
}

function sendMessage(event) {
    const messageContent = document.querySelector('#message').value.trim();
    if (messageContent && stompClient) {
        const chatMessage = {
            sender: document.querySelector('#name').value,
            content: messageContent,
            type: 'CHAT'
        };
        stompClient.send("/app/chat.sendMessage", {}, JSON.stringify(chatMessage));
        document.querySelector('#message').value = '';
    }
    event.preventDefault();
}

function onMessageReceived(payload) {
    const message = JSON.parse(payload.body);

    const messageElement = document.createElement('li');
    messageElement.classList.add('chat-message');
    messageElement.textContent = `${message.sender}: ${message.content}`;
    document.querySelector('#messageArea').appendChild(messageElement);

    if (Notification.permission === 'granted') {
        new Notification(`New message from ${message.sender}`, {
            body: message.content,
            icon: '/path/to/icon.png' 
        });
    } else if (Notification.permission !== 'denied') {
        Notification.requestPermission().then(permission => {
            if (permission === 'granted') {
                new Notification(`New message from ${message.sender}`, {
                    body: message.content,
                    icon: '/path/to/icon.png' 
                });
            }
        });
    }
}

document.querySelector('#usernameForm').addEventListener('submit', connect, true);
document.querySelector('#messageForm').addEventListener('submit', sendMessage, true);