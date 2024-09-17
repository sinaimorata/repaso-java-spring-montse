package com.montse.morata.hernandez.repe.repe.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.montse.morata.hernandez.repe.repe.entity.Persona;
import com.montse.morata.hernandez.repe.repe.service.PersonaService;


@Service
public class PersonaServiceImpl implements PersonaService {
	//injecto el objeto persona
	@Autowired
	Persona persona;
	
	//declaro una lista de persona
	List<Persona> lista = new ArrayList<>();
	
	Persona objPersona;
	Persona objPersona2;
	Persona objPersona3;
	
	@Override
	public List<Persona> listaPersona(){
		  	if(lista.size() ==0){
			  objPersona = new Persona("Paco","Morales","50859719A","p@gmail.com",654112452);
			  objPersona2 = new Persona("Angustias","Morales","50859720A","am@gmail.com",654112455);
			  objPersona3 = new Persona("Domitila","Piedritas","27859719A","ladomi@gmail.com",66010249);
			  lista.add(objPersona);
			  lista.add(objPersona2);
			  lista.add(objPersona2);
		  	}
			  return lista;
	}
		
	
	

	@Override
	public void insertarPersona() {
		persona.setNombre("Draco");
		persona.setApellido("Contador");
		persona.setEmail("draco@barriosesamo.com");
		persona.setDni("00456789a");
		persona.setTelefono(915527799);
		lista.add(persona);
	}




}
