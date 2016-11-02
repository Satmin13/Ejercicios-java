/**Ejercicio 3
Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do-while.
**/

public class Ejercicio3{
	public static void main(String[]args){
				
		int numero = 0;
		do {
			numero += 5;
			System.out.println(numero + " es múltiplo de 5.");
		} while (numero<100);
		
	}
}
