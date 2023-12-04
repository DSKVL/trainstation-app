package com.example.trainstationtemp.repository;

import com.example.trainstationtemp.entity.domain.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightRepository  extends JpaRepository<Flight, Long> {
}
