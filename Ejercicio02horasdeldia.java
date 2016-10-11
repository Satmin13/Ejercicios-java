/** Ejercicio 2
Realiza un programa que pida una hora por teclado y que muestre luego
buenos días, buenas tardes o buenas noches según la hora. Se utilizarán los
tramos de 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en
cuenta las horas, los minutos no se deben introducir por teclado.**/

public class Ejercicio02horasdeldia{
	public static void main (String[] args)
	{
    System.out.print("¿Qué hora es? escríbelo con números: ");
    double horadia = Double.parseDouble(System.console().readLine());
    
    if (horadia > 6 && horadia < 12) {          
      System.out.println("Buenos días! ");         
    } else if (horadia > 12 && horadia < 20) {
          System.out.println("Buenas tardes");       
    	} else{
          System.out.println("Buenas noches");
          }    
  }
  
}
