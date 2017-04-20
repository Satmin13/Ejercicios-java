/**
Ejercicio 10
Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
y que los almacene en un array. El programa debe ser capaz de pasar todos
los números pares a las primeras posiciones del array (del 0 en adelante) y
todos los números impares a las celdas restantes. Utiliza arrays auxiliares si
es necesario. **/

public class Ejercicio10 {

	public static void main(String[]args) {
		
	int [] num = new int [20];
	int i;
	int k = 19;
	int j = 0;
	int numero;	
	
		for ( i = 0 ; i <20 ; i++) {
			numero = (int)(Math.random()* 100);
			if (numero%2 == 0) 
			{
				num [j] = numero;
				j++;
			} else {
				num [k] = numero;
				k--;
			  }
		}
		
		for ( i = 0 ; i <20 ; i++) {
			System.out.print(" | " + num [i]);
		}
	}
}
