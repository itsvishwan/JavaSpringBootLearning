package com.migration.example.javaspringbootmigration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class JavaspringbootmigrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaspringbootmigrationApplication.class, args);
		//test codewhispherer
	}

}
