/**Ejercicio 17
Escribe un programa que diga cuál es la última cifra de un número entero
introducido por teclado.**/

public class Ejercicio17{
	public static void main(String[]args){
	System.out.println("Escribe un número con más de una cifra.");
	int num = Integer.parseInt(System.console().readLine());
	System.out.println("El último número es: " + (num%10));
	}
}
