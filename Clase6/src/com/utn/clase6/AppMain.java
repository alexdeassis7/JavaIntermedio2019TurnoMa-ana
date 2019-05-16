package com.utn.clase6;

public class AppMain {

	// Ejercicio 4
	// Escribe una aplicación dónde:
	// • Se cree un objeto de tipo ListaMultimedia de tamaño 10.
	// • Se creen tres películas y se añadan a la lista.
	// • Se muestre la lista por pantalla

	public static void main(String[] args) {

		// int []array = new int [20];
		//
		// try {

		// array[-3] = 24;
		// int b = 0;
		// int resultado = 50 / b;
		//

		// }catch (ArrayIndexOutOfBoundsException e) {
		//
		// System.out.println("error de indice de un array");
		// }
		// catch (ArithmeticException e) {
		// System.out.println("no podes dividir por cero amego");
		// }
		//

		ListaMultimedia lista = new ListaMultimedia(1);
		Pelicula pelicula;
		int posicion;

		lista.add(new Pelicula("duro de matar", "Steve", Formato.dvd, 41, "", ""));
		lista.add(new Pelicula("titanic	", "Steve", Formato.avi, 121, "emiliano	", "Mariana barrios"));
		lista.add(new Pelicula("Tarzan", "tarantino", Formato.mpg, 121, "Cristian", " andrea "));

		System.out.println(lista.toString());
	}

}
