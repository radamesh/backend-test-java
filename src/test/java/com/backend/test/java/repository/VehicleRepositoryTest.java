package com.backend.test.java.repository;

import com.backend.test.java.entity.Vehicle;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataJpaTest
public class VehicleRepositoryTest {
    @Autowired
    private VehicleRepository vehicleRepository;

    @Test
    public void testSaveVehicle() {
        Vehicle vehicle = new Vehicle();
        vehicle.setBrand("BMW");
        vehicle.setModel("bmx 1000");
        vehicle.setColor("yellow");
        vehicle.setPlate("XXX-1980");
        vehicle.setType("sedan");

        Vehicle savedVehicle = vehicleRepository.save(vehicle);
        assertNotNull(savedVehicle.getId());
    }

}
