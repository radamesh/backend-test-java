package com.backend.test.java.service;

import com.backend.test.java.entity.ParkingRecord;
import com.backend.test.java.repository.ParkingRepository;
import com.backend.test.java.service.parking.impl.ParkingServiceImpl;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.MockitoAnnotations;
import java.util.Optional;

public class ParkingServiceTest {

    @Mock
    private ParkingRepository parkingRepository;

    @InjectMocks
    private ParkingServiceImpl parkingService;

    private ParkingRecord parkingRecord;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);

        ParkingRecord parkingRecord = new ParkingRecord();
        parkingRecord.setVehicle("kombi");
        parkingRecord.setPlate("XXX-1980");
        parkingRecord.setEstablishment("Establishment A");
        parkingRecord.setEstacionado(true);
    }

    @Test
    public void testEnterVehicle_success() {

//        when(parkingRepository.findByPlateAndEstacionadoTrue("XXX-1980")).thenReturn(Optional.of(parkingRecord));
//
//        Optional<ParkingRecord> savedParkingRecord = parkingService.registerEntry(parkingRecord);
//        assertTrue()
//        assertNotNull(savedParkingRecord.getId());
//        verify(parkingRepository, times(1)).save(parkingRecord);
    }

}

