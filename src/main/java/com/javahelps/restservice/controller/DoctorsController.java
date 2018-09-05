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

    @GetMapping(path = "/{kullaniciadi}")
    public Doctors find(@PathVariable("kullaniciadi") String kullaniciadi) {
        return repository.findOne(kullaniciadi);
    }

    @PostMapping(consumes = "application/json")
    public Doctors create(@RequestBody Doctors doctor) {
        return repository.save(doctor);
    }

    @DeleteMapping(path = "/{kullaniciadi}")
    public void delete(@PathVariable("kullaniciadi") String kullaniciadi) {
        repository.delete(kullaniciadi);
    }

    @PutMapping(path = "/{kullaniciadi}")
    public Doctors update(@PathVariable("kullaniciadi") String kullaniciadi, @RequestBody Doctors doctor) throws BadHttpRequest {
        if (repository.exists(kullaniciadi)) {
            doctor.setKullaniciadi(kullaniciadi);
            return repository.save(doctor);
        } else {
            throw new BadHttpRequest();
        }
    }
}
