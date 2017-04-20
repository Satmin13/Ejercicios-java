/**
Ejercicio 11
Realiza un programa que pida 10 números por teclado y que los almacene en
un array. A continuación se mostrará el contenido de ese array junto al índice
(0 – 9) utilizando para ello una tabla. Seguidamente el programa pasará los
primos a las primeras posiciones, desplazando el resto de números (los que
no son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar
el array resultante.
**/
import java.util.Scanner;


public class Ejercicio11 {

	public static void main(String[]args) {
	
		double[] num = new double[10];
		double[] num2 = new double[10];
		
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
		
		System.out.print("\n\nNuevo array \nINDICES");
		
		for ( i = 0 ; i <10 ; i++) {
			System.out.print(" | " + i );
		}
		
		System.out.print("\nVALORES");
		
		for ( i = 0 ; i <10 ; i++) {
						
			if (num[i]==2) {
					num2[f] = num[i];
					f++;
				}
			for (double j = 2 ; j < num [i] ; j++){
				resto = num[i]%j;
				
				if (resto==0) {
					num2[k] = num[i];
					j = num[i];
					k--;					
				} 
				if (j==(num[i]-1)) {
					num2[f] = num[i];
					f++;
				}
			}
		}
		
		for ( i = 0 ; i <10 ; i++) {
			System.out.print(" | " + num2[i] );
		}
		
		System.out.println();
	}
}
