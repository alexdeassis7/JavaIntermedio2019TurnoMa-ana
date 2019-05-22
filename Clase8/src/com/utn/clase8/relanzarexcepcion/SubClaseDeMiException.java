package com.utn.clase8.relanzarexcepcion;


//creo mi propia Sub-Exception que hereda de mi otra exception custom

public class SubClaseDeMiException extends MiException {

	public String getMessage() {
		
		return "esta es mi exception hija";
	}
	
}
