package com.suresh.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suresh.flightreservation.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
