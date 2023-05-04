package com.example.demo.repository;
import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Carrera;
import com.example.demo.model.Carrera_Estudiante;
import com.example.demo.model.Estudiante;

public interface Carrera_Estudiante_Repository extends JpaRepository<Carrera_Estudiante, Long> {

}
