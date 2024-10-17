package com.backend.test.java.service.establishments.impl;

import com.backend.test.java.entity.Establishment;
import com.backend.test.java.repository.EstablishmentRepository;
import com.backend.test.java.service.establishments.EstablishmentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstablishmentServiceImpl implements EstablishmentService {

    private final EstablishmentRepository establishmentRepository;
    public EstablishmentServiceImpl(EstablishmentRepository establishmentRepository) {
        this.establishmentRepository = establishmentRepository;
    }

    @Override
    public List<Establishment> getAllEstablishments() {
        return this.establishmentRepository.findAll();
    }

    @Override
    public Establishment getEstablishmentById(Long id) {
        return this.establishmentRepository.findById(id).orElse(null);
    }

    @Override
    public Establishment saveEstablishment(Establishment establishment) {
        return this.establishmentRepository.save(establishment);
    }

    @Override
    public Establishment updateEstablishment(Long id, Establishment establishment) {
        var getEstablishment = this.establishmentRepository.findById(id).orElse(null);
        getEstablishment.builder()
                .name(establishment.getName())
                .cnpj(establishment.getCnpj())
                .address(establishment.getAddress())
                .phone(establishment.getPhone())
                .email(establishment.getEmail())
                .spacesForMotorcycles(establishment.getSpacesForMotorcycles())
                .spacesForCars(establishment.getSpacesForCars())
                .build();
        return this.establishmentRepository.save(getEstablishment);
    }

    @Override
    public void deleteEstablishment(Long id) {
        this.establishmentRepository.deleteById(id);
    }

}
