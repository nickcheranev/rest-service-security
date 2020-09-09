package com.example.restservicesec.service;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * Закодировать пароль и вставить в data.sql
 *
 * @author Cheranev N.
 * created on 09.09.2020.
 */
@SpringBootTest
public class GeneratePasswordNotTest {

    @Autowired
    public PasswordEncoder passwordEncoder;

    @Test
    @Disabled
    void generatePasswordNotTest() {
        System.out.println(passwordEncoder.encode("password"));
    }
}
