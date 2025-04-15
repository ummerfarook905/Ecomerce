package com.example.aquafin.services;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import jakarta.mail.MessagingException;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmailService {
    private final JavaMailSender emailSender;
    // private final SpringTemplateEngine templateEngine;


    public void sendOrderConfirmationEmail(String email) throws MessagingException{


        
        // MimeMessage message = emailSender.createMimeMessage();
        // MimeMessageHelper helper = new MimeMessageHelper(
        //     message,
        //     MimeMessageHelper.MULTIPART_MODE_MIXED_RELATED,
        //     StandardCharsets.UTF_8.name()
        // );

        // MimeMessage message = emailSender.createMimeMessage();
        // MimeMessageHelper helper = new MimeMessageHelper(
        // message,
        // MimeMessageHelper.MULTIPART_MODE_MIXED_RELATED,
        // StandardCharsets.UTF_8.name()

        // Context context = new Context();
        // context.setVariable("order",orders);

        // String html = TemplateEngine.process("mail-confirmation", context);

        // message.setTo(email);
        // message.setFrom("ummerfarook905@gmail.com");
        // message.setSubject(("Order Confirmation  "));
        // message.setText(html,true);
        SimpleMailMessage message = new SimpleMailMessage();

        message.setTo(email);
        message.setFrom("ummerfarook905@gmail.com");
        message.setSubject("Order Confirmation");
        message.setText("your order has been confirmed");

        emailSender.send(message);
    }

}
