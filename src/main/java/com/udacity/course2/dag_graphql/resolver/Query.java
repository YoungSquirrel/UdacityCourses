package com.udacity.course2.dag_graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.udacity.course2.dag_graphql.entity.Dog;
import com.udacity.course2.dag_graphql.exception.DogNotFoundException;
import com.udacity.course2.dag_graphql.repository.DogRepository;
import java.util.Optional;
import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLQueryResolver {
  private DogRepository dogRepository;

  public Query(DogRepository dogRepository) {
    this.dogRepository = dogRepository;
  }

  public Iterable<Dog> findAllDogs() {
    return dogRepository.findAll();
  }

  public Dog findDogById(Long id) {
    Optional<Dog> optionalDog = dogRepository.findById(id);
    if (optionalDog.isPresent()) {
      return optionalDog.get();
    } else {
      throw new DogNotFoundException("Dog Not Found", id);
    }
  }
}

