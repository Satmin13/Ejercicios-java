/**Ejercicio 26
Realiza un programa que pida primero un número y a continuación un dígito.
El programa nos debe dar la posición (o posiciones) contando de izquierda a
derecha que ocupa ese dígito en el número introducido.**/

public class Ejercicio26{
	
	public static void main(String[]args){
		System.out.println("Escribe un número");
		int num = Integer.parseInt(System.console().readLine());
		System.out.println("Escribe un dígito");
		int dig = Integer.parseInt(System.console().readLine());
		int numFinal = 0;
		
			// le da la vueta al número y calcula la longitud
		int numero = num;
		int volteado = 0;
		int longitud = 0;
		int posicion = 1;
		
		if (numero == 0) {
		  longitud = 1;
		}
		
		while (numero > 0) {
		  volteado = (volteado * 10) + (numero % 10);
		  numero /= 10;
		  longitud++;
		} // while
			
		// comprueba la posición
		while (volteado > 0) {
		  if ((volteado % 10) == dig) {
			System.out.print(posicion + " ");
		  }
		  volteado /= 10;
		  posicion++;
		} 

		System.out.println();
	}
}
