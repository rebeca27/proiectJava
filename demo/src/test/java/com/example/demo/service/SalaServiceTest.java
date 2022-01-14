package com.example.demo.service;

import com.example.demo.models.Sala;
import com.example.demo.repository.SalaRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class SalaServiceTest {
    @Autowired
    SalaRepository salaRepository;

    @Test
    void testSaveSala() {
        Sala sala = new Sala("EC101", "Electro Computing", false);

        sala = salaRepository.save(sala);

        List<Sala> result = salaRepository.findAll();
        assertThat(result).containsExactly(sala);
    }
}

