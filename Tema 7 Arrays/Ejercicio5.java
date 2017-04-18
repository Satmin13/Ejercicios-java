/**
Ejercicio 5
Escribe un programa que pida 10 números por teclado y que luego muestre
los números introducidos junto con las palabras máximo y mínimo al lado
del máximo y del mínimo respectivamente.
**/

public class Ejercicio5 {
	public static void main(String[]args){
		
		int[] numero = new int[10];
		
		
			for (int i=0; i<=9; i++) {		
				System.out.println("Escriba un número entero.");
				numero[i] = Integer.parseInt(System.console().readLine());
			}
			
		int minimo = numero[0];
		int maximo = numero[0];
			
			for (int i=0; i<=9; i++) {
				 if(numero[i]>maximo) {
					maximo = numero[i];
				 }
				 
				 if(numero[i]<minimo) {
					minimo = numero[i];
				 }
			}
			
			for (int i=0; i<=9; i++) {
				System.out.print(numero[i] + ", ");
			}
			
			System.out.println("Máximo: " + maximo + ", mínimo: " + minimo);
	}
}
