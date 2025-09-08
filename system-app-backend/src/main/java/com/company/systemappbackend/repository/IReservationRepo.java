package com.company.systemappbackend.repository;

import com.company.systemappbackend.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IReservationRepo extends JpaRepository<Reservation, Integer> {
}
