package nttdatacenters.spring;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import nttdatacenters.spring.Entities.Client;
import nttdatacenters.spring.Repository.ClientRepository;

@SpringBootApplication
public class App implements CommandLineRunner {

	@Autowired
	ClientRepository clientRepository;

	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		//CREACIÓN DE OBJETOS CLIENTE POR DEFECTO PARA CONSUMIR API RÁPIDAMENTE 
		
		// CREAMOS UN OBJETO CLIENTE
		Client cristian = Client.builder().name("Cristian").lastname("Gonzalez").dni("47343243C")
				.dateBirth(LocalDate.of(1991, 10, 30)).build();

		// CREAMOS OTRO OBJETO CLIENTE
		Client mcarmen = Client.builder().name("Mari Carmen").lastname("Lopez").dni("12121212C")
				.dateBirth(LocalDate.of(1980, 10, 30)).build();

		clientRepository.save(cristian);
		clientRepository.save(mcarmen);
	}

}
