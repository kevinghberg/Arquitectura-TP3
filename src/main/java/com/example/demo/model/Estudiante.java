package com.example.demo.model;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
public class Estudiante {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEstudiante;

	@Column
	private int dni;

	@Column
	private String nombre;

	@Column
	private String apellido;

	@Column
	private String ciudadResidencia;

	@Column
	private int numLibreta;

	@Column
	private boolean genero;

	public Estudiante() {

	}

	public Estudiante(int dni, String nombre, String apellido, String ciudadResidencia, int numLibreta,
			boolean genero) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.ciudadResidencia = ciudadResidencia;
		this.numLibreta = numLibreta;
		this.genero = genero;
	}

	public int getIdEstudiante() {
		return idEstudiante;
	}

	public void setIdEstudiante(int idEstudiante) {
		this.idEstudiante = idEstudiante;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCiudadResidencia() {
		return ciudadResidencia;
	}

	public void setCiudadResidencia(String ciudadResidencia) {
		this.ciudadResidencia = ciudadResidencia;
	}

	public int getNumLibreta() {
		return numLibreta;
	}

	public void setNumLibreta(int numLibreta) {
		this.numLibreta = numLibreta;
	}

	public boolean isGenero() {
		return genero;
	}

	public void setGenero(boolean genero) {
		this.genero = genero;
	}

}
