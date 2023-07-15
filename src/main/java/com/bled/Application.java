package com.bled;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	TutorialController tc;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}

	@Override
	public void run(String... args) {
		tc.getAllTutorials().forEach(System.out::println);
		Scanner sc = new Scanner(System.in);
		String response = sc.nextLine();
	}

}


