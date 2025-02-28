// package com.example.aquafin.controllers;

// import java.util.List;

// import javax.management.Notification;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

// import com.example.aquafin.services.NotificationService;

// @RestController
// @RequestMapping("/user/notifications")
// public class NotificationController {

//     @Autowired
//     private NotificationService notificationService;

//     @GetMapping("/{userId}")
//     public ResponseEntity<List<Notification>> getUserNotifications(@PathVariable Long userId){
//         return ResponseEntity.ok(notificationService.getUserNotifications(userId));
//     }

//     @GetMapping("/{userId}/unread")
//     public ResponseEntity<List<Notification>> getUnreadNotifications(@PathVariable Long userId) {
//         return ResponseEntity.ok(notificationService.getUnreadNotifications(userId));
//     }

//     @PostMapping("/{notificationId}/read")
//     public ResponseEntity<Void> markNotificationAsRead(@PathVariable Long notificationId){
//         notificationService.markNotificationAsRead(notificationId);
//         return ResponseEntity.ok().build();
//     }


// }
