package com.backend.test.java.controller;

import com.backend.test.java.entity.Vehicle;
import com.backend.test.java.service.vehicles.VehiclesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vehicle")
public class VehicleController {

    private final VehiclesService vehiclesService;

    @Autowired
    public VehicleController(VehiclesService vehiclesService) {
        this.vehiclesService = vehiclesService;
    }

    @GetMapping
    public List<Vehicle> getAllVehicle() {
        return this.vehiclesService.getVehicles();
    }

    @GetMapping("/{id}")
    public Vehicle getVehicle(@PathVariable Long id) {
        return this.vehiclesService.getVehicleById(id);
    }

    @PostMapping
    public Vehicle createVehicle(@RequestBody @Validated Vehicle vehicle) {
        return this.vehiclesService.saveVehicle(vehicle);
    }

    @PutMapping("/{id}")
    public Vehicle updateVehicle(@PathVariable Long id, @RequestBody @Validated Vehicle vehicle) {
        return this.vehiclesService.updateVehicle(id, vehicle);
    }

    @DeleteMapping("/{id}")
    public void deleteVehicle(@PathVariable Long id) {
        this.vehiclesService.deleteVehicle(id);
    }
}
