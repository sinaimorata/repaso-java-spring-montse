package com.montse.morata.hernandez.repe.repe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.montse.morata.hernandez.repe.repe.entity.Persona;
import com.montse.morata.hernandez.repe.repe.service.PersonaService;




@RestController
public class PersonaController {
	@Autowired
	//se llama a la interfaz, personaService es un objeto de PersonaService
	private PersonaService personaService;
	
	// Esta nota siempre va sobre
	//1mét. publico
	@GetMapping("/personas")
	public List<Persona> listado(){
		
		//List<Persona> lista = personaService.listaPersona(); listaPersona es un metodo del objeto personaService.
		//return lista;
		return personaService.listaPersona();
	}
	
	@GetMapping("/newpersona")
	public String insert() {
		personaService.insertarPersona();
		
		return "Persona insertada";
	}

}
