package com.javahelps.restservice.repository;

//import org.springframework.data.repository.CrudRepository;

//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.javahelps.restservice.entity.Resource;

import org.springframework.data.repository.CrudRepository;

public interface ResourceRepository extends CrudRepository<Resource, Long> {
}