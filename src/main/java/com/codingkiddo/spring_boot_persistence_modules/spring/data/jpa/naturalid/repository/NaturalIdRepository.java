package com.codingkiddo.spring_boot_persistence_modules.spring.data.jpa.naturalid.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface NaturalIdRepository<T, ID> extends JpaRepository<T, ID> {
	Optional<T> naturalId(String id);
}
