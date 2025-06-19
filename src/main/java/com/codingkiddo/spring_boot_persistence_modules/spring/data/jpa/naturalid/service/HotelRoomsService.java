package com.codingkiddo.spring_boot_persistence_modules.spring.data.jpa.naturalid.service;

import java.util.Optional;

import org.hibernate.Session;
import org.springframework.stereotype.Service;

import com.codingkiddo.spring_boot_persistence_modules.spring.data.jpa.naturalid.entity.ConferenceRoom;
import com.codingkiddo.spring_boot_persistence_modules.spring.data.jpa.naturalid.entity.GuestRoom;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

@Service
public class HotelRoomsService {

	private EntityManager entityManager;
	
	public HotelRoomsService(EntityManagerFactory entityManagerFactory) {
        this.entityManager = entityManagerFactory.createEntityManager();
    }

	public Optional<ConferenceRoom> conferenceRoom(String name) {
		Session session = entityManager.unwrap(Session.class);
		return session.bySimpleNaturalId(ConferenceRoom.class).loadOptional(name);
	}
	
	public Optional<GuestRoom> guestRoom(int roomNumber, int floor) {
		Session session = entityManager.unwrap(Session.class);
		return session.byNaturalId(GuestRoom.class)
				.using("roomNumber", roomNumber)
				.using("floor", floor)
				.loadOptional();
	}
}
