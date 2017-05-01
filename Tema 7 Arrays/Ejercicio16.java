/*Ejercicio 16
Escribe un programa que rellene un array de 20 elementos con números enteros
aleatorios comprendidos entre 0 y 400 (ambos incluidos). A continuación
el programa mostrará el array y preguntará si el usuario quiere resaltar los
múltiplos de 5 o los múltiplos de 7. Seguidamente se volverá a mostrar el
array escribiendo los números que se quieren resaltar entre corchetes.
**/
import java.util.Scanner;
public class Ejercicio16 {

	public static void main(String[]args) {
		
		Scanner s = new Scanner(System.in);
		int [] num = new int [20];
		int i;
		int alea;
		for (i=0 ; i<20 ; i++) {
			alea = (int)(Math.random() * 401  );
			num[i] = alea;
			}
		
		for (i=0 ; i<20 ; i++) {
			System.out.print(num[i] + " | " );
			}
		
		System.out.println("\n¿Qué múltiplos resaltarás, los de 5 o 7?");
		int multiplos = s.nextInt();

		if ( multiplos == 5 ){
			for (i=0 ; i<20 ; i++) {
				
				if (num[i]%5 == 0) {System.out.print( "[" +num[i] + "] | " );
				} else{
					System.out.print(num[i] + " | " );}
			}
		}
		
		if ( multiplos == 7 ){
			for (i=0 ; i<20 ; i++) {
				
				if (num[i]%7 == 0) {System.out.print( "[" +num[i] + "] | " );
				} else{
					System.out.print(num[i] + " | " );}
			}
		}
	}

}
