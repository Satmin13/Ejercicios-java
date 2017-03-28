/**
Ejercicio 18
Escribe un programa que obtenga los números enteros comprendidos entre
dos números introducidos por teclado y validados como distintos, el programa
debe empezar por el menor de los enteros introducidos e ir incrementando de
7 en 7. **/

public class Ejercicio18{
	public static void main(String[]args){
		int num1=0;
		int num2=0;
		do{
		System.out.println("Escribe un número entero.");
		num1 = Integer.parseInt(System.console().readLine());
		System.out.println("Escribe otro número entero.");
		num2 = Integer.parseInt(System.console().readLine());
			for(int i=num1; i<=num2; i+=7){
				System.out.println("EL siguiente numero entre " + num1 + " y " + num2 + " incrementado de 7 en 7 es: " + i);
			}
		}while(num1<0 && num2<0);
	}	
}
