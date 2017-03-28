/**
Ejercicio 36
Escribe un programa que diga si un número introducido por teclado es o no
capicúa. Los números capicúa se leen igual hacia delante y hacia atrás. El
programa debe aceptar números de cualquier longitud siempre que lo permita
el tipo, en caso contrario el ejercicio no se dará por bueno. Se recomiend
**/

public class Ejercicio36 {

  public static void main(String[] args) {

    System.out.print("Por favor, introduzca un número positivo: ");
    long numIntroducido = Long.parseLong(System.console().readLine());

    // Voltea el número introducido.
    long numero = numIntroducido;
    long volteado = 0;

    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
    } // while
    
    if (volteado == numIntroducido) {
      System.out.println("El " + numIntroducido + " es capicúa");
    } else {
      System.out.println("El " + numIntroducido + " no es capicúa");
    }
  }
}
