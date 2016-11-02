/**Ejercicio 11
Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
los 5 primeros números enteros a partir de uno que se introduce por teclado.
**/
public class Ejercicio11{
		public static void main(String[]args){
			System.out.println("Inserta un número entero y calcularemos el cuadrado y el cubo de el mismo y los 4 nº posteriores.");
			int num = Integer.parseInt(System.console().readLine());
			System.out.println("_____________________________________");
			System.out.println("  Numero  |   Cuadrado   |    Cubo   ");
			System.out.println("__________|______________|___________");
			for(int i = num; i<(num+5) ; i++){				
				System.out.println( "   " + i +  "     |      " +  (i*i)  + "    |    " + (i*i*i) + "    ");
			}
		}
}

