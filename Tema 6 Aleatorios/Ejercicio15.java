/**
Ejercicio 15
Realiza un generador de melodía con las siguientes condiciones:
a) Las notas deben estar generadas al azar. Las 7 notas son do, re, mi, fa,
sol, la y si.
b) Una melodía está formada por un número aleatorio de notas mayor o igual
a 4, menor o igual a 28 y siempre múltiplo de 4 (4, 8, 12…).
c) Cada grupo de 4 notas será un compás y estará separado del siguiente
compás mediante la barra vertical | (Alt + 1). El final de la melodía se marca
con dos barras.
d) La última nota de la melodía debe coincidir con la primera.
Ejemplo 1:
do mi fa mi | si do sol fa | fa re si do | sol mi re do ||
Ejemplo 2:
la re mi sol | fa mi mi si | do la sol fa | fa re si sol | do sol mi re | fa la do la ||
**/

public class Ejercicio15 {
	public static void main(String[] args) {
		
	    		
		int repeticiones = (int)(Math.random() * 7 );
		int primeraNota=0;
		
		for(int i = 0; i<=repeticiones ; i++){
			
		int nota ;
		
		   for(int j = 1; j<=4 ; j++){
			 
			 nota = (int)(Math.random() * (7) + 1);
			 

		      if(i==0 && j==1){ primeraNota = nota;}
		      
		      if(i==repeticiones && j==4){ nota = primeraNota;}
		      
		      switch(nota){
				  
				  case 1:
				  System.out.print("do ");
				  break;
				  case 2:
				  System.out.print("re ");
				  break;
				  case 3:
				  System.out.print("mi ");
				  break;
				  case 4:
				  System.out.print("fa ");
				  break;
				  case 5:
				  System.out.print("sol ");
				  break;
				  case 6:
				  System.out.print("la ");
				  break;
				  case 7:
				  System.out.print("si ");
				  break;
				  default:
				  System.out.print("kkk ");

				}
			}//for notas
			System.out.print("| ");
		}//for repeticiones
			System.out.print( "| ");
	}
}
