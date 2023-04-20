package com.example.microservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DummyRepository
    extends JpaRepository<DummyEntity, String>, DummyRepositoryCustom {

}
