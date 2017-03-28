/**
Ejercicio 20
Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca.**/

public class Ejercicio20{
	public static void main(String[]args){
	System.out.print("Escribe una altura para dibujar la pirámide(número positivo): ");
	int alturaInt = Integer.parseInt(System.console().readLine());
	System.out.print("Escribe UN carácter para dibujar la pirámide: ");
	String letra = System.console().readLine();
	
	int altura = 1;
    int i = 0;
    int espacios = alturaInt-1;
    int espaciosInt = 0;
    
    while (altura <= alturaInt) {
      
      // inserta espacios
      for (i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }

      // pinta la línea
      System.out.print(letra);
      for (i = 1; i < espaciosInt; i++) {
        System.out.print(" ");
      }
      
      if (altura>1) {
        System.out.print(letra);
      }

      System.out.println();

      altura++;
      espacios--;
      espaciosInt += 2;
    }//fin while
    
     // pinta la base
      for (i = 1; i < (altura*2-2); i++) {
        System.out.print(letra);        
      }
	
	}
}
