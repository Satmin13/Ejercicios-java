/**
Ejercicio 41
Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares
hay dentro de un número. Se recomienda usar long en lugar de int ya que el
primero admite números más largos.
**/

public class Ejercicio41 {
  public static void main(String[] args) {

    System.out.print("Por favor, introduzca un número entero positivo: ");
    long numeroIntroducido = Long.parseLong(System.console().readLine());
    
    long n = numeroIntroducido;
    int cuentaPares = 0;
    int cuentaImpares = 0;
        
    while (n > 0) {
      if ((n % 10) % 2 == 0) {
        cuentaPares++;
      } else {
        cuentaImpares++;
      }
      n /= 10;
    }
    System.out.print("El " + numeroIntroducido + " contiene " + cuentaPares + " dígitos pares y " + cuentaImpares + " dígitos impares.");
  }
}
