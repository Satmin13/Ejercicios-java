/**
Ejercicio 33
Realiza un programa que pinte la letra U por pantalla hecha con asteriscos. El
programa pedirá la altura. Fíjate que el programa inserta un espacio y pinta
dos asteriscos menos en la base para simular la curvatura de las esquinas
inferiores.
**/

public class Ejercicio33 {
	
	public static void main (String[] args) {
		
		System.out.println("Escribe una altura para la U.");
		int altura = Integer.parseInt(System.console().readLine());
		int i = 0;
		
			for ( i=0 ; i < altura-1 ; i++) {
				
				System.out.print("*");
				
				for ( int j=0 ; j < altura-1 ; j++) {				
				System.out.print(" ");				
				}
				System.out.println("*");
				
			}
			
			System.out.print(" ");
			for ( i=0 ; i < altura-1 ; i++) { //base
				
				System.out.print("*");
				
			}
			System.out.println();
			
	}
	
}
