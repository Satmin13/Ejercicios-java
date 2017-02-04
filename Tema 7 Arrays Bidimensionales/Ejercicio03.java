/**
Ejercicio 3
Modifica el programa anterior de tal forma que los números que se introducen
en el array se generen de forma aleatoria (valores entre 100 y 999).
**/

public class Ejercicio03 {
	public static void main (String[]args) {
	
	
		int[][] num = new int[4][5]; // array de 4 filas por 5 columnas
		for (int columna = 0 ; columna<5 ; columna++) {
		for (int fila = 0 ; fila<4 ; fila++) {
			int alea = (int)(Math.random()*899 + (100));
			num[fila][columna] = alea;
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
						System.out.print( "suma " + sumacolumna + " | ");
					
		}
			System.out.print("TOTAL " + suma + " | ");
	}
}
