/**Ejercicio 13
Escribe un programa que lea una lista de diez números y determine cuántos
son positivos, y cuántos son negativos.**/
import java.util.Scanner;

public class Ejercicio13{
  
  public static void main(String[]args){
    
  System.out.println("Escribe 10 números y el programa determinará si son positivos o negativos");
  
  Scanner s = new Scanner(System.in);
  int positivo = 0;
  int negativo = 0;
  
    for(int i=0;i<10;i++){
      System.out.println("Escribe un número:");
      double numero = Double.parseDouble(s.nextLine());      
        if (numero>=0){
         positivo++;
        } else{negativo++;}
    }
    System.out.println("Números positivos: " + positivo + ". Números negativos" + negativo);

  }

}
