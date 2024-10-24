package com.backend.test.java.service;

import com.backend.test.java.entity.Establishment;
import com.backend.test.java.repository.EstablishmentRepository;
import com.backend.test.java.service.establishments.impl.EstablishmentServiceImpl;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class EstablishmentServiceTest {

    @Mock
    private EstablishmentRepository establishmentRepository;

    @InjectMocks
    private EstablishmentServiceImpl establishmentService;

    @Test
    public void testGetAllEstablishments() {
        Mockito.when(establishmentRepository.findAll()).thenReturn(Collections.emptyList());

        List<Establishment> establishments = establishmentService.getAllEstablishments();

        assertTrue(establishments.isEmpty());
        Mockito.verify(establishmentRepository, Mockito.times(1)).findAll();
    }
}
