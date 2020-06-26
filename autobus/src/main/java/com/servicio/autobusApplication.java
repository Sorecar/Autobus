package com.servicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.servicio", "com.servicio.REST"})
public class autobusApplication {

	public static void main(String[] args) {
		SpringApplication.run(autobusApplication.class, args);
	}

}
