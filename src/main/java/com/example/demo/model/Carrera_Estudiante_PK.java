package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.*;

import lombok.Data;

@SuppressWarnings("serial")
@Embeddable
@Data
public class Carrera_Estudiante_PK implements Serializable{

	private int idEstudiante;
	
	private int idCarrera;
	
	public Carrera_Estudiante_PK(int idEstudiante, int idCarrera) {
		super();
		this.setIdEstudiante(idEstudiante);
		this.setIdCarrera(idCarrera);
	}
	
	public Carrera_Estudiante_PK() {}

	public int getIdEstudiante() {
		return idEstudiante;
	}

	public void setIdEstudiante(int idEstudiante) {
		this.idEstudiante = idEstudiante;
	}

	public int getIdCarrera() {
		return idCarrera;
	}

	public void setIdCarrera(int idCarrera) {
		this.idCarrera = idCarrera;
	};

}