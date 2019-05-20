package com.utn.clase7;

public class ExcepNueva {

	
	static void forzarException() {
		
		int nums[] = new int [4];		
		System.out.println("antes del error de array ");
		
	//fuerzo una exception de indice fura de rango		
		nums [12] = 23;		
		System.out.println("estoy despues de hacer la macana!");
		
	}
}
