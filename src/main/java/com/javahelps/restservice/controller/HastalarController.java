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

import com.javahelps.restservice.entity.Hastalar;
import com.javahelps.restservice.repository.HastalarRepository;
import javassist.tools.web.BadHttpRequest;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(path = "/hastalar")
public class HastalarController {
	@Autowired
    private HastalarRepository repository;

    @GetMapping
    public Iterable<Hastalar> findAll() {
        return repository.findAll();
    }

    @GetMapping(path = "/{adsoyad}")
    public Hastalar find(@PathVariable("adsoyad") String adsoyad) {
        return repository.findOne(adsoyad);
    }

    @PostMapping(consumes = "application/json")
    public Hastalar create(@RequestBody Hastalar hasta) {
        return repository.save(hasta);
    }

    @DeleteMapping(path = "/{adsoyad}")
    public void delete(@PathVariable("adsoyad") String adsoyad) {
        repository.delete(adsoyad);
    }

    @PutMapping(path = "/{adsoyad}")
    public Hastalar update(@PathVariable("adsoyad") String adsoyad, @RequestBody Hastalar hasta) throws BadHttpRequest {
        if (repository.exists(adsoyad)) {
            hasta.setAdsoyad(adsoyad);
            return repository.save(hasta);
        } else {
            throw new BadHttpRequest();
        }
    }
}
