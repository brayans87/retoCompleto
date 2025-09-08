package com.company.systemappbackend.repository;

import com.company.systemappbackend.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRoomRepo extends JpaRepository<Room, Integer> {
}
