//package com.example.demo.dao;
//
//import com.example.demo.models.Sala;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.MockitoAnnotations;
//
//import java.util.Arrays;
//import java.util.List;
//
//class SalaDaoTest1 {
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
//
//    @Test
//    void testUpdateClassroom() {
//        salaDao.updateClassroom(new Sala("nume", "descriere", true));
//    }
//}
//
////Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme