package com.javahelps.restservice.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javahelps.restservice.entity.Doctors;
import com.javahelps.restservice.repository.DoctorsRepository;
import javassist.tools.web.BadHttpRequest;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(path = "/doctors")
public class DoctorsController {

    @Autowired
    private DoctorsRepository repository;

    @GetMapping
    public Iterable<Doctors> findAll() {
        return repository.findAll();
    }

    @GetMapping(path = "/{adsoyad}")
    public Doctors find(@PathVariable("adsoyad") String adsoyad) {
        return repository.findOne(adsoyad);
    }

    @PostMapping(consumes = "application/json")
    public Doctors create(@RequestBody Doctors doctor) {
        return repository.save(doctor);
    }

    @DeleteMapping(path = "/{adsoyad}")
    public void delete(@PathVariable("adsoyad") String adsoyad) {
        repository.delete(adsoyad);
    }

    @PutMapping(path = "/{adsoyad}")
    public Doctors update(@PathVariable("adsoyad") String adsoyad, @RequestBody Doctors doctor) throws BadHttpRequest {
        if (repository.exists(adsoyad)) {
            doctor.setAdsoyad(adsoyad);
            return repository.save(doctor);
        } else {
            throw new BadHttpRequest();
        }
    }
}
