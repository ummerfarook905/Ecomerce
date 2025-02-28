// package com.example.aquafin.services;

// import java.time.LocalDateTime;
// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import com.example.aquafin.models.Notification;
// import com.example.aquafin.repositories.NotificationRepository;

// @Service
// public class NotificationService {

//     @Autowired
//     private NotificationRepository notificationRepository;

//      public Notification createNotification(Long userId, String message, Notification.NotificationType type) {
//         Notification notification = new Notification();
//         notification.setUserId(userId);
//         notification.setMessage(message);
//         notification.setNotificationType(type);
//         notification.setIsRead(false);
//         notification.setCreatedAt(LocalDateTime.now());
        
//         return notificationRepository.save(notification);
//     }

//     public List<Notification> getUserNotifications(Long userId) {
//         return notificationRepository.findByUserId(userId);
//     }

//     public List<Notification> getUnreadNotifications(Long userId) {
//         return notificationRepository.findByUserIdAndReadFalse(userId);
//     }

//     public void markNotificationAsRead(Long notificationId) {
//         Notification notification = notificationRepository.findById(notificationId)
//             .orElseThrow(() -> new RuntimeException("Notification not found"));
//         notification.setIsRead(true);
//         notificationRepository.save(notification);
//     }



// }
