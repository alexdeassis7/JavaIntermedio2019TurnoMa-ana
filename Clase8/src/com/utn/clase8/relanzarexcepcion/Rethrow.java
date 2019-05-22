package com.utn.clase8.relanzarexcepcion;

public class Rethrow {

	/**
	 * Una rexception capturada por un try cathc se ´puede volver a lanzart para que
	 * pueda se capturada por otro try cathc externo .asi permitimos de esta manera
	 * accceso multiple a otro manejadores de la exception.
	 * 
	 * 
	 */
	public static void generoException() {

		int numerador[] = { 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024 };
		int denominador[] = { 2, 0, 6, 4, 0, 7 };

		for (int i = 0; i < numerador.length; i++) {
			try {
				System.out.println(numerador[i] + " / " + denominador[i] 
						+ " es  " + numerador[i] / denominador[i]);

			} catch (ArithmeticException exc) {
				// capturo la Exception
				System.out.println("No se puede dividir por cero en"
						+ " lo numeros reales ");
			} catch (ArrayIndexOutOfBoundsException exc) {
				// capturo la segunda Exception
				System.out.println("no se pudo encontrar"
						+ " elemento en el Array");
				System.out.println("Mensaje Estándar :");
				System.out.println(exc);
				System.out.println("\n Traza de Errores :");
				exc.printStackTrace();
				
				// Relanzamos la exception
				throw exc;
				
				
				
			}

		}

	}

}
