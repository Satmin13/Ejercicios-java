/**
Ejercicio 19
Realiza un programa que pinte una pirámide por pantalla. La altura se debe
pedir por teclado. El carácter con el que se pinta la pirámide también se debe
pedir por teclado.
**/

public class Ejercicio19{
	public static void main(String[]args){
	System.out.print("Escribe una altura para dibujar la pirámide(número positivo): ");
	int alturaInt = Integer.parseInt(System.console().readLine());
	System.out.print("Escribe UN carácter para dibujar la pirámide: ");
	String letra = System.console().readLine();
	
	int altura = 1;
    int i = 0;
    int espacios = alturaInt-1;
    
    while (altura <= alturaInt) {
      
      // inserta espacios
      for (i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }

      // pinta la línea
      for (i = 1; i < altura * 2; i++) {
        System.out.print(letra);
      }

      System.out.println();

      altura++;
      espacios--;
    }
	
	}
}
