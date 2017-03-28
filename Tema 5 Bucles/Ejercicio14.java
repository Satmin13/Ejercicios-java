/**Ejercicio 14
Escribe un programa que pida una base y un exponente (entero positivo) y
que calcule la potencia.**/
import java.util.Scanner;

public class Ejercicio14{
  public static void main(String[]args){
    Scanner s = new Scanner (System.in);
    
    System.out.println("Escribe una base: ");
    double n = Double.parseDouble(s.nextLine());
    System.out.println("Escribe un exponente entero y positivo: ");
    int exp = Integer.parseInt(s.nextLine());
    
    int resultado = (int) Math.pow(n, exp);
    
    System.out.println("El resultado es: " + resultado);

  
  }
}
