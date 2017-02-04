/**
Ejercicio 6
Modifica el programa anterior de tal forma que no se repita ningún número en
el array.
**/

public class Ejercicio06 {
	public static void main (String[]args) {
		
		int[][] num = new int[6][10]; // array de 6 filas por 10 columnas
		int maximo = 0 ;
		int minimo = 1000 ;
		int filaA = 0;
		int columnaA = 0;
		int filaB = 0;
		int columnaB = 0;
		boolean repetido;
		
		for (int columna = 0 ; columna<10 ; columna++) {
			for (int fila = 0 ; fila<6 ; fila++) {
				
				do {
				num[fila][columna] = (int)(Math.random() * 1001);

				  // Comprueba si el número generado ya está en el array.
				  repetido = false;
				  for (int i = 0; i < 10 * fila + columna; i++) {
					if (num[fila][columna] == num[i / 10][i % 10]) {
					  repetido = true;
					}
					}
				} while (repetido);
				
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
