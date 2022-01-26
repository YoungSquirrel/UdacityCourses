package com.udacity.course2.dag_graphql.repository;

import com.udacity.course2.dag_graphql.entity.Dog;
import org.springframework.data.repository.CrudRepository;

public interface DogRepository extends CrudRepository<Dog, Long> {

}
