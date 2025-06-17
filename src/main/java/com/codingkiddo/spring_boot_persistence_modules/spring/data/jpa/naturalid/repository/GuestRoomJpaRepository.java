package com.codingkiddo.spring_boot_persistence_modules.spring.data.jpa.naturalid.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codingkiddo.spring_boot_persistence_modules.spring.data.jpa.naturalid.entity.GuestRoom;

@Repository
public interface GuestRoomJpaRepository extends JpaRepository<GuestRoom, Long> {

}
