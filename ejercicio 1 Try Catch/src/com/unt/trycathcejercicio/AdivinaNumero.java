package com.unt.trycathcejercicio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AdivinaNumero {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int numeroAdivinar = (int) (Math.random() * 50);

		int numero = 0;
		int intentos = 0;

		do {
			boolean leido;

			do {

				System.out.println("ingrese un numero entre 1 y 500");

				try {

					intentos++;
					numero = teclado.nextInt();
					System.out.println("introuciste el numero : " + numero);
					leido = true;
				} catch (InputMismatchException e) {
					System.out.println("no introduciste un numero integer");
					teclado.next();
					leido = false;
				}
			} while (leido == false);
			if (numero > numeroAdivinar) {
				System.out.println("ingreso un numero menor ,continue intentando");
			}
			if (numero < numeroAdivinar) {
				System.out.println("el numero es mayor , intenta de nuevo");
			}
		} while (numero != numeroAdivinar);
		System.out.println("CONGRATULATIONS , ACERTASTE , ");
		System.out.println("el numero es : " + numeroAdivinar);
		System.err.println("te llevo " + intentos + " intentos");

	}

}
