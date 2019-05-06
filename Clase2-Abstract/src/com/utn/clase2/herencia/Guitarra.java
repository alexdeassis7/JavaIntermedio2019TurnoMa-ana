package com.utn.clase2.herencia;

/** Clase concreta Guitarra , hija de Instrumento */
public class Guitarra extends Instrumento {

	public Guitarra() {
		tipo = "Guitarra";
	}

	//metodo propio de la clase hijo
	public void musica() {
		System.out.println("musiqueando");
	}
	
	//implementamos metodo heredados de la clase padre instrumento
	@Override
	public void tocar() {

		System.out.println("Estoy tocando La Guitar man!");

	}

}
