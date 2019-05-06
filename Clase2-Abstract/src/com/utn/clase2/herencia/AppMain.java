package com.utn.clase2.herencia;

public class AppMain {

	public static void main(String[] args) {
		//Objeto miGuitarra de tipo Instrumento
		
		Instrumento miGuitarra = new Guitarra();
		System.out.println("Instrumento : " + miGuitarra.tipo);
		miGuitarra.tocar();
		
		
		//objeto miViolin de tipo Instrumento
		Instrumento miViolin = new Violin();
		System.out.println("Instrumento : " + miViolin.tipo);
		miViolin.tocar();
	
		
		//objeto  mipiano de tipo instrumento
		
		Instrumento miPiano = new Piano();
		System.out.println("Instrumento : " + miPiano.tipo);
		miPiano.tocar();	
			
		
		
		
		
		
		
	}

}
