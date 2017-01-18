/**
Ejercicio 14
Escribe un programa que pida 8 palabras y las almacene en un array. A
continuación, las palabras correspondientes a colores se deben almacenar al
comienzo y las que no son colores a continuación. Puedes utilizar tantos arrays
auxiliares como quieras. Los colores que conoce el programa deben estar en
otro array y son los siguientes: verde, rojo, azul, amarillo, naranja, rosa, negro,
blanco y morado.
**/

public class Ejercicio14 {

	public static void main(String [] args) {
	
		char[] introducido = new char[8];
		int[] cuadrado = new int[20];
		
		System.out.println("Escribe 8 palabras: ");
			for ( i = 0 ; i < 8 ; i++) {
			
				introducido[i] = System.console().readLine();
				if (introducido[i] == "verde"){System.out.println("Es verde");}
					
			}
			
			
	}
}
