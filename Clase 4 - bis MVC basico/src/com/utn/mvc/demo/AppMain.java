package com.utn.mvc.demo;

import com.utn.controlador.ClienteControlador;
import com.utn.modelo.Cliente;
import com.utn.vista.ClienteView;

public class AppMain {

	public static void main(String[] args) {
		// instanciar objetos modelo y vista

		ClienteView vista = new ClienteView();
		Cliente modelo = llenarDatosCliente();

		// se crea un objeto controlados y se le pasa
		// un model y un view
		ClienteControlador controller = new ClienteControlador(modelo, vista);

		// se muestra los datos del cliente
		controller.actualizaVista();

		// actualizamos un cliente y mostramos los datos de nuevo

		controller.SetNombre("Felipe mistico");
		controller.SetApellido("Magia");
		controller.setId(6543);
		controller.actualizaVista();

	}

	// metodo estatico que retorna el cliente con todos sus datos
	private static Cliente llenarDatosCliente() {
		Cliente cliente1 = new Cliente();
		cliente1.setApellido("De Assis");
		cliente1.setDni(368638373);
		cliente1.setNombre("alexia");
		cliente1.setId(100001);

		return cliente1;
	}
}
