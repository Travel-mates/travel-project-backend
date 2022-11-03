package com.example.backend.service;

import com.example.backend.Destination;
import com.example.backend.Packages;
import com.example.backend.repository.PackagesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PackagesService {

    @Autowired
    PackagesRepository packagesRepository;

    public Packages addPackage(Packages packages) {
        return packagesRepository.save(packages);
    }

    public List<Packages> getPackages() {
        return packagesRepository.findAll();
    }

    public String deletePackage(Long id) {
        packagesRepository.deleteById(id);
        return "Deleted";
    }

    public String updatePackage(Long id, Packages packages) {
        Packages packages1 = packagesRepository.findByPackId(id);

        packages1.setPackageName(packages.getPackageName());
        packages1.setContactNo(packages.getContactNo());
        packages1.setPackageDetails(packages.getPackageDetails());

        packagesRepository.save(packages1);
        return "Succsfully Updated";

    }
}
