/**
1. Muestra por pantalla una secuencia aleatoria de 10 números múltiplos de 7 comprendidos entre el 140
y el 210 ambos incluidos.
Ejemplo:
203 322 140 336 217 203 175 266 301 182
**/

public class Ex6Ejercicio01 {
  public static void main(String []args) {
    
   
    boolean fin = false;
     int i = 0;
     int minimo = 140;

    do {
    int num = (int)(Math.random() * (70) + minimo);
    
      if (num%7 == 0) {
        System.out.print(num + " ");
        i++;
          if (i == 10) {
            fin = true;
          }
      }
    } while (fin == false);

    
  }
}
