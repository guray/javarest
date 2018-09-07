package com.javahelps.restservice.repository;

import com.javahelps.restservice.entity.Event;
import org.springframework.data.repository.CrudRepository;


public interface EventRepository extends CrudRepository<Event, Long> {
}