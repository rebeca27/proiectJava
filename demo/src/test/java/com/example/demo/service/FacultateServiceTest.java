package com.example.demo.service;

import com.example.demo.models.Facultate;
import com.example.demo.models.User;
import com.example.demo.repository.FacultateRepository;
import com.example.demo.repository.UserRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class FacultateServiceTest {
    @Autowired
    FacultateRepository facultateRepository;
    @Autowired
    UserRepository userRepository;

    @Test
    @DisplayName("Save info facultate")
    void testSaveFacultate() {
        Facultate facultate = new Facultate("Litere");

        facultate = facultateRepository.save(facultate);

        List<Facultate> result = facultateRepository.findAll();
        assertThat(result).containsExactly(facultate);
    }



    @Test
    void testGetFaculty() {
        Facultate facultate = new Facultate("Litere");

        facultate = facultateRepository.save(facultate);

        Facultate resultFacultate = facultateRepository.getById(facultate.getId());


        User user = new User();
        user.setNume("Rauch");
        user.setPrenume("Rebecca");
        user.setPermisiune(false);
        user.setMail("rebecca.rauch@test.com");
        user.setParola("t");
        user.setId_facultate(1);

        user = userRepository.save(user);

        User resultUser = userRepository.getById(user.getId_facultate());

        assertThat(resultUser).equals(resultFacultate);

    }
}

