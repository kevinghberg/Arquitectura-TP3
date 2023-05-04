
package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.Estudiante;
import com.example.demo.repository.EstudianteRepository;

@RestController
@RequestMapping("estudiantes") //barra estudiantes barra

public class EstudianteController {
	
	@Qualifier("estudianteRepository")// permite especificar el nombre del bean(componente) que se va a inyectar en el atributo
	@Autowired // realiza la inyección de dependencias y no es necesario instanciarla
	
	private EstudianteRepository repository;

	//constructor
	public EstudianteController(@Qualifier("estudianteRepository") EstudianteRepository estudiante) {
		this.repository = estudiante;
	}
		
	// A) dar de alta un estudiante
	
	/*@PostMapping("/")
    public Estudiante nuevoEstudiante(@RequestBody Estudiante e) { // @RequestBody son los datos que se envian en el cuerpo de la petición utilizando HTTP POST
        return repository.save(e);
    }*/
	
	@GetMapping("/")
	public Iterable<Estudiante> getEstudiantes(){
		return repository.findAll();
	}
	
	@GetMapping("/nombre/{nombre}")
	public Iterable<Estudiante> getEstudiantesPorNombre(@PathVariable String nombre){
		return repository.buscarTodosPorNombre(nombre);
	}

}
