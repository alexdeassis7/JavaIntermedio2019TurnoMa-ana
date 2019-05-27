package com.utn.vista;

import javax.swing.JOptionPane;

import com.utn.controller.PersonaController;
import com.utn.modelo.dao.PersonaDao;
import com.utn.modelo.vo.PersonaVo;

public class MenuOpciones {

	public static void main(String[] args) {

		PersonaController pc = new PersonaController();
		PersonaDao pd = new PersonaDao();
		boolean flag = true;
		do {
		Integer opcionIngresada = Integer.parseInt(JOptionPane
				.showInputDialog("ingrese la opcion deceada \n 1.agregar\n 2.modificar \n 3.eliminar \n 4 .buscar \n presione otra tecla para salir"));

		
			switch (opcionIngresada) {
			case 1:

				pd.registrarPersona(pc.diosTodoCreador());

				break;
			case 2:
				int idsolicitado = pc.solicitarIDPersona();
				if (pd.buscarPersona(idsolicitado) != null) {

					pd.modificarPersona(pc.diosTodoCreador(idsolicitado));

				} else {

					JOptionPane.showMessageDialog(null, "No se a detectado ese ID en La DB");
				}

				break;
			case 3:
				int id = pc.solicitarIDPersona();
				if (pd.buscarPersona(id) != null) {

					pd.eliminarPersona(id);

				} else {

					JOptionPane.showMessageDialog(null, "No se a detectado ese ID en La DB , no se elimino");
				}

				break;
			case 4:
				PersonaVo p1 = pd.buscarPersona(pc.solicitarIDPersona());
				if (p1 != null) {
					System.out.println(p1.toString());
				} else {
					System.err.println("la persona no se encuentra en la DB");
				}
				break;

			default:
				flag = false;
				JOptionPane.showMessageDialog(null, "Adios! vuelvas pronto! ");
				break;
			}
		} while (flag );
	}

}
