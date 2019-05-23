package com.utn.clase9;

import javax.swing.JOptionPane;

public class AppMain {

	public static void main(String[] args) {

		// pedimos los datos

		int anio, mes, dia;

		dia = Integer.parseInt(JOptionPane.showInputDialog("ingrese el dia"));
		mes = Integer.parseInt(JOptionPane.showInputDialog("ingrese el mes"));
		mes += 1;
		anio = Integer.parseInt(JOptionPane.showInputDialog("ingrese el año"));

		Fecha miFecha1 = new Fecha(dia, mes, anio);
		System.out.println(miFecha1.toString());
	}
}
