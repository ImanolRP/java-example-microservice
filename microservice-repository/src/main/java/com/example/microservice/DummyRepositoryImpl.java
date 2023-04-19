package com.example.microservice;

import org.springframework.stereotype.Repository;

@Repository
public class DummyRepositoryImpl implements DummyRepository {

  @Override
  public String getDummy() {
    return "Dummy";
  }

}
