package com.utn.clase8.relanzarexcepcion;


//Creo mi propia exception que hereda de RuntimeException
public class MiException extends RuntimeException {

	
	public String getMessage() {
		
		return "esta es mi propia ecepcion";
	}
}
