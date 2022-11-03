package com.example.backend.service;

import com.example.backend.Booking;
import com.example.backend.repository.BookingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {
    @Autowired
    BookingRepo bookingRepo;

    public List<Booking> getBooking() {
        return bookingRepo.findAll();
    }

    public Booking addBooking(Booking booking) {
        return bookingRepo.save(booking);
    }

    public String deleteBooking(Long id) {
        bookingRepo.deleteById(id);
        return "Deleted";
    }

    public String updateBooking(Long id, Booking booking) {
        Booking booking1 = bookingRepo.findByBookId(id);

        booking1.setDate(booking.getDate());
        return "Updated";
    }
}
