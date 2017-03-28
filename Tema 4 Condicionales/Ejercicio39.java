/**
  Ejercicio 39
Escribe un programa que pida un número entero positivo por teclado y que
muestre a continuación los números desde el 1 al número introducido junto
con su factorial.**/


public class Ejercicio39 {
  public static void main(String[] args) {

    int numInt;

    System.out.print("Introduzca un número: ");
    numInt = Integer.parseInt(System.console().readLine());

    for (int n = 1; n <= numInt; n++) {

      int factorial = n;

      for (int i = 1; i < n; i++) {
        factorial *= i;
      }

      System.out.println(n + "! = " + factorial);
    }
  }
}
