/**
Ejercicio 8
Realiza un programa que pida la temperatura media que ha hecho en cada mes
de un determinado año y que muestre a continuación un diagrama de barras
horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
de asteriscos o cualquier otro carácter.**/

import java.util.Scanner;

public class Ejercicio8{
	
	public static void main(String[]args)
	{
		
		Scanner s = new Scanner(System.in);
		double[] tempMes = new double [12];
		int i;
		
		for( i =0 ; i<12 ; i++){
			System.out.println("Temperatura mes " + (i+1));
			tempMes[i] = Double.parseDouble(s.nextLine());
		}
		for( i =0 ; i<12 ; i++){
			System.out.println("Temperatura mes " + (i+1));
			for (double j =0 ; j<tempMes[i] ; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
