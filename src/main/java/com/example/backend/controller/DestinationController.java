package com.example.backend.controller;

import com.example.backend.Destination;
import com.example.backend.DestinationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class DestinationController {

    @Autowired
    DestinationService destinationService;

    @GetMapping("/destination")
    public List<Destination> getDestinations(){
        return destinationService.getDestinations();
    }

    @PostMapping("/destination")
    public Destination addDestination(@RequestBody Destination destination){
        return destinationService.addDestination(destination);
    }

    @DeleteMapping("/destination/{id}")
    public String deleteDestination(@PathVariable(name = "id") Long id){
        return destinationService.deleteDestination(id);
    }

    @PutMapping("/destination/{id}")
    public String updateDestination(@PathVariable(name = "id") Long id, @RequestBody Destination destination){
        return destinationService.updateDestination(id, destination);
    }
}
