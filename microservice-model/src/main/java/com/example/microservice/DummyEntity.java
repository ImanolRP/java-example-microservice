package com.example.microservice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DUMMY")
public class DummyEntity {

  @Id
  @Column(name = "COL_EXAMPLE")
  private String example;

}
