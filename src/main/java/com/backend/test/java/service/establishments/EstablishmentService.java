package com.backend.test.java.service.establishments;

import com.backend.test.java.entity.Establishment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EstablishmentService {
    List<Establishment> getAllEstablishments();
    Establishment getEstablishmentById(Long id);
    Establishment saveEstablishment(Establishment establishment);
    Establishment updateEstablishment(Long id, Establishment establishment);
    void deleteEstablishment(Long id);
}
