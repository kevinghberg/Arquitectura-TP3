package com.example.demo.utils;

import com.example.demo.model.Carrera;
import com.example.demo.model.Estudiante;
import com.example.demo.repository.CarreraRepository;
import com.example.demo.repository.EstudianteRepository;

import lombok.extern.slf4j.Slf4j;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
class LoadDatabase {
	Logger log = Logger.getLogger(LoadDatabase.class.getName());

	@Bean
	CommandLineRunner initDatabase(@Qualifier("carreraRepository") CarreraRepository cr,
			@Qualifier("estudianteRepository") EstudianteRepository er) {
		return args -> {
			er.save(new Estudiante(322, "nombre", "apellido", "ciudadResidencia", 1234, true));
			er.save(new Estudiante(323, "nombre2", "apellido2", "ciudadResidencia1", 12345, true));
			cr.save(new Carrera("tudai"));
			cr.save(new Carrera("t2udai"));
		};
	}

}