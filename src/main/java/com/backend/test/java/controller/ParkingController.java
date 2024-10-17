package com.backend.test.java.controller;

import com.backend.test.java.entity.ParkingRecord;
import com.backend.test.java.service.parking.ParkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/parking")
public class ParkingController {

    private final ParkingService parkingService;
    @Autowired
    public ParkingController(ParkingService parkingService) {
        this.parkingService = parkingService;
    }

    @PostMapping("/entry")
    public ParkingRecord registerEntry(@RequestBody @Validated ParkingRecord record) {
        return parkingService.registerEntry(record);
    }

    @PutMapping("/exit/{plate}")
    public ParkingRecord registerExit(@PathVariable String plate) {
        return parkingService.registerExit(plate);
    }
}