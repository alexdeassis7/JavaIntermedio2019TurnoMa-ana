package com.utn.clase4;

public enum EquiposFutbol {

	//BARCELONA , INTER ... son el nombre del enumerado
	
	BARCELONA("BArcelona Futbol Club",4), VALENCIA (" valenciaa FC",3) , INTER (" Internacional FC",2) , REAL_MADRID (" RealMAdrid FC",1);
	private String nombre_del_club ;
	private int puesto_liga;	
	//constructor privado  solo visible dentro de la clase
	private EquiposFutbol ( String nombre , int posicion_en_tabla)
	{
		this.nombre_del_club = nombre;
		this.puesto_liga = posicion_en_tabla;
	}	
	public String getNombreDelClub() {
		return nombre_del_club;
	}	
	public int getPuestoLiga() {
		return puesto_liga;
		
	}


}
