package com.utn.clase5;

//una interfaz puede heredar otra mediante el uso de la palabra clave
//Extends, la sintaxis es la ,misma que para la herencia de clases
//
//Cuando una clase implementa una interfaz que hereda otra interfaz , 
//debe proporcionar Implementaciones para todos los metodos requeridos por la 
//cadena de herencia de la interfaz 

public interface ISeriesNumericasHerencia extends ISeriesNumericas{
	 int getAnterior() ;
}
