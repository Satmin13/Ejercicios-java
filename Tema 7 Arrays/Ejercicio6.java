/**
Ejercicio 6
Escribe un programa que lea 15 números por teclado y que los almacene en un
array. Rota los elementos de ese array, es decir, el elemento de la posición 0
debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
del array.
**/

public class Ejercicio6 {
	public static void main(String[]args){
		
		int[] numero = new int[15];
		int[] numero2 = new int[15];
		int i;
		
		for ( i=0 ; i<=14 ; i++) {
			
			System.out.println("Escriba un número entero.");
			numero[i] = Integer.parseInt(System.console().readLine());
			
		}
		
		numero2[0] = numero[14];
		
		for ( i=0 ; i<=13 ; i++) {							
				numero2[i+1] = numero[i];				
			}
			
		for ( i=0 ; i<=14 ; i++) {
			System.out.print(numero2[i] + " ");
			}
		
}}
