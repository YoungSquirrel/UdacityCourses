package com.udacity.course2.dag_graphql.exception;

import graphql.ErrorType;
import graphql.GraphQLError;
import graphql.language.SourceLocation;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BreedNotFoundException extends RuntimeException implements GraphQLError {
  private HashMap<String, Object> extensions = new HashMap<>();

  public BreedNotFoundException(String message, String invalidBreed) {
    super(message);
    extensions.put("invalidDogBreed", invalidBreed);
  }

  @Override
  public List<SourceLocation> getLocations() {
    return null;
  }

  @Override
  public Map<String, Object> getExtensions() {
    return extensions;
  }
  @Override
  public ErrorType getErrorType() {
    return ErrorType.DataFetchingException;
  }
}
