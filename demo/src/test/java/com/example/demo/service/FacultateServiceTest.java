package com.example.demo.service;

import com.example.demo.models.Facultate;
import com.example.demo.repository.FacultateRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class FacultateServiceTest {
    @Autowired
    FacultateRepository facultateRepository;

    @Test
    void testSaveFacultate() {
        Facultate facultate = new Facultate("Litere");

        facultate = facultateRepository.save(facultate);

        List<Facultate> result = facultateRepository.findAll();
        assertThat(result).containsExactly(facultate);
    }
}

