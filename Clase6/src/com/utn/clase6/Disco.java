package com.utn.clase6;
//
//
//Ejercicios 5
//Escribe una clase Disco, que herede de la clase Multimedia ya realizada. 
//La clase Disco tiene, aparte de los elementos heredados, un atributo para almacenar el género al que pertenece (rock, pop, ópera…). 
//La clase debe tener un método para obtener el nuevo atributo y debe sobreescribir el método toString() para que devuelva toda la información.

public class Disco extends Multimedia {

	private Genero genero;

	public Disco(String titulo, String autor, Formato formato, double duracion, Genero g) {
		super(titulo, autor, formato, duracion);
		this.genero = g;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public String toString() {
		return super.toString() + "\n Genero: " + genero;
	}
}
