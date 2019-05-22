package com.utn.clase8.relanzarexcepcion;

import java.io.IOException;

public class MainRethrowDemostracion {

	public static void main(String[] args) {
		//
		// try {
		// Rethrow.generoException();
		//
		// }catch(ArrayIndexOutOfBoundsException exc)
		// { //recapturamos la Exception
		//
		// System.out.println("ERROR - "
		// + "Capturado en el main - FIN DEL PROGRAMA");
		//
		// }

		// for(int i = 0 ; i <3 ; i++) {
		//
		// UseDeFinally.generoError(i);
		// System.out.println("Estoy en el main!");
		//
		// }
		//

		int p ;

//		try {

			// dado que propt() podria arrojar una exception,
			// toda llamada a este metodo debera estar dentro de un
			// bloque try
			 
				try {
					p = TrowsDemostracion.prompt("ingrese numero");
					
				} catch (ArithmeticException | IOException e) {
					
					System.out.println("capture la exception");
					e.printStackTrace();
				}
			
//		} catch (IOException e) {
//			System.out.println("Ocurrio una exception de E/S");
//		p = 0;
//			e.printStackTrace();
//		}
//		System.out.println("Usted presiono la tecla " + p);

	}

}
