package com.utn.clase3;

public class MainApp {

	public static void main(String[] args) {
		
//		VueloCarga vc = new VueloCarga();
//		vc.agregarPaquete(1000, 200, 3000);
		
		Passenger emiliano = new Passenger(5,"emi");
		Passenger martin = new Passenger(3,"matincho");
		Passenger alex = new Passenger(1, "ALex");
		
//		vc.agregarPasajero(martin);
//
//		vc.agregarPasajero(emiliano);
		
		Passenger[] pasajeros = new Passenger[4];
		
		pasajeros[0]= emiliano;
		pasajeros[1]= martin;
		pasajeros[2] = alex;
		Passenger.mostrarListaDePasajeros(pasajeros);

	}

}
