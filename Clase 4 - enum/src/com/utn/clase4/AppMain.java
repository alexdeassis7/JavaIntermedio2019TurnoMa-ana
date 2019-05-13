package com.utn.clase4;

public class AppMain {

	public static void main(String[] args) {
		//ENUM
		/**Un enumerado es una clase "especial "(existe en java y en
		 *  otros leguajes) que limitan la creación de objetos a los
		 *  especificados EXPLICITAMENTE en la implementacion de la clase
		 *  
		 *  -si poseen constructor este obligatoriamente debe ser PRIVATE
		 *  para que nbo se puedan crear nuevos objetos 
		 *   
		 *   -Enum en java es realmente una clase que hereda de la clase 
		 *   java.lang.Enum por ello tiene una serie de metodos heredados 
		 *   de dicha clase por ejemplo:		 *  
		 * */
		Posicion delantero  = Posicion.DELANTERO; //instancia de un enum de la clase posicion
		System.out.println("delantero.name = " +delantero.name());//devuelve un String con el nombre de lla constante (DELANTERO)
		System.out.println("delantero.ordinal = " +delantero.ordinal());//Devuelve un entero con la posicion del 
		//enum segun como esta declarada (3)
		
		
		delantero.values();// devolvera un array que contendra todos los enum
		//recorremos todas las contantes de la enumeración
		for(Posicion p: Posicion.values()) {
			System.out.print(p.toString() + " -- ");
		}
		
		
		//instanciamos objetos futbolista
		//(String nombre, EquiposFutbol equipo, int numeroRemera, Posicion posicion) {
		Futbolista marcelo = new Futbolista("marcelo mistisco ", EquiposFutbol.REAL_MADRID,3, Posicion.DEFENSA);
		Futbolista messi = new Futbolista("Lio messi", EquiposFutbol.BARCELONA, 10 , Posicion.DELANTERO);
		Futbolista tevez = new Futbolista();
		
		System.out.println(marcelo.toString()+ "   ");
		
		System.out.println(messi.toString());
		//System.out.println(tevez.toString());
		
	}

}