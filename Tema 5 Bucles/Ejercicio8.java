/**
Ejercicio 8
Muestra la tabla de multiplicar de un número introducido por teclado.
**/
public class Ejercicio8{
	public static void main(String[]args){
	System.out.println("Escribe un numero y te diremos su tabla de multiplicar.");
	int num = Integer.parseInt(System.console().readLine());
	
		for(int i = 1; i<=10; i++)
		{
			System.out.println(num + " x " + i + " = " + (num*i));
		}
	}
}
