/**
Ejercicio 25
Realiza un programa que pida un número por teclado y que luego muestre ese
número al revés.**/

public class Ejercicio25{
	public static void main(String[]args){
		System.out.println("Escribe un número");
		int num = Integer.parseInt(System.console().readLine());
		int numFinal = 0;
		int reves = 0;
		
		for(int i = 0 ; i <= num ; i++){
		numFinal = num%10;
		reves = (reves*10)+(numFinal);
		num /= 10;	
		
		}		
		System.out.println("El número al revés es: " + reves);
	}
}
