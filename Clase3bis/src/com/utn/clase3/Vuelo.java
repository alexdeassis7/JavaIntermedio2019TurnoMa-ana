package com.utn.clase3;

//Clase Padre o clase base
public class Vuelo {

	public int numVuelo;
	public int pasajeros;
	public char claseVuelo;
	public boolean[] asientosDisponibles;

	// Inicializador de Bloque
	//es un bloque sin nombre
	//se debe declarar antes de los constructores
	//sera utilizados por todos mis constructores
	{
		asientosDisponibles = new boolean[150];
		for(int i = 0 ; i < getAsiento() ; i++) {
			
		asientosDisponibles[i] = true;
			
		}
	}

	public int getAsientos() {
		return getAsiento();
	}

	public int getAsiento() {
		return 150;

	}

	// constructor vacio
	public Vuelo() {

	}
	//constructor 1 SOBRECARGA
	public Vuelo(char claseVuelo) {

		this.claseVuelo = claseVuelo;

	}
	//constructor 2 SOBRECARGA
	public Vuelo(int numVuelo) {
		this.numVuelo = numVuelo;
	}
	
	public void agregarPasajero(Passenger p1) {
		if(asientoDisponible()) {
			pasajeros += 1;
			System.out.println("Esta arriba de Fligth "+p1.getName());
		}else {
			FaltaAsiento();
		}
		
	}
	private boolean asientoDisponible() {
		//valido que el numero de pasajeros sean menos que los asientos
		return pasajeros < getAsiento();
	}
	
	private void FaltaAsiento() {
		
		System.out.println("YA NO QUEDAN ASIENTOS busque otra aerolinea amego");
		
	}
	
}
