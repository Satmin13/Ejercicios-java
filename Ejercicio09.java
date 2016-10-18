/**Ejercicio 9
Realiza un programa que resuelva una ecuación de segundo grado (del tipo
ax2 + bx + c = 0).**/

public class Ejercicio09{
		public static void main(String[]args){
			System.out.println("Escribe a para una ecuación de segundo grado: ");
			double a = Double.parseDouble(System.console().readLine());
			System.out.println("Escribe b para una ecuación de segundo grado: ");
			double b = Double.parseDouble(System.console().readLine());
			System.out.println("Escribe c para una ecuación de segundo grado: ");
			double c = Double.parseDouble(System.console().readLine());
			double hacerRaiz = (b*b) - (4*a*c);
			double x = (Math.abs(b) + Math.sqrt(hacerRaiz))  / (2*a);
			double xNegativa = (Math.abs(b) - Math.sqrt(hacerRaiz))  / (2*a);
			System.out.printf("La x tiene el valor de: %4.2f %4.2f y", x, xNegativa);
		}
}
