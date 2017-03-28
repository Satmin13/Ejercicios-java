/**
Ejercicio 32
Escribe un programa que, dado un número entero, diga cuáles son y cuánto
suman los dígitos pares. Los dígitos pares se deben mostrar en orden, de
izquierda a derecha. Usa long en lugar de int donde sea necesario para admitir
números largos.
Ejemplo 1:
Por favor, introduzca un número entero positivo: 94026782
Dígitos pares: 4 0 2 6 8 2
Suma de los dígitos pares: 22
**/

public class Ejercicio32 {

  public static void main(String[] args) {
    
    System.out.print("Por favor, introduzca un número entero positivo: ");
    long numInt = Long.parseLong(System.console().readLine());

    // Le da la vueta al número y calcula la longitud
    long num = numInt;
    long volteado = 0;
    int longitud = 0;
    
    if (num == 0) {
      longitud = 1;
    }
    
    while (num > 0) {
      volteado = (volteado * 10) + (num % 10);
      num /= 10;
      longitud++;
    } // while

    // Muestra los dígitos pares
    System.out.print("Dígitos pares: ");

    int digito;
    int sumaPares = 0;
    
    for (int i = 0; i < longitud; i++) {

      digito = (int)(volteado % 10);

      if ((digito % 2) == 0) {
        System.out.print(digito + " ");
        sumaPares += digito;
      }

      volteado /= 10;
    }
    
    // Muestra la suma de los dígitos pares
    System.out.println("\nLa suma de los dígitos pares es: " + sumaPares);
  }
}

