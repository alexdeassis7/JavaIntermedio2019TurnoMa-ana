package com.utn.clase3;

public class Passenger {

	private int bolsos;
	private int bolsosPagos;
	private double tarifaXbolso;
	private double totalApagar;
	private int totalEquipaje;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// construcctor vacio
	public Passenger() {
	}

	// construcctor con dos parametro
	public Passenger(int bolsos, String name) {
		this(bolsos > 1 ? 25.0d : 50.0d);
		this.bolsos = bolsos;
		totalApagar = bolsos * tarifaXbolso;
		totalEquipaje = bolsos;
		this.name = name;

	}

	// construcctor con dos parametros
	public Passenger(int bolsos, int bolsosPagos) {
		this(bolsos);
		this.bolsosPagos = bolsosPagos;
		totalEquipaje = bolsos + bolsosPagos;
		totalApagar = bolsos * tarifaXbolso;

	}

	private Passenger(double tarifaXbolso) {
		this.tarifaXbolso = tarifaXbolso;
	}

	public int getBolsos() {
		return bolsos;
	}

	public int getBolsosPagos() {
		return bolsosPagos;
	}

	public double getTarifaXbolso() {
		return tarifaXbolso;
	}

	public double getTotalApagar() {
		return totalApagar;
	}

	public int getTotalEquipaje() {
		return totalEquipaje;
	}

	public static void mostrarListaDePasajeros(Passenger listaPasajeros[]) {
		// for each
		for (Passenger p1 : listaPasajeros) {
			System.out.println("********************************************************************");
			System.out.println("NOMBRE DEL PASAJERO :" + p1.getName());
			System.out.println("  TARIFA POR BOLSO $ " + p1.getTarifaXbolso());
			System.out.println("TOTAL A PAGAR $ " + p1.getTotalApagar());
			System.out.println("TOTAL DE BOLSOS QUE LLEVA  " + p1.getTotalEquipaje());
			System.out.println("*********************************************************************");
		}
	}

}
