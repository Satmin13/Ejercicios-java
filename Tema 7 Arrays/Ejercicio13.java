/**
Ejercicio 13
Escribe un programa que rellene un array de 100 elementos con números enteros
aleatorios comprendidos entre 0 y 500 (ambos incluidos). A continuación
el programa mostrará el array y preguntará si el usuario quiere destacar el
máximo o el mínimo. Seguidamente se volverá a mostrar el array escribiendo
el número destacado entre dobles asteriscos.
**/

import java.util.Scanner;
public class Ejercicio13 {

	public static void main(String[]args) {
		
		Scanner s = new Scanner(System.in);
		int [] num = new int [100];
		int i;
		int minimo = 500;
		int maximo = 0;
		int alea;
		for (i=0 ; i<100 ; i++) {
			alea = (int)(Math.random() * 501  );
			num[i] = alea;
			}
		
		for (i=0 ; i<100 ; i++) {
			System.out.print(num[i] + " | " );
			}
		
		System.out.println("\n¿Qué desea resaltar el máximo o el mínimo? Para máximo pulse 1 y para mínimo 0.");
		int resaltar = s.nextInt();
		
		if (resaltar == 0) {
			
			for (i=0 ; i<100 ; i++) {
				if (num[i] < minimo) {
					minimo = num[i];
					}
			}
			for (i=0 ; i<100 ; i++) {
				if (num[i] == minimo) {
					System.out.print(" | * " + num[i] + " * | ");
					} else { System.out.print(" | " + num[i] + " | ");}
			}
		} //end if minimo
		
		if (resaltar == 1) {
			
			for (i=0 ; i<100 ; i++) {
				if (num[i] > maximo) {
					maximo = num[i];}
			}
			for (i=0 ; i<100 ; i++) {
				if (num[i] == maximo) {
					System.out.print(" | * " + num[i] + " * | ");} 
					else {System.out.print(" | " + num[i] + " | ");}
			}
		}
	}
}
