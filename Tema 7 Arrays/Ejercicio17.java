/**
Ejercicio 17
Escribe un programa que muestre por pantalla un array de 10 números enteros
generados al azar entre 0 y 100. A continuación, el programa debe pedir
un número al usuario. Se debe comprobar que el número introducido por
teclado se encuentra dentro del array, en caso contrario se mostrará un
mensaje por pantalla y se volverá a pedir un número; así hasta que el usuario
introduzca uno correctamente. A continuación, el programa rotará el array
hacia la derecha las veces que haga falta hasta que el número introducido
quede situado en la posición 0 del array. Por último, se mostrará el array rotado
por pantalla.**/

import java.util.Scanner;
public class Ejercicio17 {

	public static void main(String[]args) {
		
		Scanner s = new Scanner(System.in);
		int [] num = new int [10];
		int [] num2 = new int [10];
		int i;
		int alea;
		int j =1;
		for (i=0 ; i<10 ; i++) {
			alea = (int)(Math.random() * 101  );
			num[i] = alea;
			}
		
		for (i=0 ; i<10 ; i++) {
			System.out.print(num[i] + " | " );
			}
			
		System.out.println("\n¿Qué número quiere colocar en la posición 0?");
		int elegido = s.nextInt();
		
		for (i=0 ; i<10 ; i++) {
			if (num[i] == elegido ) {
			num2[0] = elegido;
			num[i] = num [0];			 
			}
		}
		for(i=1 ; i<10 ; i++) {
		num2[j] = num[i];		
		j++;}
		
		for (i=0 ; i<10 ; i++) {
			System.out.print(num2[i] + " | " );
			}
	}
}
