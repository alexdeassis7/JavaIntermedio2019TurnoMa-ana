package com.utn.clase7bis;

public class Libro extends Publicacion implements Prestable{
	
	private boolean prestado;

	public Libro(String codigo, String titulo, int anio) {
		super(codigo, titulo, anio);
		this.prestado = false;
	}

	@Override
	public void prestar() {
		
		System.out.println("se presto el libro ");
		prestado = true;
		
	}

	@Override
	public void devolver() {
		
		System.out.println("se devolvio el libro ");
		prestado = false;
		
	}

	@Override
	public boolean prestado() {
		
		return prestado;
	}

	@Override
	public String toString() {
		return "Libro [prestado=" + prestado + "]";
	}
	
	
//	 Interface - Escribe un programa para una biblioteca que contenga 
//	 libros y revistas.
//	 •	Las características comunes que se almacenan tanto para las 
//	 revistas como para los libros son el código, el título, y el año
//	 de publicación. Estas tres características se pasan por parámetro 
//	 en el momento de crear los objetos.
//	 •	Los libros tienen además un atributo prestado. Los libros, 
//	 cuando se crean, no están prestados.
//	 •	Las revistas tienen un número. En el momento de crear. En el
//	 momento de crear las revistas se pasa el número por parámetro.
//	 •	Tanto las revistas como los libros deben tener (aparte de los
//			 constructores) un método toString() que devuelve el 
//alor de todos los atributos en una cadena de caracteres. 
//También tienen un método que devuelve el año de publicación, 
//y otro el código.
//	 •	Para prevenir posibles cambios en el programa se tiene 
//	 que implementar una interfaz Prestable con los métodos prestar()
//	 ,devolver() y prestado. La clase Libro implementa esta interfaz
	
	
}
