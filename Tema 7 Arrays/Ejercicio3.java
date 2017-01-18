/**
 * Ejercicio 3
Escribe un programa que lea 10 números por teclado y que luego los muestre
en orden inverso, es decir, el primero que se introduce es el último en
mostrarse y viceversa
* **/

public class Ejercicio3 {
	
	public static void main (String[]args) {
		
		int[] num = new int[10];
		int i;
		System.out.println("Introduce 10 numeros : ");
		for ( i = 9 ; i >= 0 ; i-- ){
					
			
			num[i] = Integer.parseInt(System.console().readLine());
			
			}
			System.out.println("Al reves : ");
			for ( i = 0 ; i <= 9 ; i++){
			System.out.println("" + num[i] );
			
			}
			
		
		}
	}
