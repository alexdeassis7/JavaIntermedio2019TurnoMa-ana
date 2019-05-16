package com.utn.clase5;

public class AppMain {

	// INTERFACES
	/**
	 * en la programación OO, a veces es útil definir que debe hacer una clase ,pero
	 * no cómo lo hará.
	 * 
	 * Una interfaz (interface) es sintácticamente SIMILAR a una clase abstracta, en
	 * la que se puede especificar uno o mas metodos que no tienen cuerpo ({}) Esos
	 * metodos deben ser implementados por una clase para que se definan sus
	 * acciones
	 * 
	 * Una vez que se define una interfaz , cualquier cantidad de clases puede
	 * implementarla. Además , una clase puede implementar cualquier cantidad de
	 * interfaces
	 * 
	 * Para implementar una interfaz, una clase debe proporcionar cuerpos
	 * (implementaciones ) para los metodos descritos por la interfaz. Cada clase es
	 * libre de determinar los detalles de su propia implementación . Dos clases
	 * pueden implementar la misma interfaz de diferentes maneras , pero CADA CLASE
	 * AÚN ADMITE EL MISMO CONJUNTOS DE MÉTODOS
	 * 
	 * 
	 * En una interfaz , los nmétodos son implicitamente PUBLICOS
	 * 
	 * Las variables declaradas en u na interfaz no son variables de instancia, son
	 * implicitamente pulbic , final y static , y deben inicializarce, por lo tanto
	 * SON ESENCIALMENTE CONSTANTES
	 * 
	 * -Si una clase incluyen una interfaz pero no implementa los métodos definidos
	 * por esa interfaz, ESA CLASE DEBE DECLARARSE COMO ABSTRACTA(abstrac), No se
	 * pueden crear Objetos de dicha clase, pero se podra usar como una SURPERCLASE
	 * ABSTRACTA , lo que permite que las subclasese proporcionen la implementación
	 * COMPLETA.
	 * 
	 * Referencias a interface: se puede declarar una variable de referencia de un
	 * tipo de interfaz. En otras palabras , puede crear una variable de referencia
	 * de interfaz
	 * 
	 * Dicha variable puede referirce a cualquier Objeto que impleente su
	 * interfaz.Cuando llamamos a un método en un objeto a través de una referencia
	 * de interfaz , es la versión del método implementado por el objeto que se
	 * ejecuta. Este proceso es muy similar al uso de una referencia de superclase
	 * para acceder a un objeto de subclase
	 * 
	 * JDK 8 : en esta versión se agregó una función a interface que genero un
	 * cambio significativo es sus capacidades. Antes de JDK 8 no podiamos definir
	 * ninguna implementación de ningún tipo . Hoy , es posible agregar una
	 * implementación predeterminada a un método de la interface ,
	 * 
	 * JDK 9 : podemos incluir METODOS PRIVADOS
	 * 
	 * 
	 * Sin embargo , estas nuevas cualidades son de USO ESPECIAL , por lo tanto ,
	 * como regla general , con frecuencia solo se creará y utilizara interfaces en
	 * las que no se utilizarañ estas nueva funcionalidades
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {

		// SerieNumericaDeDosEnDos obj = new SerieNumericaDeDosEnDos();
		DeTres obj = new DeTres();
		
		//REFERENCIAS A interfaces
		SerieNumericaDeDosEnDos dosOb = new SerieNumericaDeDosEnDos();
		DeTres tresOb = new  DeTres();
		//ob es el objeto declarado como referencia a la interfaz IseriesNumericas
		/*Esto significa que se podra utilizar para almacenar referencias
		 * a cualquier objeto que implemente ISeriesNumericas, En este caso,
		 * lo utilizamos para referirnos a dosOb y tresOB los cuales si implementan
		 * la interfaz ISeriesNumericas
		 * 
		 * Una variable de referencia de interfaz solo tiene conocimiento de 
		 * los métodos declarados por su declaración de interzas , Por  lo tanto ,
		 * on no podria usarce para acceder a otras variable o métodos que pueden
		 * ser compatibles con el objeto
		 * */
		ISeriesNumericas ob;
		
		for(int j = 0 ; j < 5 ; j++) {
			ob = dosOb;
			System.out.println("Ref, Siguiente valor DeDos es : " + ob.getSiguiente());
			ob = tresOb ; 
			System.out.println("Ref , siguiente valor DeTres es  : " + ob.getSiguiente());
		
		}
		
		
		
		
		
		
		
		
		
		for (int i = 0; i < 5; i++)
			System.out.println("Siguiente valor es : " + obj.getSiguiente());

		System.out.println("\n Reiniciando la Serie");
		obj.reiniciar();

		for (int i = 0; i < 5; i++)
			System.out.println("Siguiente valor es : " + obj.getSiguiente());

		System.out.println("\n Reiniciando la Serie en 50");
		obj.setComenzar(50);

		for (int i = 0; i < 5; i++)
			System.out.println("Siguiente valor es : " + obj.getSiguiente());

	}
	
	
	

}
