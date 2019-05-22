package com.utn.clase8.relanzarexcepcion;

import java.io.IOException;

public class TrowsDemostracion {

	/**
	 * En algunos casos , si un metodo genera una exception que no maneja , debe
	 * declarar esa Exception en una clausula Throws .
	 * @throws IOException 
	 * 
	 */

	public static int prompt(String args) throws ArithmeticException, IOException {

		System.out.println(args + " : ");
		
		int numero = System.in.read();
		
	int result = numero / 0 ;
		
		return result;
	}

}
