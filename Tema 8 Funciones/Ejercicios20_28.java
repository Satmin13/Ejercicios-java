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

	public class Ejercicios20_28{
		
		public static void main (String[]args) {
			System.out.print("\nEscribe un numero para el tamaño del array: ");
			int n = Integer.parseInt(System.console().readLine()) ;
			System.out.print("\nEscribe un numero para el máximo del array: ");
			int max = Integer.parseInt(System.console().readLine());
			System.out.print("\nEscribe un numero para el mínimo del array: ");
			int min = Integer.parseInt(System.console().readLine());
			System.out.println();
			
			//genera ArrayInt
			int a [] = Funciones.generaArrayInt(n, min, max);
			for (int i = 0 ; i<n ; i++) {
				System.out.printf("%5d ", a[i] );
			 }
			 System.out.println();
			 System.out.println("\nEl mínimo del array es : " + Funciones.minimoArrayInt(a));
			 System.out.println("\nEl máximo del array es : " + Funciones.maximoArrayInt(a));
			 System.out.println("\nLa media del array es : " + Funciones.mediaArrayInt(a));
			 
			 System.out.println("\nEscribe un numero para decirte si está en el array: ");
			 int nEsta = Integer.parseInt(System.console().readLine()) ;
			 System.out.println("\nEl número : " + nEsta + " " + Funciones.estaEnArrayInt(a, nEsta) + " está en el array.");
			 
			 System.out.println("\nEscribe un numero para decirte en qué posición se encuentra del array: ");
			 int nPos = Integer.parseInt(System.console().readLine()) ;
			 System.out.println("\nEl número : " + nPos + " se encuentra en la posición " + Funciones.posicionEnArrayInt(a, nPos) + " del array, empezando por el 0. \n(Si no está en el array devuelve -10.)");
			 
			 //devuleve ArrayVolteado
			int b [] = Funciones.volteaArrayInt(a);
			System.out.println("Ahora volteamos el array");
			for (int i = 0 ; i<n ; i++) {
				System.out.printf("%5d ", b[i]);
			 }
			 System.out.println();
			 
			  //devuelve ArrayRotado a derecha
			System.out.println("\nEscribe un numero de posiciones que quieres que se desplace hacia la derecha el array: ");
			int posiciones = Integer.parseInt(System.console().readLine()) ;
			int c [] = Funciones.rotaDerechaArray (a, posiciones);
			for (int i = 0 ; i<n ; i++) {
				System.out.printf("%5d ", c[i] );
			 }
			 System.out.println();
			 
			 //devuelve ArrayRotado a izquierda
			System.out.println("\nEscribe un numero de posiciones que quieres que se desplace hacia la izquierda el array: ");
			int posicionesIzq = Integer.parseInt(System.console().readLine()) ;
			int d [] = Funciones.rotaIzquierdaArray (a, posicionesIzq);
			for (int i = 0 ; i<n ; i++) {
				System.out.printf("%5d ", d[i]);
			 }
			 System.out.println();
		}
    }
	
class Funciones{
	 
	 public static int[] generaArrayInt (int n, int min, int max) {
		 
		int[] array1 = new int [n];
		 for (int i = 0 ; i<n ; i++) {
		 int alea = (int)(Math.random()* (max-min) + min );
		 array1[i] = alea;		 
		 }
		 
	     return array1;
	}
	public static int minimoArrayInt (int [] a) {
		int minimo = 10000;
		for (int i = 0 ; i < a.length ; i++) {
			if(a[i]<minimo){minimo = a[i];}
			}	
		return minimo;	
	}
	public static int maximoArrayInt (int [] a) {
		int maximo = -1000;
		for (int i = 0 ; i < a.length ; i++) {
			if(a[i]>maximo){maximo = a[i];}
			}	
		return maximo;	
	}
	public static int mediaArrayInt (int [] a) {
		int suma = 0;
		for (int i = 0 ; i < a.length ; i++) {
			suma += a[i];
			}	
		return suma/(a.length);	
	}
	
	public static String estaEnArrayInt (int [] a, int num) {
		String resultado = "no";
		for (int i = 0 ; i < a.length ; i++) {
			if (a[i] == num) {resultado = "sí";}
			}	
		return resultado;	
	}
	
	public static int posicionEnArrayInt (int [] a, int num) {
		int resultado = -10;
		for (int i = 0 ; i < a.length ; i++) {
			if (a[i] == num) {resultado = i;}
			}	
		return resultado;	
	}
	
	public static int [] volteaArrayInt (int [] a) {
		int [] arrayVolteado = new int [a.length];
		int j = 0;
		for (int i = (a.length-1) ; i >= 0 ; i--) {
			arrayVolteado[j] = a[i];
			j++;
			}	
		return arrayVolteado;	
	}
	
	public static int [] rotaDerechaArray (int [] a, int posiciones) {
		int [] arrayRotado = new int [a.length];
		int j = 0;
		for (int i = posiciones ; i < a.length ; i++) {
			
			arrayRotado[i] = a[j];
			j++;
		}	
		for (int i = 0 ; i < posiciones ; i++) {
			arrayRotado[i] = a[j];
			j++;
		}
			
		return arrayRotado;	
	}
	
	public static int [] rotaIzquierdaArray (int [] a, int posicionesIzq) {
		int [] arrayRotadoIzq = new int [a.length];
		int j = 0;
		for (int i = (a.length-posicionesIzq ); i < a.length  ; i++) {
			
			arrayRotadoIzq[i] = a[j];
			j++;
		}	
		for (int i = 0 ; i < (a.length-posicionesIzq) ; i++) {
			arrayRotadoIzq[i] = a[j];
			j++;
		}
			
		return arrayRotadoIzq;	
	}
}
