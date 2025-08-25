package org.springframework.samples.petclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class PetClinicApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(PetClinicApplication.class, args);
		//Comentario 01
		System.out.println("Comentario 01");
		//Comentario 01
		System.out.println("Comentario 02");
		//Comentario 01-HU01_cesar
		System.out.println("Comentario 01 HU01_cesar");
		//Comentario 01-HU02_dev02
		System.out.println("Comentario 01 HU02_dev02");
	}
}
