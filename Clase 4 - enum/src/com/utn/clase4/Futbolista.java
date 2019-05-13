package com.utn.clase4;

public class Futbolista {

	
	private String nombre;
	private EquiposFutbol equipo ;
	private int numeroRemera;
	private Posicion posicion;
	
	public Futbolista() {
		
	}

	public Futbolista(String nombre, EquiposFutbol equipo, int numeroRemera, Posicion posicion) {
		this.nombre = nombre;
		this.equipo = equipo;
		this.numeroRemera = numeroRemera;
		this.posicion = posicion;
	}
	//Metodos getters y Setters
	@Override
	public String toString() {
		return this.numeroRemera + " " + this.nombre + " " + this.posicion + " " + this.equipo.getNombreDelClub() ;
	}
	
	
	
}
