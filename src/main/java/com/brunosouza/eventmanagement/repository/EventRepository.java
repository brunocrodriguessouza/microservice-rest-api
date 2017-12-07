package com.brunosouza.eventmanagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.brunosouza.eventmanagement.entities.Event;

public interface EventRepository extends CrudRepository<Event, Long> {

}
