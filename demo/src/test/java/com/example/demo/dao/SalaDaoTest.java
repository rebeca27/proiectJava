//package com.example.demo.dao;
//
//import com.example.demo.models.Sala;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//
//import javax.persistence.EntityManager;
//import java.util.Arrays;
//import java.util.List;
//
//import static org.mockito.Mockito.*;
//
//class SalaDaoTest {
//    @Mock
//    EntityManager entityManager;
//    @InjectMocks
//    SalaDao salaDao;
//
//    @BeforeEach
//    void setUp() {
//        MockitoAnnotations.initMocks(this);
//    }
//
//    @Test
//    void testGetAll() {
//        List<Sala> result = salaDao.getAll();
//        Assertions.assertEquals(Arrays.<Sala>asList(new Sala("nume", "descriere", true)), result);
//    }
//
//    @Test
//    void testGetById() {
//        Sala result = salaDao.getById(0);
//        Assertions.assertEquals(new Sala("nume", "descriere", true), result);
//    }
//
//    @Test
//    void testBookIt() {
//        salaDao.bookIt(0);
//    }
//
//    @Test
//    void testUnbookIt() {
//        salaDao.unbookIt(0);
//    }
//}
