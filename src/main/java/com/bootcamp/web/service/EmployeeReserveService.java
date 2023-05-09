package com.bootcamp.web.service;

import java.util.List;

import com.bootcamp.web.entity.Participant;
import com.bootcamp.web.entity.Reservation;

public interface EmployeeReserveService {

	List<Reservation> getAllReserve();
	
	//??
	List<Participant> getParticipantsPerReserve();
	
	void newReservation(Reservation reservation);
	
	void updateReservation(Reservation reservation);
	
	//??
	void updateParticipants(Participant participant);

}
