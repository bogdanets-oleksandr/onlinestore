package io.teamchallenge.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MailService {

    private final JavaMailSender mailSender;
    private final MessageSource messages;

    @Value("${spring.mail.username}")
    private String supportEmail;
    @Value("${frontend.server.url}")
    private String frontendServerUrl;

    public void sendResetPasswordEmail(String email,
                                       String token) {
        String resetPasswordUrl = frontendServerUrl + "/changePassword?token=" + token;
        String message = "To reset your password, follow the link (link is valid only 24 hours)\r\n" + resetPasswordUrl;
        String subject = "Reset Password";
        SimpleMailMessage mailMessage = constructEmail(subject, message, email);
        sendEmail(mailMessage);
    }
    //TODO: fix async
    @Async
    protected void sendEmail(SimpleMailMessage message) {
        //send to customer
        mailSender.send(message);
    }

    private SimpleMailMessage constructEmail(String subject, String body, String email) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setSubject(subject);
        message.setText(body);
        message.setTo(email);
        message.setFrom(supportEmail);
        return message;
    }
}
