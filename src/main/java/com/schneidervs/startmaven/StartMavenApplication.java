package com.schneidervs.startmaven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StartMavenApplication {

    public static void main(String[] args) {
        SpringApplication.run(StartMavenApplication.class, args);
        System.out.println("Hello maven!");
    }
}
