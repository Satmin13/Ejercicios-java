/**
Ejercicio 36
Crea la función de manejo de arrays que tenga la siguiente cabecera y que
haga lo que se especifica en los comentarios (puedes incluirla en tu propia
biblioteca de rutinas):
public static int[] filtraPrimos(int x[]) // Devuelve un array con todos los
// números primos que se encuentren
// en otro array que se pasa como
// parámetro.
// Obviamente el tamaño del array
// que se devuelve será menor o
// igual al que se pasa como
// parámetro.
Utiliza esta función en un programa para comprobar que funcionan bien. Para
que el ejercicio resulte más fácil, las repeticiones de primos se conservan; es
decir, si en el array x el número 13 se repite 3 veces, en el array devuelto
también estará repetido 3 veces. Si no existe ningún número primo en x, se
devuelve un array con el número -1 como único elemento.
**/
public class Ejercicio36{
	public static void main(String[]args){
			 
		 int[] array1 = new int [10];
		 
		 for (int i = 0 ; i<10 ; i++) {
		 int alea = (int)(Math.random()*(21) + 1 );
		 array1[i] = alea;		 
		 }
		 
		 System.out.println("Array normal. ");
		 
		 for (int i = 0 ; i<10 ; i++) {
		 		 System.out.printf("%5d ", array1[i] );		 
		 }
		 
		 System.out.println("\nEl array con los numeros primos filtrados queda así: ");
			 int e [] = Funciones.filtraPrimos(array1);
			for (int i = 0 ; i < e.length ; i++) {
				System.out.printf("%5d ", e[i]);
			 }
	}
}
class Funciones {
	public static boolean esPrimo(int num) {

		int sum = 2;
		boolean esPrimo = false;
		boolean salir = false;
		
		
			do{
				if(num%sum == 0){		
					esPrimo = false;
					salir = true;
				} 
				sum++;
			
				if(sum==num){
					esPrimo = true;
					salir = true;
					}
			} while( salir == false);
				
		
		return esPrimo;
		
	  }
	  
	  public static int[] filtraPrimos(int x[]) {
		
		int suma = 0;
		
		for (int i = 0; i <x.length ; i++) {
			if ( (Funciones.esPrimo(x[i]) == true) || (x[i] == 2) ){
				suma++;
			}
		}
		int [] filtrado = new int [suma];
		int j = 0;
		for (int i = 0; i < x.length ; i++) {
			if ((Funciones.esPrimo(x[i]) == true) || (x[i] == 2)){
				filtrado [j] = x[i];
				j++;
			}
			
		}
		
		return filtrado;
	}
}
