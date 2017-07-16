package com.teammental.authentication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Config sınıfımız.
 */
@SpringBootApplication
public class Application extends WebMvcConfigurerAdapter {

  /**
   * Ana metod.
   * @param args string array
   */
  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

}
