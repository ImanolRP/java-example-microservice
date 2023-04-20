package com.example.microservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DummyServiceImpl implements DummyService {

  @Autowired
  DummyRepository dummyRepositoryImpl;

  @Override
  public String getPlainDummy() {
    return dummyRepositoryImpl.getPlainDummy();
  }

  @Override
  public String getDummyById(String id) {
    return dummyRepositoryImpl.getById(id).getId();
  }

}
