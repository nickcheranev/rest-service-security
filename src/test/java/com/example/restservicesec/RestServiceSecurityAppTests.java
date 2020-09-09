package com.example.restservicesec;

import com.example.restservicesec.service.UserAuthService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class RestServiceSecurityAppTests {

    @Autowired
    private UserAuthService userAuthService;

    @Test
    void contextLoads() {
        assertNotNull(userAuthService);
    }
}
