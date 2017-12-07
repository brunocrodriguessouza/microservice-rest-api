package com.brunosouza.eventmanagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.brunosouza.eventmanagement.entities.Venue;

public interface VenueRepository extends CrudRepository<Venue, Long> {

}
