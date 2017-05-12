/**
Ejercicio 5
Escribe un programa capaz de quitar los comentarios de un programa de Java.
Se utilizaría de la siguiente manera:
quita_commentarios PROGRAMA_ORIGINAL PROGRAMA_LIMPIO
Por ejemplo:
quita_comentarios hola.java holav2.java
crea un fichero con nombre holav2.java que contiene el código de hola.java pero
sin los comentarios.**/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;


public class Ejercicio05 {
	public static void main(String[] args) {
	
	try {
	
	// creo el fichero que voy a escribir, holav2.java, y lo que leere, hola.java.
	BufferedWriter bw = new BufferedWriter(new FileWriter("holav2.txt"));
	BufferedReader br = new BufferedReader(new FileReader("hola.txt"));
	
		String linea1 = "";
		String linea2 = "";
		boolean comentario = false;
		int i = 0;
		
		while ((linea1 = br.readLine()) != null) {
			int l = linea1.length();
			linea2 = linea1;

			// Detecta inicio de comentario de bloque 
			if ((i = linea1.indexOf("/*")) != -1) {
			  comentario = true;
			  linea2 = linea1.substring(0, i);
			  linea1 = linea2;
			}
			
			// Detecta fin de comentario de bloque 
			if ((i = linea1.indexOf("*/")) != -1) {
			  comentario = false;
			  linea2 = linea1.substring(i + 2, l);
			}
			// Detecta comentario de línea
			if (((i = linea1.indexOf("//")) != -1) && !comentario) {
			  linea2 = linea1.substring(0, i);
			}

			if (!comentario) {
			  bw.write(linea2 + "\n");
			}
		}
		
		br.close();
		bw.close();
	}
	
	catch (IOException ioe){System.out.println("No se ha podido escribir en el fichero");}
	}
}
