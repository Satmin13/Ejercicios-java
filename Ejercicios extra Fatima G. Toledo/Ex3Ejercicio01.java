/**
1. Escribe un programa que, dado un número introducido por teclado, elija al azar uno de sus dígitos.
Ejemplo:
Por favor, introduzca un número entero positivo: 21065
6
**/

public class Ex3Ejercicio01 {
	
	public static void main (String[]args) {

		System.out.println("Escriba un número entero: ");
		int num = Integer.parseInt(System.console().readLine());
		int num2 = num;
		
		boolean menor10 = false;
		int digitos = 1;
		int resto;
		
		 if(num>10) { //cuento digitos
			 
			 do {
				 
			 num = num/10 ;
			 digitos++;
			 
				if(num<10) {menor10=true;}// cambio el valor si es menor de 10
				
			} while (menor10 == false);
			
		} else {menor10=true;}
		
		long [] numeros = new long [digitos];// creo array
		
	
			 for (int i = 0 ; i< digitos ; i++){
			
			 resto = num2%10;
			 numeros[i] = resto ;
			 num2 = num2 / 10;
			 
				if(num2<10) {menor10=true;}
			} 
	
		System.out.println("Números introducidos : " );
		for(int i = digitos-1 ; i>=0 ;i--) { // muestro array
			System.out.print( numeros[i] + " ");
			}
		
		int alea = (int)(Math.random()*(digitos));	
		System.out.println("\nElegido : " + numeros[alea]);
		
		
	}
}
