package com.pw.wispne.iniesta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@EnableConfigurationProperties
public class IniestaApplication {

	public static void main(String[] args) {
		SpringApplication.run(IniestaApplication.class, args);
	}

}
