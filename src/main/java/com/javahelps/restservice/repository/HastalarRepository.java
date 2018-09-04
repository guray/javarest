package com.javahelps.restservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.javahelps.restservice.entity.Hastalar;

@RepositoryRestResource(exported = false)
public interface HastalarRepository extends JpaRepository<Hastalar, String>{

}