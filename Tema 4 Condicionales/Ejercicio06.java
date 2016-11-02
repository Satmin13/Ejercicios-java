/**Ejercicio 6
Realiza un programa que calcule el tiempo que tardará en caer un objeto desde
una altura h. Aplica la fórmula t = √2h/g siendo g = 9.81m/s2
**/

public class Ejercicio06{
	public static void main(String[]args){
		System.out.println("Escribe la altura desde la que caerá el objeto: ");
		double altura = Double.parseDouble(System.console().readLine());
		double hacerRaiz = 2 * altura / 9.81;
		double tiempo = Math.sqrt(hacerRaiz);
		System.out.printf("El tiempo que tarda en caer son: %4.2f segundos ", tiempo);		
	}
}
