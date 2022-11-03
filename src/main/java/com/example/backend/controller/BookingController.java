package com.example.backend.controller;

import com.example.backend.Booking;
import com.example.backend.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookingController {

    @Autowired
    BookingService bookingService;

    @GetMapping("/booking")
    public List<Booking> getBooking(){
        return bookingService.getBooking();
    }

    @PostMapping("/booking")
    public Booking addDestination(@RequestBody Booking booking){
        return bookingService.addBooking(booking);
    }

    @DeleteMapping("/booking/{id}")
    public String deleteBooking(@PathVariable(name = "id") Long id){
        return bookingService.deleteBooking(id);
    }

    @PutMapping("/booking/{id}")
    public String updateBooking(@PathVariable(name = "id") Long id, @RequestBody Booking booking){
        return bookingService.updateBooking(id, booking);
    }
}
