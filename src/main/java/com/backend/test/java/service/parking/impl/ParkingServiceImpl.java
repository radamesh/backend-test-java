package com.backend.test.java.service.parking.impl;

import com.backend.test.java.entity.ParkingRecord;
import com.backend.test.java.repository.ParkingRepository;
import com.backend.test.java.service.parking.ParkingService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class ParkingServiceImpl implements ParkingService {

    private final ParkingRepository parkingRepository;
    public ParkingServiceImpl(ParkingRepository parkingRepository) {
        this.parkingRepository = parkingRepository;
    }

    @Override
    public ParkingRecord registerEntry(ParkingRecord parkingRecord) {
        Optional<ParkingRecord> validateParkingRecord = parkingRepository.findByPlateAndEstacionadoTrue(parkingRecord.getPlate());
        if (validateParkingRecord.isPresent()) {
            throw new IllegalArgumentException("Este veículo ainda esta estacionado.");
        }
        parkingRecord.setEstacionado(true);
        return this.parkingRepository.save(parkingRecord);
    }

    @Override
    public ParkingRecord registerExit(String plate) {
        Optional<ParkingRecord> validateRegister = this.parkingRepository.findByPlateAndEstacionadoTrue(plate);

        if (validateRegister.isPresent()) {
            ParkingRecord existinParkingRecord = validateRegister.get();
            existinParkingRecord.setEstacionado(false);
            existinParkingRecord.setExitTime(LocalDateTime.now());
            return this.parkingRepository.save(existinParkingRecord);
        } else {
            throw new IllegalArgumentException("O veículo não está estacionado.");
        }
    }
}
