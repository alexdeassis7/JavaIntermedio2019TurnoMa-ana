package com.utn.clase6;

//Ejercicio2
//2) Escribe una clase Película que herede de la clase Multimedia anterior. La clase Película tiene, además de los atributos 
//heredados, un actor principal y una actriz principal. Se permite que uno de los dos sea nulo, pero no los dos.
//La clase debe tener dos métodos para obtener los nuevos atributos y debe sobreescribir el método toString() para
//reflejar la nueva información.
//

public class Pelicula extends Multimedia {

	private String actorPrincipal;
	private String actrizPrincipal;

	public Pelicula(String titulo, String autor, Formato formato, double duracion, String actor, String actriz) {
		// invoco al constructor de la clase Multimedia
		super(titulo, autor, formato, duracion);
		if (actor == null && actriz == null) {
			throw new IllegalArgumentException("Tiene los parametros vacios");

		}
		actorPrincipal = actor;
		actrizPrincipal = actriz;

	}

	public String getActorPrincipal() {
		return actorPrincipal;
	}

	public void setActorPrincipal(String actorPrincipal) {
		this.actorPrincipal = actorPrincipal;
	}

	public String getActrizPrincipal() {
		return actrizPrincipal;
	}

	public void setActrizPrincipal(String actrizPrincipal) {
		this.actrizPrincipal = actrizPrincipal;
	}

	public String toString() {
		String s = "Protagonizado por : ";
		s += actrizPrincipal;
		return super.toString() + s;

	}

}
