/** Ej. 14
Realiza un programa que diga si un número introducido por teclado es par y/o
divisible entre 5.**/

public class Ejercicio14{
	public static void main(String[]args){
	System.out.println("Escribe un número.");
	int a = Integer.parseInt(System.console().readLine());
	double resto1 = a%2;
	double resto2 = a%5;
		if (a%2==0){
			System.out.println("El número es par. ");
		} else {System.out.println("El número es impar ");}
		if (a%5==0){
			System.out.println("El número es divisible entre 5. ");
		}	else {System.out.println("El número no es divisible entre 5.");}
	}
}
