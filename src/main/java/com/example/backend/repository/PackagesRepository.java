package com.example.backend.repository;

import com.example.backend.Packages;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PackagesRepository extends JpaRepository<Packages, Long> {

    @Query("select pack from Packages pack where pack.pid=:id")
    Packages findByPackId(Long id);
}
