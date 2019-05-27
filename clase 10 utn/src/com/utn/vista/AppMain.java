package com.utn.vista;

import java.util.Scanner;

import javax.swing.JOptionPane;

import com.utn.controller.PersonaController;
import com.utn.modelo.conexion.Conexion;
import com.utn.modelo.dao.PersonaDao;
import com.utn.modelo.vo.PersonaVo;

public class AppMain {

//	public static void main(String[] args) {
//
//		Conexion conn = new Conexion();
//		PersonaController pc = new PersonaController();
//		PersonaDao pd = new PersonaDao();
//	
//	Integer id = Integer.parseInt(JOptionPane.showInputDialog("ingrese el Id de la persona a buscar"));
//
//		if (pd.buscarPersona(id) != null) {
//
//			pd.modificarPersona(pc.diosTodoCreador(id));
//
//		} else {
//
//			System.out.println("no existe ese ID, decea crear ?");
//			Integer opcion = Integer.parseInt(JOptionPane.showInputDialog("ingrese 1 para crear , != 1 para salir"));
//			if (opcion == 1) {
//
//				pd.registrarPersona(pc.diosTodoCreador(id));
//
//			} else {
//
//				System.out.println("Gracias por usar la App");
//			}
//
//		}
//
//		// pd.modificarPersona(p1);
//
//		// pd.registrarPersona(p1);
//		//
//		// System.out.println("ingfrese el nombre");
//		// p1.setNombrePersona(teclado.next());
//		//
//		// System.out.println("ingrese la profecion ");
//		// p1.setProfesionPersona(teclado.next());
//		//
//		// System.out.println("ingrese la edad ");
//		// p1.setEdadPersona(teclado.nextInt());
//		//
//		// System.out.println("ingrese el telefono ");
//		// p1.setTelefonoPersona(teclado.nextInt());
//		//
//		// System.out.println("ingrese ID de persona");
//		// p1.setIdPersona(teclado.nextInt());
//		//
//		// pd.registrarPersona(p1);
//		// pd.eliminarPersona(11);
//		// pd.buscarPersona(11);
//
//	}
}
