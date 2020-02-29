package com.lukaszbezlada;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class AstronomicalObjectsApplication {

    public static void main(String[] args) {
        SpringApplication.run(AstronomicalObjectsApplication.class, args);
    }

}
