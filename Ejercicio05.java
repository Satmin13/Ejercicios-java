/**Realiza un programa que resuelva una ecuación de primer grado (del tipo ax +
b = 0).
* **/
public class Ejercicio05{
	public static void main(String[] args){
	System.out.println("Escribe a para una ecuación de primer grado: ");
	double a = Double.parseDouble(System.console().readLine());
	System.out.println("Escribe b para una ecuación de primer grado: ");
	double b = Double.parseDouble(System.console().readLine());
	System.out.println("Escribe el resultado de una ecuación de primer grado: ");
	int resultado = Integer.parseInt(System.console().readLine());
	double x = (resultado - b) / a;
	System.out.printf("La x tiene el valor de: %4.2f", x);
	}
}
