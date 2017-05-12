/**
Ejercicio 4
Realiza un programa que sea capaz de ordenar alfabéticamente las palabras
contenidas en un fichero de texto. El nombre del fichero que contiene las
palabras se debe pasar como argumento en la línea de comandos. El nombre
del fichero resultado debe ser el mismo que el original añadiendo la coletilla
sort, por ejemplo palabras_sort.txt. Suponemos que cada palabra ocupa una
línea.**/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Ejercicio04 {
	public static void main(String[] args) {
	
	try {
	
		// creo el fichero que voy a escribir y leer.
		BufferedWriter bw = new BufferedWriter(new FileWriter("palabras_sort.txt"));
		BufferedReader br = new BufferedReader(new FileReader("fichero.txt"));
		
		
		Vector<String> v = new Vector<String>();
		String linea = "0";
			
			while(linea != null) {			
				// Agregamos los nombres.
				v.addElement(linea);
				//lee
				linea = br.readLine();			
			}
		br.close();
		
	   //elimino el elemento 0
	   v.removeElementAt(0);
	   Collections.sort(v);
		  
			  for (String nombres: v) {
				bw.write(nombres + "\n ");
			  }

		  bw.close();
      }
	
	catch(IOException ioe){System.out.println("No se ha podido escribir en el fichero");	}
		
	}
}
