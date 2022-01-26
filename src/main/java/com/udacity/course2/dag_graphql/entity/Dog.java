package com.udacity.course2.dag_graphql.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dog {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String name;
  private String breed;
  private String origin;

  public Dog(Long id, String name, String breed, String origin) {
    this.id = id;
    this.name = name;
    this.breed = breed;
    this.origin = origin;
  }

  public Dog(String name, String breed) {
    this.name = name;
    this.breed = breed;
  }

  public Dog() {
  }

  public Long getId() {
    return id;
  }

  public Dog setId(Long id) {
    this.id = id;
    return this;
  }

  public String getName() {
    return name;
  }

  public Dog setName(String name) {
    this.name = name;
    return this;
  }

  public String getBreed() {
    return breed;
  }

  public Dog setBreed(String breed) {
    this.breed = breed;
    return this;
  }

  public String getOrigin() {
    return origin;
  }

  public Dog setOrigin(String origin) {
    this.origin = origin;
    return this;
  }
}
