package com.utn.clase7;

import javax.swing.JOptionPane;

public class Appmain {

	public static void main(String[] args) {

		// Exception :
		// -Es un error que ocurre en tiempo de ejecución
		// - utilizando el subsistema de manejo de excepciones de Java,
		// se puede , de una manera estrcuturada y controla ,manejar todos
		// los errores de tiempo de ejecución

		// Manejo de Exceptiones:
		// Una Ventaja principal del manejo de ecepciones es que nos
		// automatiza gran parte del codigo de manejo de errores,que
		// atiguamente debiamos hacerlo "a mano" en cualquier programa.
		//
		// por ejemplo , en algunos lenguajes mas antiguos , los codigos de
		// error se devuelven cuando falla un metodo , y estos valores se
		// debian verificar manualmente , cada vez que llamamos a ese metodo
		//
		// el manejo de excepciones nos agiliza el manejo de errores al
		// permitir que tu programa defina un bloque de codigo , llamado
		// manejador de excepcion , que se ejecuta automaticamente cuando
		// ocurre un error
		//
		//
		// Otra razon por la que el manejo de excepciones es importante
		// es que java nos define excepciones estándar para errores comunes del
		// programa, nuestro programa debe "vigilar y capturar estas ecepciones"
		//
		// JERARQUIA DE EXCEPCIONES
		// tenemos dos subclase directas de Throwable : exception y Error
		//
		// 1) Error :estan relacionados con errores que ocurren en la JVM y
		// no en tu programa , este tipo de errores se escapan de nuestro
		// control y por lo gral , tu programa no se va a ocupar de ellas
		//
		// 2) Exception : son errores que resultan de la actividad de nuestro
		// programa , por ejemplo , intentar dividir por cero , superar
		// los limites de un vector , en gral, tu programa debe manejar exception
		// de este tipo , una Subclase importante de Exception es
		// RUNTIME Exception , que se usa para representar varios tipos
		// comunes de errores en tiempo de ejecucion.

		// FUNDAMENTOS de MAnejo de excepciones:
		// estas se gestionan a traves de 5 palabras claves:
		// try , catch , throw , throws y finally .a estos forman un sistema
		// interrelacionado en el que el uso de uno no implica el uso de otro
		//

		try {

			System.out.println("antes de que se gerene la excepcion");
			Integer.parseInt(JOptionPane.showInputDialog("ingrese fruta"));

			ExcepNueva.forzarException();
			// bloque de codigo para monitorear errores
			// Si no se genera un excepcion , el bloque try
			// finalizara normalment , y todos sus catch se pasaran
			// por alto
		} catch (Exception identificardor) {

			System.out.println("Get message : " + identificardor.getMessage());

			// toString devuelve un objeto String que contiene una
			// descripcion completa de la excepcion , este metodo a su vez llama
			// println() de Throwable
			//
			System.out.println("ToString : " + identificardor.toString());
			
			//devuelve un objeto Thowable que contiene seguimiento de la pila completo .
			//Este obejto puede volver a lanzar
			identificardor.fillInStackTrace();
			
			//muestra el flujo de eror estandar
			identificardor.printStackTrace();
			
			
		}
		System.out.println("despues de que genere una exception");

	}

}
