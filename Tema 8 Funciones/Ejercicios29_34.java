/**
Ejercicio 29-34
Crea una biblioteca de funciones para arrays bidimensionales (de dos dimensiones)
de números enteros que contenga las siguientes funciones:
1. generaArrayBiInt: Genera un array de tamaño n x m con números
aleatorios cuyo intervalo (mínimo y máximo) se indica como parámetro.
2. filaDeArrayBiInt: Devuelve la fila i-ésima del array que se pasa como
parámetro.
3. columnaDeArrayBiInt: Devuelve la columna j-ésima del array que se
pasa como parámetro.
4. coordenadasEnArrayBiInt: Devuelve la fila y la columna (en un array
con dos elementos) de la primera ocurrencia de un número dentro de un
array bidimensional. Si el número no se encuentra en el array, la función
devuelve el array {-1, -1}.
5. esPuntoDeSilla: Dice si un número es o no punto de silla, es decir,
mínimo en su fila y máximo en su columna.
6. diagonal: Devuelve un array que contiene una de las diagonales del
array bidimensional que se pasa como parámetro. Se pasan como
parámetros fila, columna y dirección. La fila y la columna determinan
el número que marcará las dos posibles diagonales dentro del array. La
dirección es una cadena de caracteres que puede ser nose o neso. La
cadena nose indica que se elige la diagonal que va del noroeste hacia
el sureste, mientras que la cadena neso indica que se elige la diagonal
que va del noreste hacia el suroeste.
**/

public class Ejercicio29_34 {
	public static void main (String[]args) {
	
	int[][] a = Array.generaArrayBiInt(5, 6, 0, 100);
    
    Array.muestraArrayBiInt(a);    
    System.out.print("\nFila 2: ");
    Array.muestraArrayInt(Array.filaDeArrayBiInt(a, 2));    
    System.out.print("\nColumna 6: ");
    Array.muestraArrayInt(Array.columnaDeArrayBiInt(a, 6));
    System.out.print("\nCoordenadas del 24 (fila, columna): ");
    Array.muestraArrayInt(Array.coordenadasEnArrayBiInt(a, 24));
    
    int[][] b = {{11, 10, 9}, {4, 5, 7}, {2, 6, 1}};
    Array.muestraArrayBiInt(b);    
    System.out.println("\nBusca los puntos de silla: ");
    for(int i = 0; i < 3; i++) {
      for(int j = 0; j < 3; j++) {
        if (array.ArrayBi.esPuntoDeSilla(b, i, j)) {
          System.out.println("fila " + i + ", columna " + j + " -> "  + b[i][j]);
        }
      } // for j
    } // for i
    Array.muestraArrayBiInt(a);    
    System.out.print("\nFila: ");
    int fila = Integer.parseInt(System.console().readLine());
    System.out.print("Columna: ");
    int columna = Integer.parseInt(System.console().readLine());
    System.out.print("Dirección (nose/neso): ");
    String direccion = System.console().readLine();
    System.out.print("\nDiagonal: ");
    Array.muestraArrayInt(Array.diagonal(a, fila, columna, direccion));
    
    }
    class Array {
    
    public static int[][] generaArrayBiInt (int f, int c, int min, int max) {
		 
		int[][] array1 = new int [f][c];
		 for (int i = 0 ; i<f ; i++) {
		  for (int j = 0 ; j<c ; j++){
			 int alea = (int)(Math.random()* (max-min) + min );
			 array1 [i][j] = alea;
			}
		 }
		 return array1;		 
	}
	
	public static int[][] muestraArrayBiInt (int [][] a){
		for (int i = 0 ; i<a.lenght ; i++) {
			for (int i = 0 ; i<a[0].lenght ; i++) {
				System.out.print(a[i][j] + " ");
			 }
		}
	}

 }}
