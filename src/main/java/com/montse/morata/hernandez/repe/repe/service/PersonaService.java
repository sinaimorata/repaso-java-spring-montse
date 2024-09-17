package com.montse.morata.hernandez.repe.repe.service;

import java.util.List;

import com.montse.morata.hernandez.repe.repe.entity.Persona;


//sirve para definir los métodos que vamos a tener
public interface PersonaService {
	//aquí van metodos abstractos(yo se lo q tiene q devolver, pr no esta definido)
	//metodo que devuelva listado objetos persona
	List <Persona> listaPersona();
	
	//método que insertar
	void insertarPersona();
	
}
