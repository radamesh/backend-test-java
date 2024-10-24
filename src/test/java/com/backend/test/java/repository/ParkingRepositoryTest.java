package com.backend.test.java.repository;

import com.backend.test.java.entity.ParkingRecord;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataJpaTest
public class ParkingRepositoryTest {
    @Autowired
    private ParkingRepository parkingRepository;

    @Test
    public void testSaveParkingRecord() {
        ParkingRecord parkingRecord = new ParkingRecord();
        parkingRecord.setVehicle("kombi");
        parkingRecord.setPlate("XXX-1980");
        parkingRecord.setEstablishment("Establishment A");

        ParkingRecord savedParkingRecord = parkingRepository.save(parkingRecord);
        assertNotNull(savedParkingRecord.getId());
    }
}
