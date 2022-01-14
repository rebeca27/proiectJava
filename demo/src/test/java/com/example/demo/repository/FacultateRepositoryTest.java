package com.example.demo.repository;

import com.example.demo.models.Facultate;
import com.example.demo.models.Sala;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.Assert.assertEquals;

@SpringBootTest
class FacultateRepositoryTest {
    @Autowired
    FacultateRepository facultateRepository;

    @Test
    @DisplayName("Get info facultate")
    void testGetAll() {
       Facultate facultate = new Facultate();
        facultate.setNume("Geografie");

        facultate = facultateRepository.save(facultate);

        List<Facultate> result = facultateRepository.findAll();
        assertEquals(1, result.size());
    }

}