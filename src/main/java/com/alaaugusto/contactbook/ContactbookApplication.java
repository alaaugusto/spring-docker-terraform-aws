package com.alaaugusto.contactbook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ContactbookApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContactbookApplication.class, args);
	}

}
