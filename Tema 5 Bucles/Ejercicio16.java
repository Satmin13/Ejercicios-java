/**
Ejercicio 16
Escribe un programa que diga si un número introducido por teclado es o no
primo. Un número primo es aquel que sólo es divisible entre él mismo y la
unidad.
**/



public class Ejercicio16{
	public static void main(String[]args){
		System.out.println("Escribe un número, si es primo se termina el programa.");
		int num = Integer.parseInt(System.console().readLine());
		int sum = 2;
		boolean esPrimo = true;
		boolean salir = true;
		
		
			do{
				if(num%sum == 0){		
					System.out.println("El número no es primo. Porque es divisible entre:" + sum);
					esPrimo = false;
					salir = false;
				} 
			sum++;
				if(sum==num){
					esPrimo = true;
					salir = false;
					System.out.println("El número es primo. Porque solo es divisible entre si mismo: " + sum + " y 1.");

					}
			}while( salir == true);	
			System.out.println(esPrimo);
			
	}
}

