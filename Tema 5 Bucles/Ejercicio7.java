/**Ejercicio 7
Realiza el control de acceso a una caja fuerte. La combinación será un
número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
acertamos, se nos mostrará el mensaje Lo siento, esa no es la combinación
y si acertamos se nos dirá La caja fuerte se ha abierto satisfactoriamente.
Tendremos cuatro oportunidades para abrir la caja fuerte.
**/
public class Ejercicio7{
	public static void main(String[]args){
		int combinacion = 9876;
		int intentos = 0;
		int respuesta;
		do{
			System.out.println("¿Cuál es la combinación? tienes 4 intentos.");
			respuesta = Integer.parseInt(System.console().readLine());
			intentos++;
			
			} while ((intentos < 4) && (respuesta != combinacion));
	}
}
