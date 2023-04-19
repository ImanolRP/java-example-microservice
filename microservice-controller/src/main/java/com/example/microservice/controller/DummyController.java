package com.example.microservice.controller;

import com.example.microservice.DummyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyController {

  @Autowired
  DummyService dummyServiceImpl;

  @GetMapping("/dummy")
  public String dummy() {
    return dummyServiceImpl.getDummy();
  }

}
