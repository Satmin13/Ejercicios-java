/**Ejercicio 7
Realiza un programa que calcule la media de tres notas.
* **/

public class Ejercicio07{
	public static void main(String[]args){
		System.out.println("Ecribe una nota: ");
		double nota1 = Double.parseDouble(System.console().readLine());
		System.out.println("Ecribe la segunda nota: ");
		double nota2 = Double.parseDouble(System.console().readLine());
		System.out.println("Ecribe la tercera nota: ");
		double nota3 = Double.parseDouble(System.console().readLine());
		double resultado = (nota1 + nota2 + nota3) / 3;
		System.out.printf("La nota media es : %4.2f", resultado);
		
	}
}
