/**
Ejercicio 3
Escribe un programa que guarde en un fichero el contenido de otros dos
ficheros, de tal forma que en el fichero resultante aparezcan las líneas de los
primeros dos ficheros mezcladas, es decir, la primera línea será del primer
fichero, la segunda será del segundo fichero, la tercera será la siguiente del
primer fichero, etc.
Los nombres de los dos ficheros origen y el nombre del fichero destino se deben
pasar como argumentos en la línea de comandos.
Hay que tener en cuenta que los ficheros de donde se van cogiendo las líneas
pueden tener tamaños diferentes.**/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;


public class Ejercicio03 {
	public static void main(String[] args) {
	
	try {
	
	// creo el fichero que voy a escribir, mascotas, y los que leere, gatos y perros.
	BufferedWriter bw = new BufferedWriter(new FileWriter("mascotas.txt"));
	BufferedReader br = new BufferedReader(new FileReader("gatos.txt"));
	BufferedReader br1 = new BufferedReader(new FileReader("perros.txt"));
	
	// sube los parametros de ficheros por comandos
	//$ java Ejercicio03 gatos perros -> en linea de comandos
	//BufferedReader br = new BufferedReader(new FileReader(args[0] + ".txt"));
	//BufferedReader br = new BufferedReader(new FileReader(args[1] + ".txt"));
	
	String linea1 = "0";
	String linea2 = "0";
	
		while ( (linea1 != null) || (linea2 != null) ) {
			linea1 = br.readLine();
			linea2 = br1.readLine();
			if (linea1 != null) bw.write(linea1 + "\n ");
			if (linea2 != null) bw.write(linea2 + "\n " );
		}
	bw.close();
	br.close();
	br1.close();
	}
	catch(IOException ioe){System.out.println("No se ha podido escribir en el fichero");
	}
		
}}
