// package com.example.aquafin.models;

// import java.time.LocalDateTime;

// import jakarta.persistence.Column;
// import jakarta.persistence.Entity;
// import jakarta.persistence.EnumType;
// import jakarta.persistence.Enumerated;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import jakarta.persistence.Table;

// @Entity
// @Table(name="notifications")
// public class Notification {

//     @Id
//     @GeneratedValue(strategy=GenerationType.IDENTITY)
//     private Long id;

//      @Column(name = "user_id")
//     private Long userId;

//     @Column(name = "message", nullable = false)
//     private String message;

//     @Column(name = "is_read")
//     private boolean isRead;

//     @Column(name = "created_at")
//     private LocalDateTime createdAt;

//     @Column(name = "notification_type")
//     @Enumerated(EnumType.STRING)
//     private NotificationType notificationType;

//     public Long getId() {
//         return id;
//     }

//     public void setId(Long id) {
//         this.id = id;
//     }

//     public Long getUserId() {
//         return userId;
//     }

//     public void setUserId(Long userId) {
//         this.userId = userId;
//     }

//     public String getMessage() {
//         return message;
//     }

//     public void setMessage(String message) {
//         this.message = message;
//     }

//     public boolean isIsRead() {
//         return isRead;
//     }

//     public void setIsRead(boolean isRead) {
//         this.isRead = isRead;
//     }

//     public LocalDateTime getCreatedAt() {
//         return createdAt;
//     }

//     public void setCreatedAt(LocalDateTime createdAt) {
//         this.createdAt = createdAt;
//     }

//     public NotificationType getNotificationType() {
//         return notificationType;
//     }

//     public void setNotificationType(NotificationType notificationType) {
//         this.notificationType = notificationType;
//     }

//     public enum NotificationType{
//         ORDER_CONFIRMATION,
//         ORDER_CANCELLATION,
//         PRODUCT_CHANGE,
//         CHAT_MESSAGE
//     }

// }
