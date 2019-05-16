package com.utn.clase5;

public class SerieNumericaDeDosEnDos implements ISeriesNumericasHerencia{

	int iniciar ;
	int valor ;
	int anterior;
	
	//metodo Constructor
	 SerieNumericaDeDosEnDos(){
		iniciar = 0;
		valor = 0 ;	
		
	}
	
	//Siempre que implementemos un métopdo definido por una
	//interfaz, debe implementarse como PÚBLICO porque 
	//todo los miembros de una interfaz son implicitamente públicos
	@Override
	public int getSiguiente() {
		anterior = valor;
		valor += 2;
		return valor;
	}

	@Override
	public void reiniciar() {
		valor = iniciar;
		anterior = valor - 2 ;
	}

	@Override
	public void setComenzar(int x) {
		iniciar = x ;
		valor = x;
		anterior =  x - 2;
	}

	//añadimos un método que no esta definido en la Interface ISeriesNumericas
	public int getAnterior() {
		return anterior;		
	}
}

