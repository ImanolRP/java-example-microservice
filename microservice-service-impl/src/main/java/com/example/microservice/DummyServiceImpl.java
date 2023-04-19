package com.example.microservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DummyServiceImpl implements DummyService {

  @Autowired
  DummyRepository dummyRepositoryImpl;

  @Override
  public String getDummy() {
    return dummyRepositoryImpl.getDummy();
  }

}
