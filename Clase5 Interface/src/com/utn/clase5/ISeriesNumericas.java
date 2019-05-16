package com.utn.clase5;

//definimos una interface llamada ISeriesNumericas

//esta interfaz se declaro Public para que pueda ser implementada
// por cualquier otro Package
public interface ISeriesNumericas {

	//retorna el siguiente numero de la serie
	int getSiguiente();
	
	
	//reiniciar Serie
	void reiniciar();
	
	//metodo que establece un valor inicial
	void setComenzar(int x);
	
}
