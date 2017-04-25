
import matematicas.Varias;
import java.util.Scanner;
import java.math;
public class PruebaFunciones {
	
	public static void main (String[]args) {
		
		//Devuelve si es primo o no
		
		System.out.println("Escribe un numero y te diré si es primo o no lo es.");
		int num = Integer.parseInt(System.console().readLine());
		
			if(Varias.esPrimo(num)) {
			
				System.out.println("El numero es primo.");
				
			} else {
						System.out.println("El numero no es primo.");
			  }
		
		//Devuelve el siguiente primo
		System.out.println("Escribe un numero y te diré el siguiente primo");
		int numP = Integer.parseInt(System.console().readLine());
		
		System.out.println("El siguiente primo es: " + numP);
		
		
			
	}
}
