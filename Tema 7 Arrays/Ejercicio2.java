/**
 * Ejercicio 2
Define un array de 10 caracteres con nombre simbolo y asigna valores a los
elementos según la tabla que se muestra a continuación. Muestra el contenido
de todos los elementos del array. ¿Qué sucede con los valores de los elementos
que no han sido inicializados?
* **/

public class Ejercicio2 {
	
	public static void main (String[]args) {
		
		char[] letras = new char[10];
		
		letras[0] = 'K';
		letras[1] = '@';
		
		letras[4] = ' ';
		letras[5] = '*';
		
		letras[8] = '^';
		letras[9] = '_';
		
		
		for (int i = 0 ; i < 10 ; i++ ) {
			
			System.out.println(letras[i]);
			}
			
		
		}
	}
