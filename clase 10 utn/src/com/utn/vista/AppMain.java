package com.utn.vista;

import java.util.Scanner;

import com.utn.modelo.conexion.Conexion;
import com.utn.modelo.dao.PersonaDao;
import com.utn.modelo.vo.PersonaVo;

public class AppMain {

	public static void main(String[] args) {

		Conexion conn = new Conexion();

		PersonaVo p1 = new PersonaVo();

		Scanner teclado = new Scanner(System.in);

		System.out.println("ingfrese el nombre");
		p1.setNombrePersona(teclado.next());

		System.out.println("ingrese la profecion ");
		p1.setProfesionPersona(teclado.next());

		System.out.println("ingrese la edad ");
		p1.setEdadPersona(teclado.nextInt());

		System.out.println("ingrese el telefono ");
		p1.setTelefonoPersona(teclado.nextInt());

		System.out.println("ingrese ID de persona");
		p1.setIdPersona(teclado.nextInt());

		PersonaDao pd = new PersonaDao();
		pd.registrarPersona(p1);
		
		pd.eliminarPersona(11);
		pd.buscarPersona(11);
	}
}
