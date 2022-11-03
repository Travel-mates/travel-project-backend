package com.example.backend;

import com.example.backend.repository.DestinationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DestinationService {

    @Autowired
    DestinationRepository destinationRepository;

    public List<Destination> getDestinations() {
        return destinationRepository.findAll();
    }

    public Destination addDestination(Destination destination) {
        return destinationRepository.save(destination);

    }

    public String deleteDestination(Long id) {

        destinationRepository.deleteById(id);
        return "Successfully Deleted";
    }

    public String updateDestination(Long id, Destination destination) {
        Destination destination1 = destinationRepository.findByDesId(id);

            destination1.setLocation(destination.getLocation());
            destination1.setDescription(destination.getDescription());
            destination1.setName(destination.getName());

            destinationRepository.save(destination1);
            return "Succsfully Updated";



    }
}
