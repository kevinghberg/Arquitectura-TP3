package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Estudiante;

public interface EstudianteRepository  extends JpaRepository<Estudiante, Long> {
	
	@Query ("SELECT e FROM Estudiante e where e.nombre = :nombre")
	public List<Estudiante> buscarTodosPorNombre(String nombre);
}
