/**
 * Ejercicio 2
Define un array de 10 caracteres con nombre simbolo y asigna valores a los
elementos según la tabla que se muestra a continuación. Muestra el contenido
de todos los elementos del array. ¿Qué sucede con los valores de los elementos
que no han sido inicializados?
* **/

public class Ejercicio1 {
	
	public static void main (String[]args) {
		
		int[] num = new int[10];
		
		num[0] = -39;
		num[1] = -2;
		
		num[4] = 0;
		num[5] = 678;
		
		num[8] = 5;
		num[9] = 120;
		
		
		for (int i = 0 ; i < 10 ; i++ ) {
			
			System.out.println(num[i]);
			}
			
		
		}
	}

