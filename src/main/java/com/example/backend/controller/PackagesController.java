package com.example.backend.controller;

import com.example.backend.Packages;
import com.example.backend.service.PackagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PackagesController {
    @Autowired
    PackagesService packagesService;

    @GetMapping("/package")
    public List<Packages> getPackages(){
        return packagesService.getPackages();
    }

    @PostMapping("/package")
    public Packages addPackage(@RequestBody Packages packages){
        return packagesService.addPackage(packages);
    }

    @DeleteMapping("/package/{id}")
    public String deletePackage(@PathVariable(name = "id") Long id){
        return packagesService.deletePackage(id);
    }

    @PutMapping("/package/{id}")
    public String updatePackage(@PathVariable(name = "id") Long id, @RequestBody Packages packages){
        return packagesService.updatePackage(id, packages);
    }
}
