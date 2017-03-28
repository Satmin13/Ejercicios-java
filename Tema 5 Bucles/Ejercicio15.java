/**
Ejercicio 15
Escribe un programa que dados dos números, uno real (base) y un entero
positivo (exponente), saque por pantalla todas las potencias con base el
numero dado y exponentes entre uno y el exponente introducido. No se deben
utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 5,
se deberán mostrar 2 1 , 2 2 , 2 3 , 2 4 y 2 5 .
**/
import java.util.Scanner;

public class Ejercicio15 {
  public static void main(String[]args){
  Scanner s = new Scanner (System.in);
  
  System.out.print("Escribe una base: ");
  double base = Double.parseDouble(s.nextLine());
  System.out.print("Escribe un exponente (entero positivo): ");
  int exponente = Integer.parseInt(s.nextLine());
  
  for(int i=0; i<=exponente ; i++)
  {
      System.out.println("El resultado de: " + base + " elevado a " + i + " es " + Math.pow(base, i));
  }
  

  }
}
