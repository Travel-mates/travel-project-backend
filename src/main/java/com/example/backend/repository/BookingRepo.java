package com.example.backend.repository;

import com.example.backend.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepo extends JpaRepository<Booking, Long> {

    @Query("select book from Booking book where book.bid=:id")
    Booking findByBookId(Long id);
}
