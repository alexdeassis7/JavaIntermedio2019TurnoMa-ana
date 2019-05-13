package com.utn.controlador;

import com.utn.modelo.Cliente;
import com.utn.vista.ClienteView;

public class ClienteControlador {

	// instanciamos objetos de la vista y del modelo
	private Cliente modelo;
	private ClienteView vista;

	// constructor para inicializar el modelo y la vista
	public ClienteControlador(Cliente model, ClienteView view) {

		this.modelo = model;
		this.vista = view;

	}

	// getter y setter modelo
	public int getId() {
		return modelo.getId();
	}

	public void setId(int id) {
		this.modelo.setId(id);
	}

	public String getNombre() {
		return modelo.getNombre();
	}

	public void SetNombre(String nombre) {
		this.modelo.setNombre(nombre);
	}

	public String getApellido() {
		return modelo.getApellido();
	}

	public void SetApellido(String apellido) {
		this.modelo.setApellido(apellido);
	}
	//pasamos el modelo a la vista para poder presentar los datos
	public void actualizaVista() {
		vista.imprimirDatos(modelo.getId(), modelo.getNombre(), modelo.getApellido(), modelo.getDni());
	}

}
