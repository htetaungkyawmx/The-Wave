package com.solt.thewave;

import com.solt.thewave.entities.Users;
import com.solt.thewave.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TheWaveApplication {

    public static void main(String[] args) {
        SpringApplication.run(TheWaveApplication.class, args);
    }
    @Bean
    public CommandLineRunner demo(UserRepository repo) {
        return (args) -> {
            Users user1 = new Users("user", "$2a$06$3jYRJrg0ghaaypjZ/.g4SethoeA51ph3UD4kZi9oPkeMTpjKU5uo6", "USER");
            Users user2 = new Users("admin", "$2a$08$bCCcGjB03eulCWt3CY0AZew2rVzXFyouUolL5dkL/pBgFkUH9O4J2", "ADMIN");
            repo.save(user1);
            repo.save(user2);
        };
    }
}