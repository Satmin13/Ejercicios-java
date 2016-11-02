/**
*	Ejercicio 6
*	Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás
*	utilizando un bucle do while.
**/
public class Ejercicio6{
	public static void main(String[]args){
		int n = 320;
		do{
			n -= 20;
			System.out.println("El numero es " + n);
			}
		while(n > 160);
		
	}
}
