package com.example.restservicesec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Создать микросервис со страницей index.html.
 * Защитить доступ к странице index.html с помощью Spring Security.
 *
 * Подключить механизм FormBased-аутентификации, реализовать свой SecurityConfig
 * и UserService. Пользователи, пароли и роли пользователей должны храниться в
 * самом микросервисе.
 */
@SpringBootApplication
public class RestServiceSecurityApp {

    public static void main(String[] args) {
        SpringApplication.run(RestServiceSecurityApp.class, args);
    }

}
