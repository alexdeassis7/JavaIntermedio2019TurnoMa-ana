package com.utn.clase7bis;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class AppMain {
	public static void main(String[] args) {

		Libro harryPotter = new Libro("234", "Harry y la piedra filosofal", 2005);
		Revista life = new Revista("1236", "LIFE", 2019, 5);
		Publicacion ps = new Publicacion("657", "new times", 2017);

		System.out.println(harryPotter.toString());
		harryPotter.prestar();
		System.out.println(harryPotter.toString());
		harryPotter.devolver();
		System.out.println(harryPotter.toString());

		life.toString();
		life.getCodigo();

		System.out.println("COdigo de revista = " + ps.getCodigo());

	}

}
