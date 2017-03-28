/**
Ejercicio 46
Realiza un programa que pinte por pantalla un rectángulo hueco hecho con
asteriscos. Se debe pedir al usuario la anchura y la altura. Hay que comprobar
que tanto la anchura como la altura sean mayores o iguales que 2, en caso
contrario se debe mostrar un mensaje de error.
**/

public class Ejercicio46 {
  public static void main(String[] args) {

    System.out.print("Introduce la anchura del rectángulo (mínimo 2): ");
    int anchura = Integer.parseInt(System.console().readLine());

    System.out.print("Ahora introduce la altura (como mínimo 2): ");
    int altura = Integer.parseInt(System.console().readLine());

    if ((anchura < 2) || (altura < 2)) {

      System.out.print("El valor mínimo es 2.");
     

    } else {
    
      // Línea superior 
      for (int i = 1; i <= anchura; i++) {
        System.out.print("*");
      }
      
      // Parte intermedia
      System.out.print("\n*");
      for (int espacios = 2; espacios < anchura; espacios++) {
        System.out.print(" ");
      }
      System.out.println("*");

      // Línea inferior 
      for (int i = 1; i <= anchura; i++) {
        System.out.print("*");
      }
    } 
  }
}
