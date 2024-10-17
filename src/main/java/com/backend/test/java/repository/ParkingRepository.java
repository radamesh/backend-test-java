package com.backend.test.java.repository;

import com.backend.test.java.entity.ParkingRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ParkingRepository extends JpaRepository<ParkingRecord, Long> {
    Optional<ParkingRecord> findByPlateAndEstacionadoTrue(String plate);
}
