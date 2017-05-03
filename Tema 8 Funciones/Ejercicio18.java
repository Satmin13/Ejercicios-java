/**
Ejercicio 18
Escribe un programa que pase de decimal a binario.
**/
import java.io.*;
import java.util.Scanner;

public class Ejercicio18 {
	
	public static void main (String[]args) { 
	Scanner s = new Scanner(System.in);
	
		System.out.println("Escribe un número decimal y lo pasaremos a binario.");
		int decimal = s.nextInt();
		System.out.println( dBin.decimalBinario(decimal) );
			
	}
}

class dBin {
	public static int [] decimalBinario(int decimal) {
		
		int longitud;		
		int dec = decimal;
		
		for (longitud = 0 ; dec >= 1 ; longitud++) {
			dec = dec/2;			
		}
		int [] num = new int [longitud];
		for (int i = 0 ; decimal >= 1 ; i++) {
			num[i] = decimal%2;
			decimal = decimal/2;			
		}		
		
		for (int  i = (num.length - 1); i >= 0; i--){System.out.print(num[i]);}
		return num;
	}
}
