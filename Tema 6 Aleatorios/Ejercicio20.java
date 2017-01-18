/**
Ejercicio 20
Realiza un programa que pinte por pantalla una cuba con cierta cantidad de
agua. La capacidad será indicada por el usuario. La cuba se llenará con una
cantidad aleatoria de agua que puede ir entre 0 y la capacidad máxima que
pueda admitir. El ancho de la cuba no varía.
Ejemplo:
Por favor, indique la capacidad de la cuba en litros: 3
*    *
*====*
*====*
******
La cuba tiene una capacidad de 3 litros y contiene 2 litros de agua.
**/

public class Ejercicio20 {

  public static void main(String[] args) {
	  
  System.out.println("¿Que capacidad va a tener la cuba?: ");
  int y = Integer.parseInt(System.console().readLine());
  int i = 0;
  int contiene = (int)(Math.random() * (y) + 1);
  
  for(int j=0 ; j<(y-contiene) ; j++) { 
		
			System.out.print("*");
			
			for ( i = 0 ; i<6 ; i++) {
				
					System.out.print(" ");
			}	
			
			System.out.println("*");			
	}
	
    for(int j=0 ; j<contiene ; j++) { 
		
			System.out.print("*");
			
			for ( i = 0 ; i<6 ; i++) {
				
					System.out.print("=");
			}	
			
			System.out.println("*");			
	}
 
	  
	  for ( i=0;i<8; i++) {
		  System.out.print("*");
		  }
	System.out.println();

	}
}
