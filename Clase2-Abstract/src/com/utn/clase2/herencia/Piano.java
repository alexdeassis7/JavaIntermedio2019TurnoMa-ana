package com.utn.clase2.herencia;

public class Piano extends Instrumento {

	public Piano() {
		tipo = "pianoooo";

	}

	//implementamos metodo heredados de la clase padre instrumento
	@Override
	public void tocar() {
		System.out.println("estoy tocando el piano");

	}

}
