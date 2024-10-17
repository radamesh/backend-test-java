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
        Establishment getEstablishment = this.establishmentRepository.findById(id).orElse(null);
        getEstablishment.setName(establishment.getName());
        getEstablishment.setCnpj(establishment.getCnpj());
        getEstablishment.setAddress(establishment.getAddress());
        getEstablishment.setPhone(establishment.getPhone());
        getEstablishment.setEmail(establishment.getEmail());
        getEstablishment.setSpacesForMotorcycles(establishment.getSpacesForMotorcycles());
        getEstablishment.setSpacesForCars(establishment.getSpacesForCars());

        return this.establishmentRepository.save(getEstablishment);
    }

    @Override
    public void deleteEstablishment(Long id) {
        this.establishmentRepository.deleteById(id);
    }

}
