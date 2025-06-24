package com.codingkiddo.spring_boot_persistence_modules.spring.data.jpa.naturalid.repository;

import java.io.Serializable;
import java.util.Optional;

import org.hibernate.Session;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import jakarta.persistence.EntityManager;

public class NaturalIdRepositoryImpl<T, ID extends Serializable> extends SimpleJpaRepository<T, ID> implements NaturalIdRepository<T, ID> {

	private final EntityManager entityManager;

	public NaturalIdRepositoryImpl(JpaEntityInformation<T, ?> entityInformation, EntityManager entityManager) {
		super(entityInformation, entityManager);
		this.entityManager = entityManager;
	} 

	@Override
    public Optional<T> naturalId(String naturalId) {
        return entityManager.unwrap(Session.class)
            .bySimpleNaturalId(this.getDomainClass())
            .loadOptional(naturalId);
    }
}
