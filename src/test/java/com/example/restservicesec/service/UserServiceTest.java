package com.example.restservicesec.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Cheranev N.
 * created on 09.09.2020.
 */
@SpringBootTest
class UserServiceTest {

    @Autowired
    private UserAuthService userAuthService;

    @Test
    void loadUserByUsername_guest() {
        UserDetails userDetails = userAuthService.loadUserByUsername("guest");
        assertNotNull(userDetails);
        assertTrue(userDetails.isAccountNonExpired());
        assertTrue(userDetails.getPassword().startsWith("$2a$10$"));
        assertTrue(userDetails.isEnabled());
        assertTrue(userDetails.isAccountNonLocked());
        assertTrue(userDetails.isCredentialsNonExpired());
        assertEquals(userDetails.getAuthorities().size(), 1);
        assertEquals(userDetails.getAuthorities().toArray()[0], new SimpleGrantedAuthority("USER"));
    }
}