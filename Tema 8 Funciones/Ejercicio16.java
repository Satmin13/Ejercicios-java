//Ejercicio 16
//Muestra los números capicúa que hay entre 1 y 99999.

public class Ejercicio16 {
	
	public static void main (String[]args) {
	
	 
		for (int n = 0 ; n<99999 ; n++) {
			
			if (Funcion.esCapicua(n) == true) 
			{
				System.out.println("El numero : " + n + " es capicua");
			} 
			n++;
			
		}
	}
}

class Funcion {

			public static boolean esCapicua(int n) {
			
			boolean esCapicua = false;
			
			// número de una cifra
			if (n < 10) {
			  esCapicua = true;
			}
			
			// número de dos cifras
			if ((n >= 10) && (n < 100)) {
			  if ((n / 10) == (n % 10)) {
				esCapicua = true;
			  }
			}

			// número de tres cifras
			if ((n >= 100) && (n < 1000)) {
			  if ((n / 100) == (n % 10)) {
				esCapicua = true;
			  }
			}

			// número de cuatro cifras
			if ((n >= 1000) && (n < 10000)) {
			  if (((n / 1000) == (n % 10)) && ((( n / 100 ) % 10)== (( n / 10) % 10))) {
				esCapicua = true;
			  }
			}
			
			// número de cinco cifras
			if (n >= 10000) {
			  if (((n / 10000) == (n % 10) ) && ((((n / 1000) % 10)) == ((n / 10) % 10))) {
				esCapicua = true;
			  }
			}
			
			
			 return esCapicua;
						
		}
}
