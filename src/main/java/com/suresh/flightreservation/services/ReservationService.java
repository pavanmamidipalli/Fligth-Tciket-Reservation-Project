package com.suresh.flightreservation.services;

import com.suresh.flightreservation.dto.ReservationRequest;
import com.suresh.flightreservation.entities.Reservation;

public interface ReservationService {
	
	public Reservation bookFlight(ReservationRequest request);

}
