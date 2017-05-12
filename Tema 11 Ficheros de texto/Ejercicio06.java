/**
Ejercicio 6
Realiza un programa que diga cuántas ocurrencias de una palabra hay en un
fichero. Tanto el nombre del fichero como la palabra se deben pasar como
argumentos en la línea de comandos.**/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;


public class Ejercicio06 {
	public static void main(String[] args) {
	
	try {
	
	BufferedReader br = new BufferedReader(new FileReader("gatos.txt"));
	
	String linea = "";
	String introducida = "Da";
	int suma = 0;
	int i=0;
	
	while((linea = br.readLine()) != null){
	    
		while ((i = linea.indexOf(introducida)) != -1) {
			    linea = linea.substring(i + introducida.length(), linea.length());
				suma = suma + 1;
		}
	}	

	br.close();	
	System.out.println("La palabra " + introducida + " aparece " + suma + " veces.");

	}catch(IOException ioe){System.out.println("No se ha podido escribir en el fichero");}
	}
}
