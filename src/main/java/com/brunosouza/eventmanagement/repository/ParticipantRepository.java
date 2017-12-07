package com.brunosouza.eventmanagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.brunosouza.eventmanagement.entities.Participant;

public interface ParticipantRepository extends CrudRepository<Participant, Long> {

}
