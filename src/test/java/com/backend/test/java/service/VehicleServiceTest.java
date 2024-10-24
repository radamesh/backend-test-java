package com.backend.test.java.service;

import com.backend.test.java.entity.Vehicle;
import com.backend.test.java.repository.VehicleRepository;
import com.backend.test.java.service.vehicles.impl.VehicleServiceImpl;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class VehicleServiceTest {

    @Mock
    private VehicleRepository vehicleRepository;

    @InjectMocks
    private VehicleServiceImpl vehicleService;

    @Test
    public void testGetAllVehicle() {
        Mockito.when(vehicleRepository.findAll()).thenReturn(Collections.emptyList());

        List<Vehicle> vehicles = vehicleService.getVehicles();

        assertTrue(vehicles.isEmpty());
        Mockito.verify(vehicleRepository, Mockito.times(1)).findAll();
    }
}
