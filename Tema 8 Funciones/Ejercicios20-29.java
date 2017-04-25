// Ejercicios 20-28
// Crea una biblioteca de funciones para arrays (de una dimensión) de números
// enteros que contenga las siguientes funciones:
// 1. generaArrayInt: Genera un array de tamaño n con números aleatorios cuyo intervalo (mínimo y máximo) se indica como parámetro.
// 2. minimoArrayInt: Devuelve el mínimo del array que se pasa como parámetro.
// 3. maximoArrayInt: Devuelve el máximo del array que se pasa como parámetro.
// 4. mediaArrayInt: Devuelve la media del array que se pasa como parámetro.
// 5. estaEnArrayInt: Dice si un número está o no dentro de un array.
// 6. posicionEnArray: Busca un número en un array y devuelve la posición (el índice) en la que se encuentra.
// 7. volteaArrayInt: Le da la vuelta a un array.
// 8. rotaDerechaArrayInt: Rota n posiciones a la derecha los números de un array.
// 9. rotaIzquierdaArrayInt: Rota n posiciones a la izquierda los números de un array.

	public class Ejercicios20-29 {
		
		public static void main (String[]args) {
			System.out.println("Escribe un numero para el tamaño del array");
			int n = (System.console().readLine()) - 1;
			System.out.println("Escribe un numero para el máximo del array");
			int max = (System.console().readLine());
			System.out.println("Escribe un numero para el mínimo del array");
			int min = (System.console().readLine());
		}
	}
	
	
class Funciones {
	 
	 public static int[] generaArrayInt (int n, int min, int max) {
		 
		int[] array1 = new int [n];
		 for (int i = 0 ; i<=n ; i++) {
		 int alea = (int)(Math.random() * (max-min) + min );
		 array1[i] = alea;		 
		 }
	 }
	 
	 
}
