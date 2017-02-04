/**
Ejercicio 1
Define un array de números enteros de 3 filas por 6 columnas con nombre num
y asigna los valores según la siguiente tabla. Muestra el contenido de todos
los elementos del array dispuestos en forma de tabla como se muestra en la
figura.
**/

public class Ejercicio01 {
	public static void main (String[]args) {
	
	
		int[][] num = new int[3][6]; // array de 3 filas por 6 columnas
		
		num[0][0]=0;
		num[1][0]=75;
		num[0][1]=30;
		num[0][2]=2;
		num[2][2]=-2;
		num[2][3]=9;
		num[1][4]=0;
		num[0][5]=5;
		num[2][5]=11;
		
		int fila, columna;
		System.out.print("Array num");
		for(columna = 0; columna < 6; columna++) {
			System.out.print( " Columna " + columna );
		}
			System.out.println();
		for(fila = 0; fila < 3; fila++) {
			System.out.print("Fila " + fila + "   | ");
				for(columna = 0; columna < 6; columna++) {
					System.out.printf("%5d  |  ", num[fila][columna]);
					
				}
			System.out.println();
		}
	
	
	
	
	}


}
