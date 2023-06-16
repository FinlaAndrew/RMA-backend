package com.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@Configuration
public class MailConfig {
    @Bean
    public JavaMailSender javaMailSender() {
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        // Configure the mail sender properties, such as host, port, username, and password
        // mailSender.setHost("your_host");
        // mailSender.setPort(your_port);
        // mailSender.setUsername("your_username");
        // mailSender.setPassword("your_password");
        return mailSender;
    }
}

