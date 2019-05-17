package com.utn.clase7;

public class Disco extends Multimedia{
	
//	Escribe una clase Disco, que herede de la clase Multimedia ya
//	realizada. La clase Disco tiene, aparte de los elementos 
//	heredados, un atributo para almacenar el género al que 
//	pertenece (rock, pop, ópera…). La clase debe tener un método 
//	para obtener el nuevo atributo y debe sobreescribir el método 
//	toString() para que devuelva toda la información.
	private Genero genero ; 
	
	public Disco(String titulo, String autor, double duracion, Formato formato , Genero genero) {
		super(titulo, autor, duracion, formato);
		this.genero = genero ;
	}

	@Override
	public String toString() {
		return "Disco [genero=" + genero + "]";
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	
	
	
	
}
