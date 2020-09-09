package com.example.restservicesec.jpa;

import com.example.restservicesec.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author Cheranev N.
 * created on 09.09.2020.
 */
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
