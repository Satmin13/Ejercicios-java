/**
Ejercicio 2
Realiza un programa que lea el fichero creado en el ejercicio anterior y que
muestre los números por pantalla.**/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;


public class Ejercicio02 {
	public static void main(String[] args) {
	
	try {
		BufferedReader bf = new BufferedReader(new FileReader("primos.txt"));
		String linea = "0";
		
			while (linea != null) {
			linea = bf.readLine();	
			System.out.println(linea);
		
			}							
	bf.close();
	}
	catch(IOException ioe){System.out.println("No se ha podido leer en el fichero");}
}
}
