package com.utn.clase3;

public class MainApp {

	public static void main(String[] args) {
		
		VueloCarga vc = new VueloCarga();
//		vc.agregarPaquete(1000, 200, 3000);
		
		Passenger emiliano = new Passenger(5,"emi");
		Passenger martin = new Passenger(3,"matincho");
		Passenger alex = new Passenger(1, "ALex");
		Passenger joaquin = new Passenger(2, "Joaqoooo");
		Passenger papaleo = new Passenger(2, "papaleo");
		vc.agregarPasajero(martin);
//
		vc.agregarPasajero(emiliano);
		//supongamos que tenemos una flota o una serie de 
		//vuelos en el dia y tiene espacio 
		//para cuatro vuelos
		
		//me creo un array de vuelos y le asigno una
		//referencia a la clase padre VUELO
		Vuelo[] flota  = new Vuelo[4];
		
		flota[0] = new Vuelo();
		flota[1]  = new VueloCarga();
		flota[2] = new Vuelo();
		flota[3]  = new VueloCarga();
		
		//VueloCarga p =  new Vuelo(); NO SE PUEDE 
		//Vuelo j = new VueloCarga();
		
		System.out.println(flota[2].getAsientos());
		System.out.println(flota[3].getAsientos());
		flota[2].agregarPasajero(alex);
		flota[2].agregarPasajero(martin);
		flota[2].agregarPasajero(emiliano);
		flota[2].agregarPasajero(joaquin);
		flota[2].agregarPasajero(papaleo);
		
		
		//Object o = new Vuelo();
		
		
		Object [] o1 =  new Object[3];
		o1[0] = new Vuelo();
		o1[1] = new Passenger();
		o1[2] = new VueloCarga();
		
	}

}
