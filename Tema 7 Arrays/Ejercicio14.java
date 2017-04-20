/**
Ejercicio 14
Escribe un programa que pida 8 palabras y las almacene en un array. A
continuación, las palabras correspondientes a colores se deben almacenar al
comienzo y las que no son colores a continuación. Puedes utilizar tantos arrays
auxiliares como quieras. Los colores que conoce el programa deben estar en
otro array y son los siguientes: verde, rojo, azul, amarillo, naranja, rosa, negro,
blanco y morado.
**/

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String [] args) {
		
		Scanner s = new Scanner(System.in);
		String[] introducido = new String[8];
		String[] colores = new String[8];
		int i;
		int j = 0;
		int l = 7;
		
			for (i = 0 ; i < 8 ; i++) {
			System.out.println("Escribe 8 palabras: ");
			introducido[i] = s.next();				
				if (introducido[i].equals("verde") || introducido[i].equals("rojo") || introducido[i].equals("azul") || introducido[i].equals("amarillo") || introducido[i].equals("rosa") || introducido[i].equals("negro") || introducido[i].equals("blanco") || introducido[i].equals("morado")){
						colores[j]= introducido[i];	
						j++;
				} else {
					colores[l] = introducido[i]; 
					l--;	
				  }
			}
			
			for ( i = 0 ; i < 8 ; i++) {System.out.print(colores[i] + " ");}
			
	}
}
