package com.backend.test.java.service.vehicles.impl;

import com.backend.test.java.entity.Vehicle;
import com.backend.test.java.repository.VehicleRepository;
import com.backend.test.java.service.vehicles.VehiclesService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleServiceImpl implements VehiclesService {

    private final VehicleRepository vehicleRepository;
    public VehicleServiceImpl(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public List<Vehicle> getVehicles() {
        return this.vehicleRepository.findAll();
    }

    @Override
    public Vehicle getVehicleById(Long id) {
        return this.vehicleRepository.findById(id).orElse(null);
    }

    @Override
    public Vehicle saveVehicle(Vehicle vehicle) {
        return this.vehicleRepository.save(vehicle);
    }

    @Override
    public Vehicle updateVehicle(Long id, Vehicle vehicle) {
        Vehicle getVehicle = this.vehicleRepository.findById(id).orElse(null);
        getVehicle.builder()
            .brand(vehicle.getBrand())
            .model(vehicle.getModel())
            .color(vehicle.getColor())
            .plate(vehicle.getPlate())
            .type(vehicle.getType())
            .build();

        return this.vehicleRepository.save(getVehicle);
    }

    @Override
    public void deleteVehicle(Long id) {
        this.vehicleRepository.deleteById(id);
    }
}
