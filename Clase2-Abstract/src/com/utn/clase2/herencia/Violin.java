package com.utn.clase2.herencia;

public class Violin extends Instrumento {

	public Violin() {
		tipo = "violinnnnnnnnnnn";
	}

	//implementamos metodo heredados de la clase padre instrumento
	@Override
	public void tocar() {
		System.out.println("estoy tocando un Violin");

	}

}
