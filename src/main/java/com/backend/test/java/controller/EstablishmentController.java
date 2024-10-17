package com.backend.test.java.controller;

import com.backend.test.java.entity.Establishment;
import com.backend.test.java.service.establishments.EstablishmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/establishment")
public class EstablishmentController {

    private final EstablishmentService establishmentService;

    @Autowired
    public EstablishmentController(EstablishmentService establishmentService) {
        this.establishmentService = establishmentService;
    }

    @GetMapping
    public List<Establishment> getAllEstablishment() {
        return this.establishmentService.getAllEstablishments();
    }

    @GetMapping("/{id}")
    public Establishment getEstablishment(@PathVariable Long id) {
        return this.establishmentService.getEstablishmentById(id);
    }

    @PostMapping
    public Establishment createEstablishment(@RequestBody @Validated Establishment establishment) {
        return this.establishmentService.saveEstablishment(establishment);
    }

    @PutMapping("/{id}")
    public Establishment updateEstablishment(@PathVariable Long id, @RequestBody @Validated Establishment establishment) {
        return this.establishmentService.updateEstablishment(id, establishment);
    }

    @DeleteMapping("/{id}")
    public void deleteEstablishment(@PathVariable Long id) {
        this.establishmentService.deleteEstablishment(id);
    }
}
