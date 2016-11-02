/**
 * Ejercicio 9
	Realiza un programa que nos diga cuántos dígitos tiene un número introducido
	por teclado.**/
public class Ejercicio9{
	public static void main(String[]args){
	System.out.println("Escribe un número y te diremos sus dígitos.");
	int num = Integer.parseInt(System.console().readLine());
		int j = 1;
			for(int i=10; i<num ; i *=10){
				j++;
			}
			System.out.println("El número tiene: " + j  "dígitos.");
		
	}
}
