package io.github.junrdev.minipos;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MiniposApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiniposApplication.class, args);
	}

	public CommandLineRunner runner(){
		return args -> {

        };
    }
}
