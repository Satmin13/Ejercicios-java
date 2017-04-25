//Ejercicio 15
//Muestra los números primos que hay entre 1 y 1000.

public class Ejercicio15 {
	
	public static void main (String[]args) {
		System.out.println("El numero : 2 es primo");
		for (int i = 1 ; i<1001 ; i++) {
			
			if (Funcion.esPrimo(i) == true) 
			{
				System.out.println("El numero : " + i + " es primo");
			} //else {System.out.println(i +"no es primo");}
			i++;
			
		}
	}
}

class Funcion {
	
	public static boolean esPrimo(int i) {

		int sum = 2;
		boolean esPrimo = false;
		boolean salir = false;
		
		
			do{
				if(i%sum == 0){		
					esPrimo = false;
					salir = true;
				} 
				sum++;
			
				if(sum==i){
					esPrimo = true;
					salir = true;
					}
			} while( salir == false && sum < 999);
				
		
		return esPrimo;
		
	  }
	
	
	}
