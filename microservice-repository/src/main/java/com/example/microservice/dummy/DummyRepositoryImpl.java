package com.example.microservice.dummy;

public class DummyRepositoryImpl implements DummyRepositoryCustom {

  @Override
  public String getPlainDummy() {
    return "Dummy";
  }

}
