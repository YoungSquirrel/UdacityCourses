package com.udacity.course2.dag_graphql;

import com.coxautodev.graphql.tools.SchemaParser;
import graphql.execution.AsyncExecutionStrategy;
import graphql.execution.ExecutionStrategy;
import graphql.schema.GraphQLSchema;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class Dog_GraphqlApplication {

  public static void main(String[] args) {
    SpringApplication.run(Dog_GraphqlApplication.class, args);

  }

  
}
