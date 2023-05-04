package com.example.demo.model;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
public class Carrera {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCarrera;

	@Column
	private String nombre;

	public Carrera() {

	}

	public Carrera(String nombre) {
		super();
		this.nombre = nombre;
	}

	public int getIdCarrera() {
		return idCarrera;
	}

	public void setIdCarrera(int idCarrera) {
		this.idCarrera = idCarrera;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
