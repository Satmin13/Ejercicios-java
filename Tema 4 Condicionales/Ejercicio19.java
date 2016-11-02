/** Ejercicio 19
Realiza un programa que nos diga cuántos dígitos tiene un número entero que
puede ser positivo o negativo. Se permiten números de hasta 5 dígitos. **/

public class Ejercicio19 {

  public static void main(String[] args) {
    
    int numero = 0;
    int cifras = 0;
    
    System.out.print("Introduzca un número entero, 5 cifras como máximo.: ");
    n = Math.abs(Integer.parseInt(System.console().readLine()));
    
    if ( numero < 10 ) {
      cifras = 1;
    }    
    if (( numero >= 10 ) && ( numero < 100 )) {
      cifras = 2;
    }    
    if (( numero >= 100 ) && ( numero < 1000 )) {
      cifras = 3;
    }    
    if (( numero >= 1000 ) && ( numero < 10000 )) {
      cifras = 4;
    }    
    if ( numero >= 10000 ) {
      cifras = 5;
    }    
    System.out.prinumerotln("El número introducido tiene " + cifras + " cifras.");
  }
}

