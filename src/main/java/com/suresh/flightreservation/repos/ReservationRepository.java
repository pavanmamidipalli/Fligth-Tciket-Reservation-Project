package com.suresh.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suresh.flightreservation.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
