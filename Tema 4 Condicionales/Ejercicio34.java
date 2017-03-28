/**
Ejercicio 34
Escribe un programa que pida dos números por teclado y que luego mezcle en
dos números diferentes los dígitos pares y los impares. Se van comprobando
los dígitos de la siguiente manera: primer dígito del primer número, primer
dígito del segundo número, segundo dígito del primer número, segundo
dígito del segundo número, tercer dígito del primer número… Para facilitar
el ejercicio, podemos suponer que el usuario introducirá dos números de la
misma longitud y que siempre habrá al menos un dígito par y uno impar. Usa
long en lugar de int donde sea necesario para admitir números largos.
**/

public class Ejercicio34 {

  public static void main(String[] args) {

  
    System.out.print("Introduzca un número: ");
    long numIntroducido1 = Long.parseLong(System.console().readLine());

    System.out.print("Introduzca otro número: ");
    long numIntroducido2 = Long.parseLong(System.console().readLine());

    // Voltea el primer número y calcula la longitud 
    
    long numero = numIntroducido1;
    long volteado1 = 0;
    int longitud = 0;
    
    if (numero == 0) {
      longitud = 1;
    }
    
    while (numero > 0) {
      volteado1 = (volteado1 * 10) + (numero % 10);
      numero /= 10;
      longitud++;
    } // while

    // Voltea el segundo número 
    numero = numIntroducido2;
    long volteado2 = 0;
    
    while (numero > 0) {
      volteado2 = (volteado2 * 10) + (numero % 10);
      numero /= 10;
    } // while

    // Recorre los dos números volteados para formar los dos resultados 
    long resulPares = 0;
    long resulImpares = 0;
    int digito;
    
    for (int i = 0; i < longitud; i++) {

      digito = (int)(volteado1 % 10);

      if ((digito % 2) == 0) {
        resulPares = resulPares * 10 + digito;
      } else {
        resulImpares = resulImpares * 10 + digito;
      }

      digito = (int)(volteado2 % 10);

      if ((digito % 2) == 0) {
        resulPares = resulPares * 10 + digito;
      } else {
        resulImpares = resulImpares * 10 + digito;
      }

      volteado1 /= 10;
      volteado2 /= 10;
    }
    
    // Muestra el resultado 
    System.out.println("El número de dígitos pares es: " + resulPares);
    System.out.println("El número de dígitos impares es: " + resulImpares);
  }
}

