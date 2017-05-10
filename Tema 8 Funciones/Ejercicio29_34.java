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
	
	int[][] a = Array.generaArrayBiInt(5, 6, 0, 20);
    
    Array.muestraArrayBiInt(a); 
    
    //Muestra fila   
    System.out.print("\nMuestra la fila 3: ");
    int [] b = Array.filaDeArrayBiInt (a, 3); 
    for (int i = 0 ; i<b.length ; i++) {
		System.out.printf("%5d ", b[i]);
	}   
	
	//Muestra columna	 
    System.out.print("\nMuestra la columna 2: ");
    int [] c = Array.columnaDeArrayBiInt (a, 2); 
    for (int i = 0 ; i<c.length ; i++) {
		System.out.printf("%5d ", c[i]);
	} 
	
	//Muestra coordenadas
    System.out.print("\nCoordenadas del 10 (fila, columna): ");
    int [] z = Array.coordenadasEnArrayBiInt(a, 10) ;
    for (int i = 0 ; i<z.length ; i++) {
		System.out.printf("%5d ", z[i]);
	} 
	
	//Fin main
    
    }
}//Fin main


class Array {
    
    public static int [][] generaArrayBiInt (int f, int c, int min, int max) {
		 
		int[][] array1 = new int [f][c];
		 for (int i = 0 ; i<f ; i++) {
		  for (int j = 0 ; j<c ; j++){
			 int alea = (int)(Math.random()* (max-min) + min );
			 array1 [i][j] = alea;
			}
		 }
		 return array1;		 
	}
	
	public static void muestraArrayBiInt (int b[][]){
		for (int i = 0 ; i<b.length ; i++) {
			for (int j = 0 ; j<b[0].length ; j++) {
				System.out.printf("%5d ", b[i][j] );
			 }
			       System.out.println();

		}
	}
	public static int [] filaDeArrayBiInt (int d [][], int fila) {
	
	int[] array2 = new int[d[0].length];
    
		for (int i = 0; i < d[0].length; i++) {
			array2[i] = d[fila][i];
		}
          
	return array2;		
	}
	
	public static int [] columnaDeArrayBiInt (int j [][], int columna) {
	
	int[] array3 = new int[j.length];
    
		for (int i = 0; i < j.length; i++) {
			array3[i] = j[i][columna];
		}
          
	return array3;		
	}
	public static int [] coordenadasEnArrayBiInt (int b [][], int num) {
		for (int i = 0 ; i<b.length ; i++) {
		  for (int j = 0 ; j<b[0].length ; j++){
			 if (b[i][j] == num) {
				 int [] coordenadas = {i, j};
				 return coordenadas;
			}
		 }
		}
		int [] coordenadas = {-1, -1};
		return coordenadas;
	}
	
 }
