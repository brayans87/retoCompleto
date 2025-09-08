package com.company.systemappbackend;

import com.company.systemappbackend.model.Reservation;
import com.company.systemappbackend.model.Room;
import com.company.systemappbackend.repository.IGenericRepo;
import com.company.systemappbackend.repository.IReservationRepo;
import com.company.systemappbackend.repository.IRoomRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
@RequiredArgsConstructor
public class SystemAppBackendApplication implements CommandLineRunner {

    private final IRoomRepo roomRepo;
    private final IReservationRepo reservationRepo;

    public static void main(String[] args) {
        SpringApplication.run(SystemAppBackendApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

      /*  Room room = new Room();

        room.setNumber("A12");
        room.setType("Doble");
        room.setPrice(45.2);
        room.setAvailable(true);

        roomRepo.save(room);
*/
/*
       Room room = roomRepo.findById(1).orElseThrow();

       Reservation reservation = Reservation.builder()
               .customerName("Bryaan smit")
               .checkInDate(LocalDate.now())
               .checkOutDate(LocalDate.now().plusDays(3))
               .room(room)
               .build();

       reservationRepo.save(reservation);
       */

    }
}
