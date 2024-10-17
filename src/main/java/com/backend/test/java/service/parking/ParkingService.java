package com.backend.test.java.service.parking;

import com.backend.test.java.entity.ParkingRecord;
import org.springframework.stereotype.Service;

@Service
public interface ParkingService {
    ParkingRecord registerEntry(ParkingRecord parkingRecord);
    ParkingRecord registerExit(String plate);
}
