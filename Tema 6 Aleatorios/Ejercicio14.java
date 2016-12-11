/** Ejercicio 14
Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6.
El programa intentará adivinar el número que estás pensando - un número
entre 0 y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el
programa debe preguntar si el número que estás pensando es mayor o menor
que el que te acaba de decir.**/


public class Ejercicio14 {

  public static void main(String[] args) {
    
    int oportunidades = 5;
    int numeroPensado;
    int minimo = 0;
    int maximo = 100;
    boolean acertado = false;
    int mayorMenorOIgual;
        
    System.out.println("Piensa un número del 0 al 100. Intentaré adivinarlo en 5 intentos.");
    System.out.println("Pulsa la tecla INTRO cuando estés preparado.");
    System.console().readLine();

    do {
      numeroPensado = (int)(Math.random() * (maximo - minimo) + minimo);
      System.out.println("¿Es el " + numeroPensado + "?");
      System.out.print("El número que estás pensando es 1) mayor 2) menor 3) el mismo: ");
      mayorMenorOIgual = Integer.parseInt(System.console().readLine());
      oportunidades--;

      if ( (mayorMenorOIgual == 1) && (oportunidades > 0) )
        minimo = numeroPensado + 1;
      
      if ( (mayorMenorOIgual == 2) && (oportunidades > 0) )
        maximo = numeroPensado - 1;
      
      if (mayorMenorOIgual == 3) {
        acertado = true;
        System.out.println("¡Bien! ¡he acertado!");
      }
    } while(!acertado && (oportunidades > 0));
    
    if (!acertado) {
      System.out.println("Vaya, no he conseguido acertar el número.");
    }
  }
}
