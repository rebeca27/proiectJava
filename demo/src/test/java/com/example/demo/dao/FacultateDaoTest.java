//package com.example.demo.dao;
//
//import com.example.demo.models.Facultate;
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
//class FacultateDaoTest {
//    @Mock
//    EntityManager entityManager;
//    @InjectMocks
//    FacultateDao facultateDao;
//
//    @BeforeEach
//    void setUp() {
//        MockitoAnnotations.initMocks(this);
//    }
//
//    @Test
//    void testGetAll() {
//        List<Facultate> result = facultateDao.getAll();
//        Assertions.assertEquals(Arrays.<Facultate>asList(new Facultate(0)), result);
//    }
//
//    @Test
//    void testGetById() {
//        Facultate result = facultateDao.getById(0);
//        Assertions.assertEquals(new Facultate(0), result);
//    }
//
//    @Test
//    void testGetByNume() {
//        Facultate result = facultateDao.getByNume("nume");
//        Assertions.assertEquals(new Facultate(0), result);
//    }
//}
//
////Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme