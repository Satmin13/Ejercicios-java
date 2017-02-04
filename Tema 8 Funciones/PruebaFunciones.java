
import matematicas.Varias;
import java.util.Scanner;

public class PruebaFunciones {
	
	public static void main (String[]args) {
		
		System.out.println("Escribe un numero y te diré si es primo, true y false si no lo es.");
		int num = Integer.parseInt(System.console().readLine());
		
			if(Varias.esPrimo(num)) {
			
				System.out.println("El numero es primo.");
				
			} else {
						System.out.println("El numero no es primo.");
			  }
		
		
	}
}
