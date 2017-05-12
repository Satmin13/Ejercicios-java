/**
Ejercicio 1
Escribe un programa que guarde en un fichero con nombre primos.dat los
números primos que hay entre 1 y 500. **/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;


public class Ejercicio01 {
	public static void main(String[] args) {
	
	try {
	
	// crea un fichero nuevo con el nombre primos.txt
	BufferedWriter bw = new BufferedWriter(new FileWriter("primos.txt"));
		for (int i = 1; i < 501; i++) {
        if (esPrimo(i)) {
          bw.write(i + "\n ");
        }
      }				
			
	bw.close();
	}
	catch(IOException ioe){System.out.println("No se ha podido escribir en el fichero");}
}

public static boolean esPrimo(int x) {
    for (int i = 2; i < x; i++) {
      if ((x % i) == 0) {
        return false;
      }
    }
    return true;
  }
}
