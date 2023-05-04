
package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Carrera;
import com.example.demo.model.Estudiante;

public interface CarreraRepository  extends JpaRepository<Carrera, Long> {


}
