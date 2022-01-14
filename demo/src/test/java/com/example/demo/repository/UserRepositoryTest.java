package com.example.demo.repository;

import com.example.demo.models.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

@SpringBootTest
class UserRepositoryTest {
    @Autowired
    UserRepository userRepository;

    @Test
    void testGetAll() {
        User user = new User();
        user.setNume("Rauch");
        user.setPrenume("Rebecca");
        user.setPermisiune(false);
        user.setMail("rebecca.rauch@test.com");
        user.setParola("t");
        user.setId_facultate(1);


        user = userRepository.save(user);

        List<User> result = userRepository.findAll();
        assertEquals(1, result.size());
    }

}