package com.backend.test.java.repository;

import com.backend.test.java.entity.Establishment;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataJpaTest
public class EstablishmentRepositoryTest {
    @Autowired
    private EstablishmentRepository establishmentRepository;

    @Test
    public void testSaveEstablishment() {
        Establishment establishment = new Establishment();
        establishment.setName("Establishment A");
        establishment.setCnpj("00.000.000/0001-00");
        establishment.setAddress("Rua das Vida");
        establishment.setPhone("11 99999-1010");
        establishment.setEmail("teste.dasilva@email.com");
        establishment.setSpacesForMotorcycles(20);
        establishment.setSpacesForCars(20);

        Establishment savedEstablishment = establishmentRepository.save(establishment);
        assertNotNull(savedEstablishment.getId());
    }

}
