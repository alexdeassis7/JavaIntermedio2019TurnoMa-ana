package com.utn.controller;

import java.util.Scanner;

import javax.swing.JOptionPane;

import com.utn.modelo.vo.PersonaVo;

public class PersonaController {

	PersonaVo miPersona = new PersonaVo();
	Scanner teclado = new Scanner(System.in);

	public PersonaVo diosTodoCreador(int id) {

		miPersona.setIdPersona(id);

		System.out.println("ingrese el nombre");
		miPersona.setNombrePersona(teclado.next());

		System.out.println("ingrese la profecion ");
		miPersona.setProfesionPersona(teclado.next());

		System.out.println("ingrese la edad ");
		miPersona.setEdadPersona(teclado.nextInt());

		System.out.println("ingrese el telefono ");
		miPersona.setTelefonoPersona(teclado.nextInt());

		return miPersona;

	}

	public PersonaVo diosTodoCreador() {

		System.out.println("ingrese el id");
		miPersona.setIdPersona(teclado.nextInt());

		System.out.println("ingrese el nombre");
		miPersona.setNombrePersona(teclado.next());

		System.out.println("ingrese la profecion ");
		miPersona.setProfesionPersona(teclado.next());

		System.out.println("ingrese la edad ");
		miPersona.setEdadPersona(teclado.nextInt());

		System.out.println("ingrese el telefono ");
		miPersona.setTelefonoPersona(teclado.nextInt());

		return miPersona;

	}

	public int solicitarIDPersona() {
		int id = Integer.parseInt(JOptionPane.showInputDialog("ingrese el ID de la persona"));
		
		return id;
	}
}

