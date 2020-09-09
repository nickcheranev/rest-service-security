package com.example.restservicesec.jpa;

import com.example.restservicesec.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Cheranev N.
 * created on 09.09.2020.
 */
@SpringBootTest
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    void loadContext() {
        assertNotNull(userRepository);
    }

    @Test
    void findByUsername() {
        Optional<User> optUser = userRepository.findByUsername("guest");
        assertTrue(optUser.isPresent());
        User user = optUser.get();
        assertTrue(user.isAccountNonExpired());
        assertTrue(user.getPassword().startsWith("$2a$10$"));
        assertTrue(user.isEnabled());
        assertTrue(user.isAccountNonLocked());
        assertTrue(user.isCredentialsNonExpired());
        assertEquals(user.getAuthorities().size(), 1);
        assertEquals(user.getAuthorities().toArray()[0], new SimpleGrantedAuthority("USER"));
    }
}