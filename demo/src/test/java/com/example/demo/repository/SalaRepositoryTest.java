package com.example.demo.repository;

import com.example.demo.models.Sala;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.Assert.assertEquals;

@SpringBootTest
class SalaRepositoryTest {
    @Autowired
    SalaRepository salaRepository;

    @Test
    void testGetAll() {
       Sala sala = new Sala();
        sala.setNume("JAVA");
        sala.setDescriere("Java web developing");
        sala.setStare(false);

        sala = salaRepository.save(sala);

        List<Sala> result = salaRepository.findAll();
        assertEquals(1, result.size());
    }

}