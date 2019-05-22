package com.utn.clase8.relanzarexcepcion;

public class UseDeFinally {

	public static void generoError (int rec) {
		int t;
		int nums[] = new int [2];
		
		System.out.println("Recibiendo " + rec);
		
		try {
			switch (rec) {
			case 0:
				t = 10 / rec;
				break;
			case 1:
				//genero  un error de indexacion
				nums[4] = 4;
				break;
				
			case 2 :
//				retornoi desde el try
				return;
			}			
		}
		catch (ArithmeticException e) {
			System.out.println(" no se puede dividir por cero");
			return; //retornamos desde el catch			
		}catch(ArrayIndexOutOfBoundsException exc) {
			System.out.println("elemento no encontra en el array");
					}		
		finally {
			//eSTO SE EJECUTARA AL SALIR DE LOS BLOQUES TRY / CATCH
			System.out.println("ESTOY SALIENDO DEL TRY!");
		}
		
	}
	
}
