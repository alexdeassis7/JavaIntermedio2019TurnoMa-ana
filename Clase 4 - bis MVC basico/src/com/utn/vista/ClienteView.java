package com.utn.vista;

public class ClienteView {

	public void imprimirDatos(int id, String nombre, String apellido, int dni) {

		System.out.println("ESTOY EN CLIENTE VISTA");
		System.out.println("DATOS DEL CLIENTE");
		System.out.println("ID : " + id);
		System.out.println("Nombre : " + nombre);
		System.out.println("Apellido :" + apellido);
		System.out.println("dni : " + dni);
		
	}
}
