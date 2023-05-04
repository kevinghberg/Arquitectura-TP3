package com.example.demo.controller;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Carrera;
import com.example.demo.model.Estudiante;
import com.example.demo.model.Carrera_Estudiante;
import com.example.demo.repository.CarreraRepository;
import com.example.demo.repository.Carrera_Estudiante_Repository;
import com.example.demo.repository.EstudianteRepository;

@RestController
@RequestMapping("relaciones")
public class Carrera_Estudiante_Controller {

	@Qualifier("carreraEstudianteRepository")
	@Autowired

	private Carrera_Estudiante_Repository repository;
	private CarreraRepository carreraRepository;
	private EstudianteRepository estudianteRepository;

	public Carrera_Estudiante_Controller(
			@Qualifier("carreraEstudianteRepository") Carrera_Estudiante_Repository relacion) {
		this.repository = relacion;
	}

	// b) matricular un estudiante en una carrera

	@PostMapping("/")
	public Carrera_Estudiante nuevoEstudiante(@RequestBody long idEstudiante, @RequestBody long idCarrera,
			@RequestBody boolean graduado, @RequestBody LocalDate fechaIngreso) {
		Carrera c = carreraRepository.getOne(idCarrera);
		Estudiante e = estudianteRepository.getOne(idEstudiante);
		return repository.save(new Carrera_Estudiante(c, e, graduado, fechaIngreso));
	}

}
