package com.utn.clase2.herencia;

/**
 * Definimos clase Abstracta Instrumento
 * 
 * -una clase abstracta no puede ser instanciada, (no se pueden crear objetos
 * directamente - NEW) solo puede ser heredada
 * 
 * -los métodos abstract no llevan cuerpo
 * 
 * -la primer subclase concreta que herede de una clase abstract debe
 * implementar todos los métodos de la superclase
 * 
 * -Al trabajar clases y métodos abstractos , no solo mantenemos nuestra app mas
 * organizada y facil de entender sino que también al no poder instanciar una
 * clase abstracta nos aseguramos de que las propiedades de esta , solo estén
 * disponibles para sus clases hijas.....
 * 
 * -con las clases abstractas lo que hacemos es definir un proceso general que
 * luego sera implentado por las clases concretas que hereden dichas
 * funcionalidades......... es decir , si tengo una clase que hereda de otra
 * clase abstracta, estoy obligado a poner en el código, todos los metodos
 * abstractos de la clase padre, pero esta vez seran métodos concretos y su
 * funcionalidad o cuerpo sera definido de para que la necesite , de esa manera
 * si tengo otra clase que tambien hereda del mismo padre, emplementaré el mismo
 * método pero con un comportamiento distinto ..... por ejemplo:
 * 
 * 
 * 
 */

public abstract class Instrumento {

	public String tipo;

	public abstract void tocar();

}
