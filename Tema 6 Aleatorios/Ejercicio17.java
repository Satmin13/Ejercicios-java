/**
Ejercicio 17
Realiza un programa que pinte por pantalla una pecera con un pececito dentro.
Se debe pedir al usuario el ancho y el alto de la pecera, que como mínimo
serán de 4 unidades. No hay que comprobar que los datos se introducen
correctamente; podemos suponer que el usuario los introduce bien. Dentro
de la pecera hay que colocar de forma aleatoria un pececito, que puede estar
situado en cualquiera de las posiciones que quedan en el hueco que forma el
rectángulo.
Ejemplo:
Por favor, introduzca la altura de la pecera (como mínimo 4): 4
Ahora introduzca la anchura (como mínimo 4): 7
* * * * * * *
* 			*
* 	&   	*
* * * * * * *

**/


public class Ejercicio17 {
	
	public static void main(String[] args) {
	
	System.out.print("Por favor, introduzca la altura de la pecera (como mínimo 4)");
	int y = Integer.parseInt(System.console().readLine());
	
	System.out.print("Por favor, introduzca el ancho de la pecera (como mínimo 4)");
	int x = Integer.parseInt(System.console().readLine());
	
	String pez = "<" ;
	
	int sitioPez = (int) (Math.random() * 4);
	int i;
	int espacios = x-2;
	String espacio = " ";
	
	for(i=0 ; i<x ; i++) { 
			System.out.print("*");		
		}
		
	System.out.println();		

		
	for(int j=0 ; j<(y-2) ; j++) { 
			System.out.print("*");
			
			for ( i = 0 ; i<espacios ; i++) {
				System.out.print(" ");
				}	
			System.out.println("*");
			
	}
		
	

	for(i=0 ; i<x ; i++) { 
			System.out.print("*");		
		}
	System.out.println();		
	}
}
		
