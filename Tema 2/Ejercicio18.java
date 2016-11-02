/** Ejercicio 18
Escribe un programa que diga cuál es la primera cifra de un número entero
introducido por teclado. Se permiten números de hasta 5 cifras.**/

public class Ejercicio18{
	public static void main(String[]args){
	System.out.println("Escribe un número con más de una cifra.");
	int num = Integer.parseInt(System.console().readLine());
	if (num<10){
	System.out.println("El primer número es: " + (num));
	}  else if(num<100){
		System.out.println("El primer número es: " + (num/10));
	}  else if (num<1000){
		System.out.println("El primer número es: " + (num/100));
	} else if (num<10000){
			 System.out.println("El primer número es: " + (num/1000));
    } else if (num<10000){
			System.out.println("El primer número es: " + (num/10000));
	} else if (num<100000){
			System.out.println("El primer número es: " + (num/100000));
	}	else { System.out.println("No se permiten tantas cifras y tampoco numeros negativos");}
	}
}
 
