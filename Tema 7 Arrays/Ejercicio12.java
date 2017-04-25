/**
Ejercicio 12
Realiza un programa que pida 10 números por teclado y que los almacene en
un array. A continuación se mostrará el contenido de ese array junto al índice
(0 – 9). Seguidamente el programa pedirá dos posiciones a las que llamaremos
iniy fin Se debe comprobar que inicial es menor que final y que
ambos números están entre 0 y 9. El programa deberá colocar el número de
la posición inicial en la posición final, rotando el resto de números para que no
se pierda ninguno. Al final se debe mostrar el array resultante.
**/
import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[]args) {
	
		int[] num = new int[10];
		int[] num2 = new int[10];
		
		Scanner s = new Scanner(System.in);
		int i;
		double resto;
		int f = 0;
		int k = 9;

		for ( i = 0 ; i <10 ; i++) {
			System.out.print(" Di un número, son 10 en total: ");
			num[i] = Integer.parseInt(s.nextLine());
		}
		
		System.out.print("Primer Array \nINDICES");
		
		for ( i = 0 ; i <10 ; i++) {
			System.out.print(" | " + i );
		}
		
		System.out.print("\nVALORES");
		
		for ( i = 0 ; i <10 ; i++) {
			System.out.print(" | " + num[i] );
		}
		
		System.out.println(" \nDi una posición inicial para cambiar su número a otra posición: (de 0  a 9): ");
		int numIni = Integer.parseInt(s.nextLine());
		System.out.println(" Di la posición final (de 0 a 9): ");
		int numFin = Integer.parseInt(s.nextLine());
		
		if (numIni>=0 && numFin<=9 && numIni<numFin) {
			System.out.print("Segundo Array \nINDICES");
		
			for ( i = 0 ; i <10 ; i++) {
				System.out.print(" | " + i );
			}
			for (i = 0; i < 10; i++) {
			  num2[i] = num[i];
			}
			
			num2[numFin] = num[numIni];
			
			for (i = numFin + 1; i < 10; i++){
			  num2[i] = num[i - 1];			
			  num2[0] = num[9];}
			  
			
			
			System.out.print("\nVALORES");
				
			  for (i = 0; i < 10; i++) {
				System.out.print( " | " + num2[i]);
			  }
			  System.out.println();
		} else {System.out.print(" Valores incorrectos ");}
			
	}
}
