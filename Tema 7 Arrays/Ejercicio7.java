/**
Ejercicio 7
Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
muestre por pantalla separados por espacios. El programa pedirá entonces
por teclado dos valores y a continuación cambiará todas las ocurrencias del
primer valor por el segundo en la lista generada anteriormente. Los números
que se han cambiado deben aparecer entrecomillados.
**/

public class Ejercicio7 {

	public static void main(String[]args) {
	
		int[] numero = new int[100];
		for (int i = 0 ; i<100; i++) {
			numero[i] = (int)(Math.random()*20);
		}
		for (int i = 0 ; i<100; i++) {
			System.out.print(numero[i] + " ");
		}
		
		System.out.println(" \nEscriba un número de los anteriores.");
		int num1 = Integer.parseInt(System.console().readLine());
		
		System.out.println("\nEscriba otro número del array.");
		int num2 = Integer.parseInt(System.console().readLine());
		
			
		for (int i = 0 ; i<100; i++) {
			
			if (numero[i]==num1){
				numero[i]=num2;
				System.out.print(" \""+numero[i]+"\" ");
				i++;//para que no lo muestre otra vez
			}
		 System.out.print(numero[i] + " ");
		}
	}
}
