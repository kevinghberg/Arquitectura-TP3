package com.example.demo.model;

import java.time.LocalDate;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
public class Carrera_Estudiante {

	@EmbeddedId
	private Carrera_Estudiante_PK id = new Carrera_Estudiante_PK();;

	@ManyToOne
	@MapsId("idEstudiante")
	@JoinColumn(name = "idEstudiante")
	private Estudiante estudiante;

	@ManyToOne
	@MapsId("idCarrera")
	@JoinColumn(name = "idCarrera")
	private Carrera carrera;

	public boolean graduado = false;

	public LocalDate fechaIngreso;

	public Carrera_Estudiante() {
	};

	public Carrera_Estudiante(Carrera carrera, Estudiante estudiante, boolean graduado, LocalDate localDate) {
		this.estudiante = estudiante;
		this.carrera = carrera;
		this.graduado = graduado;
		this.fechaIngreso = localDate;
	}



}