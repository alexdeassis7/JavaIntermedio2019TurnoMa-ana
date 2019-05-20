package com.utn.clase7;

//try Anidado
public class App {

	public static void main(String[] args) {
		int num[] = { 1, 4, 6, 8, 9, 234, 256, 512 };
		int denominador[] = { 2, 0, 6, 4, 0, 8 };
		try {// try externo
			for (int i = 0; i < num.length; i++) {
				// try interno
				try {
					System.out.println(num[i] + " / " + denominador[i] + " es " + num[i] / denominador[i]);
				} catch (ArithmeticException e) {
					// capturando la Exception
					System.out.println("No se puede dividir por cero AMEGO");
				}
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ocurrió un error ");
			System.out.println("ERROR : Programa terminado");
		}

	}

}
