package com.codingkiddo.spring_boot_persistence_modules.spring.data.jpa.naturalid.repository;

import org.springframework.stereotype.Repository;

import com.codingkiddo.spring_boot_persistence_modules.spring.data.jpa.naturalid.entity.ConferenceRoom;

@Repository
public interface ConferenceRoomRepository extends NaturalIdRepository<ConferenceRoom, Long> {

}
