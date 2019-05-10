package com.utn.clase3;

//clase hijo que hereda de Vuelo
public class VueloCarga extends Vuelo {

	// aca estoy pisando el campo de la clase padre
	public int asientos = 12;
	// pies cubicos de espacio en nuestra bodega
	public float espacioMaximoDeCarga = 1000;
	// usamos este atributo para ver la cantidad de espacio
	// que hemos usado en el avión
	public float espacioDeCargaUsado;

	// metodo para agregar un paquete al avion
	// este recibira por parametro las dimenciones del paquete
	public void agregarPaquete(float altura, float ancho, float profundidad) {
		double size = altura * ancho * profundidad;

		// valido que tenga espacio en mi bodega
		if (espacioDeCargaDisponible(size)) {
			// agrego un paquete al espacio de carga
			espacioDeCargaUsado += size;
			System.out.println("Paquete agregado satisfactoriamente");
		} else {
			faltaEspacio();
		}
	}

	// metodo PRIVADO para asegurarnos de que tenemos suficiente
	// espacio para el paquete que intentamos agregar a nuestro avion.
	private boolean espacioDeCargaDisponible(double tamanio) {

		return espacioDeCargaUsado + tamanio <= espacioMaximoDeCarga;
	}

	// metodo privado qyue imprime mensaje de falta de espacio
	private void faltaEspacio() {
		System.out.println("NO TIENES ESPACIO EN TU BODEGA");
	}

	// utilizamos esta anotación para asegurarnos que no cometimos
	// un error accidental y que no coincida con la firma del
	// metodo a Sobreescribir
	// esto le indica al compilador que nuestra intencion es ANULAR un metodo
	// de la clase padre
	// (no tiene impacto en tiempo de ejecucion SOLO EN TIEMPO DE COMPILACION)
	@Override
	public int getAsiento() {
		return 12;
	}

}
