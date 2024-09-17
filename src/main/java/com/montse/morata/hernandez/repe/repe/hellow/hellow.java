package com.montse.morata.hernandez.repe.repe.hellow;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.montse.morata.hernandez.repe.repe.entity.Persona;

@RestController
public class hellow {
	@Autowired
	Persona persona;
	//Persona objPersona;
	//Persona objPersona2;
	//Persona objPersona3;
	List listaPersona= null;
	
	@GetMapping("/saludar")
	public List<Persona> saludar(){
		
		//objPersona = new Persona("Paco","Morales","50859719A","p@gmail.com",654112452);
		//objPersona2 = new Persona("Angustias","Morales","50859720A","am@gmail.com",654112455);
		//objPersona3 = new Persona("Domitila","Piedritas","27859719A","ladomi@gmail.com",66010249);
		listaPersona= new ArrayList<>();
		persona.setNombre("Espinete");
		persona.setApellido("Gordete");
		persona.setDni("51478478a");
		persona.setEmail("espinete@barriosesamo.com");
		persona.setTelefono(5513248);
		listaPersona.add(persona);
		//listaPersona.add(bjPersona);
		//listaPersona.add(objPersona2);		
		//listaPersona.add(objPersona3);
		return listaPersona;
		
	}

}
