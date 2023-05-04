package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Carrera;
import com.example.demo.repository.CarreraRepository;

@RestController
@RequestMapping("carreras")

public class CarreraController {

	@Qualifier("carreraRepository")
	@Autowired

	private CarreraRepository repository;

	public CarreraController(@Qualifier("carreraRepository") CarreraRepository carrera) {
		this.repository = carrera;
	}

	@GetMapping("/")
	public Iterable<Carrera> getCarrera(){
		return repository.findAll();
	}
}
