package com.phonebook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class PhoneBookApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhoneBookApplication.class, args);
	}

}
