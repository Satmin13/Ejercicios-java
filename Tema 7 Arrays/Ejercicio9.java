/**
Ejercicio 9
Realiza un programa que pida 8 números enteros y que luego muestre esos
números junto con la palabra par o impar según proceda.
**/


import java.util.Scanner;

public class Ejercicio9{
	
	public static void main(String[]args)
	{
		
		Scanner s = new Scanner(System.in);
		int[] num = new int [8];
		int i;
		
		for (i = 0 ; i<8 ; i++) {
			System.out.println("Escribe un número entero y te diremos si es par o impar");
			num[i] = Integer.parseInt(s.nextLine());
		}
		
		for (i = 0 ; i<8 ; i++) {
			if (num[i]%2 == 0) 
			{
				System.out.println("El número " + num [i] + " es par." );
			} else {System.out.println("El número " + num [i] + " es impar." );}
		}
	}
}
