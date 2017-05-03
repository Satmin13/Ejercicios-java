/**
Ejercicio 17
Escribe un programa que pase de binario a decimal.**/
import java.io.*;
import java.util.Scanner;

public class Ejercicio17 {
	
	public static void main (String[]args) {
		
		Scanner s = new Scanner(System.in);
	
		System.out.println("Escribe un número binario y lo pasaremos a decimal.");
		String binario = s.nextLine();
		System.out.println( "El número " + binario + " es " + bDec.binarioDecimal(binario) );
		
		
	}
}
class bDec {
	
	public static int binarioDecimal(String binario) {
		
		int suma = 0;
		int longitud = binario.length()-1;
		
		 for ( int i = longitud; i >= 0; i--){
			if (binario.charAt(longitud-i) == '1'){
				suma += Math.pow(2,i);
			} 
		 }
			
		return suma;
		}
	
}
	
	
