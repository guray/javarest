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

    @GetMapping(path = "/{kimlikno}")
    public Hastalar find(@PathVariable("kimlikno") String kimlikno) {
        return repository.findOne(kimlikno);
    }

    @PostMapping(consumes = "application/json")
    public Hastalar create(@RequestBody Hastalar hasta) {
        return repository.save(hasta);
    }

    @DeleteMapping(path = "/{kimlikno}")
    public void delete(@PathVariable("kimlikno") String kimlikno) {
        repository.delete(kimlikno);
    }

    @PutMapping(path = "/{kimlikno}")
    public Hastalar update(@PathVariable("kimlikno") String kimlikno, @RequestBody Hastalar hasta) throws BadHttpRequest {
        if (repository.exists(kimlikno)) {
            hasta.setKimlikno(kimlikno);
            return repository.save(hasta);
        } else {
            throw new BadHttpRequest();
        }
    }
}
