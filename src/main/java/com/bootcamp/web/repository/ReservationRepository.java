package com.bootcamp.web.repository;

import com.bootcamp.web.entity.Employee;
import com.bootcamp.web.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {


}
