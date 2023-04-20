package com.example.microservice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;

@Getter
@Entity
@Table(name = "DUMMY_TABLE")
public class DummyEntity {

  @Id
  @Column(name = "DUMMY_ID")
  private String id;

}
