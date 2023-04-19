package com.example.microservice;

import org.springframework.stereotype.Service;

@Service("dummyServiceImpl")
public class DummyServiceImpl implements DummyService {

  @Override
  public String getDummy() {
    return "Dummy";
  }

}
