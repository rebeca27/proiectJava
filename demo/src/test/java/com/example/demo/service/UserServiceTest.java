package com.example.demo.service;

import com.example.demo.models.User;
import com.example.demo.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class UserServiceTest {
    @Autowired
    UserRepository userRepository;

    @Test
    void testSaveUser() {
        User user = new User("Oprea","Rebeca", false, "r.oprea@test.com","t", 3);

        user = userRepository.save(user);

        List<User> result = userRepository.findAll();
        assertThat(result).containsExactly(user);
    }
}

