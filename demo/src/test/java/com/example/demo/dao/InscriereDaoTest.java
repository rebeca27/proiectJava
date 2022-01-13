//package com.example.demo.dao;
//
//import com.example.demo.models.Inscriere;
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
//class InscriereDaoTest {
//    @Mock
//    EntityManager entityManager;
//    @InjectMocks
//    InscriereDao inscriereDao;
//
//    @BeforeEach
//    void setUp() {
//        MockitoAnnotations.initMocks(this);
//    }
//
//    @Test
//    void testGetAll() {
//        List<Inscriere> result = inscriereDao.getAll();
//        Assertions.assertEquals(Arrays.<Inscriere>asList(new Inscriere()), result);
//    }
//}
//
////Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme