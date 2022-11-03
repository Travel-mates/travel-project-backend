package com.example.backend.repository;

import com.example.backend.Destination;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DestinationRepository extends JpaRepository<Destination, Long> {

    @Query("DELETE FROM Destination des WHERE des.did=:id")
    void deleteByDesId(Long id);

    @Query("SELECT des FROM Destination des WHERE des.did=:id")
    Destination findByDesId(Long id);
}
