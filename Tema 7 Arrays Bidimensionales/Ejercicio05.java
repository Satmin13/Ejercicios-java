/**
Ejercicio 5
Realiza un programa que rellene un array de 6 filas por 10 columnas con
números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos).
A continuación, el programa deberá dar la posición tanto del máximo como
del mínimo.
**/

public class Ejercicio05 {
	public static void main (String[]args) {
		
		int[][] num = new int[6][10]; // array de 6 filas por 10 columnas
		int maximo = 0 ;
		int minimo = 1000 ;
		int filaA = 0;
		int columnaA = 0;
		int filaB = 0;
		int columnaB = 0;
		
		for (int columna = 0 ; columna<10 ; columna++) {
		for (int fila = 0 ; fila<6 ; fila++) {
			int alea = (int)(Math.random()*1000 );
			num[fila][columna] = alea;
			}
		}
		
		for(int fila = 0; fila < 6; fila++) {
			System.out.print("Fila " + fila + " | ");
				for(int columna = 0; columna < 10; columna++) {
					if (num[fila][columna] > maximo) { 
						maximo = num[fila][columna];
						filaA = fila;
						columnaA = columna;
					}
					if (num[fila][columna] < minimo) { 
						minimo = num[fila][columna];
						filaB = fila;
						columnaB = columna;
					}
					System.out.printf("%4d | ", num[fila][columna]);
					
				}

			System.out.println();
		}
		System.out.println("Maximo: " + maximo + " Fila " + filaA + " Columna " + columnaA + ". Minimo: " + minimo + " Fila " + filaB + " Columna " + columnaB );
	}
}
