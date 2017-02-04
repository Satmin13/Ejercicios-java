/**
Ejercicio 2
Escribe un programa que pida 20 números enteros. Estos números se deben
introducir en un array de 4 filas por 5 columnas. El programa mostrará las
sumas parciales de filas y columnas igual que si de una hoja de cálculo se
tratara. La suma total debe aparecer en la esquina inferior derecha.
**/


public class Ejercicio02 {
	public static void main (String[]args) {
	
	
		int[][] num = new int[4][5]; // array de 4 filas por 5 columnas
		for (int columna = 0 ; columna<5 ; columna++) {
		for (int fila = 0 ; fila<4 ; fila++) {
			System.out.println("Introduzca un numero entero, por favor:");
			int introducido = Integer.parseInt(System.console().readLine());
			num[fila][columna] = introducido;
			}
		}
		
		//Se han introducido los numeros
		//Ahora muestro el array
		int sumafila ;
		int sumacolumna;
		int suma = 0;
		for(int fila = 0; fila < 4; fila++) {
			sumafila = 0;
				for(int columna = 0; columna < 5; columna++) {
					System.out.printf("%5d  |  ", num[fila][columna]);
					sumafila += num[fila][columna];
					suma += num[fila][columna];
				}
			System.out.print("E Fila " + sumafila + " | ");
			
			System.out.println();
		}
		
			for(int columna = 0; columna < 5; columna++) {
				sumacolumna = 0;
					for(int fila = 0; fila < 4; fila++) {
						sumacolumna += num[fila][columna];}
						System.out.print( "E Col " + sumacolumna + " | ");
					
		}
			System.out.print("TOTAL " + suma + " | ");
	}
}
