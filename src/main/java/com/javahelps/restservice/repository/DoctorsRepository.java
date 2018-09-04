package com.javahelps.restservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.javahelps.restservice.entity.Doctors;

@RepositoryRestResource(exported = false)
public interface DoctorsRepository extends JpaRepository<Doctors, String>{

}

