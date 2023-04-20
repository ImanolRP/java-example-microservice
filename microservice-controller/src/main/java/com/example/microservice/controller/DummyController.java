package com.example.microservice.controller;

import com.example.microservice.DummyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyController {

  @Autowired
  DummyService dummyServiceImpl;

  @GetMapping("/getPlainDummy")
  @ResponseStatus(HttpStatus.OK)
  public String getPlainDummy() {
    return dummyServiceImpl.getPlainDummy();
  }

  @GetMapping("/getDummyById/{id}")
  @ResponseStatus(HttpStatus.OK)
  public String getDummyById(@PathVariable String id) {
    return dummyServiceImpl.getDummyById(id);
  }

}
