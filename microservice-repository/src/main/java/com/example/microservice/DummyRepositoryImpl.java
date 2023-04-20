package com.example.microservice;

public class DummyRepositoryImpl implements DummyRepositoryCustom {

  @Override
  public String getPlainDummy() {
    return "Dummy";
  }

}
