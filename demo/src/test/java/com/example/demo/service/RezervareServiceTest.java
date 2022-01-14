package com.example.demo.service;

import com.example.demo.models.Rezervare;
import com.example.demo.models.Sala;
import com.example.demo.repository.RezervareRepository;
import com.example.demo.repository.SalaRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Timestamp;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class RezervareServiceTest {
    @Autowired
    RezervareRepository rezervareRepository;

    @Test
    @DisplayName("Save info rezervare")
    void testSaveRezervare() {
        Timestamp start = Timestamp.valueOf("2022-01-14 01:25:00");
        Timestamp finish = Timestamp.valueOf("2022-01-14 04:25:00");
        Rezervare rezervare = new Rezervare(1,1, start, finish, "Test");

        rezervare = rezervareRepository.save(rezervare);

        List<Rezervare> result = rezervareRepository.findAll();
        assertThat(result).containsExactly(rezervare);
    }
}

