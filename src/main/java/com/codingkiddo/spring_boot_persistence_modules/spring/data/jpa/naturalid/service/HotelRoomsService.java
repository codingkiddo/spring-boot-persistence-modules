package com.codingkiddo.spring_boot_persistence_modules.spring.data.jpa.naturalid.service;

import org.springframework.stereotype.Service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

@Service
public class HotelRoomsService {

	private EntityManager entityManager;
	
	public HotelRoomsService(EntityManagerFactory entityManagerFactory) {
        this.entityManager = entityManagerFactory.createEntityManager();
    }

	
}
