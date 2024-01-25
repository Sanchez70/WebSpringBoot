package com.zhotel.app.Services;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@Service
public class NotificationService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendWelcomeEmail(String to) {
        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message);
        try {
            helper.setTo(to);
            helper.setSubject("Bienvenido a ZHotel");

            // Use true to indicate that the text parameter is HTML
            helper.setText("<html><body><h1>¡Bienvenido a ZHotel!</h1>"
                    + "<p>Gracias por registrarte en nuestra aplicación. Estamos emocionados de tenerte como parte de nuestra comunidad.</p>"
                    + "<img src='https://drive.google.com/file/d/1jkCL6V8Fww2R_cxn1v-r1fpGqqJkfaPU/view?usp=drive_link' alt='Logo de ZHotel'></body></html>", true);
                  
            mailSender.send(message);
        } catch (MessagingException e) {
            e.printStackTrace(); // Manejo de excepciones
        }
    }
}
