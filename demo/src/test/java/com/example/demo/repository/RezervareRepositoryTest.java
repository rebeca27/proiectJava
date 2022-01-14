package com.example.demo.repository;

import com.example.demo.models.Rezervare;
import com.example.demo.models.Sala;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Timestamp;
import java.util.List;

import static org.junit.Assert.assertEquals;

@SpringBootTest
class RezervareRepositoryTest {
    @Autowired
    RezervareRepository rezervareRepository;

    @Test
    void testGetAll() {
       Rezervare rezervare = new Rezervare();
        rezervare.setId_user(1);
        rezervare.setId_sala(2);
        rezervare.setFinish(Timestamp.valueOf("2022-01-14 04:25:00"));
        rezervare.setStart(Timestamp.valueOf("2022-01-14 01:25:00"));
        rezervare.setMotiv("test");
        rezervare = rezervareRepository.save(rezervare);

        List<Rezervare> result = rezervareRepository.findAll();
        assertEquals(1, result.size());
    }

}