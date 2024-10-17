package com.backend.test.java.service.vehicles;

import com.backend.test.java.entity.Vehicle;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface VehiclesService {
    List<Vehicle> getVehicles();
    Vehicle getVehicleById(Long id);
    Vehicle saveVehicle(Vehicle vehicle);
    Vehicle updateVehicle(Long id, Vehicle vehicle);
    void deleteVehicle(Long id);
}
