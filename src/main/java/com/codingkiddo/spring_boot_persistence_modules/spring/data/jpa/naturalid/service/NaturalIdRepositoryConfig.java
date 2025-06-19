package com.codingkiddo.spring_boot_persistence_modules.spring.data.jpa.naturalid.service;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.codingkiddo.spring_boot_persistence_modules.spring.data.jpa.naturalid.repository.NaturalIdRepositoryImpl;

@Configuration
@EnableJpaRepositories(repositoryBaseClass = NaturalIdRepositoryImpl.class)
public class NaturalIdRepositoryConfig {

}
