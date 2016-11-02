/**Ejercicio 8
Amplía el programa anterior para que diga la nota del boletín (insuficiente,
suficiente, bien, notable o sobresaliente).**/

public class Ejercicio08{
	public static void main(String[]args){
		System.out.println("Ecribe una nota: ");
		double nota1 = Double.parseDouble(System.console().readLine());
		System.out.println("Ecribe la segunda nota: ");
		double nota2 = Double.parseDouble(System.console().readLine());
		System.out.println("Ecribe la tercera nota: ");
		double nota3 = Double.parseDouble(System.console().readLine());
		double resultado = (nota1 + nota2 + nota3) / 3;
		System.out.printf("La nota media es : %4.2f ", resultado);
		
		 if (resultado < 5){
		System.out.println("El resultado es Insuficiente");
		} else if ((resultado >= 5) && (resultado < 6)){
			System.out.println("El resultado es Suficiente");
		  } else if ((resultado >=6) && (resultado <7)){
				System.out.println("El resultado está Bien");
			  } else if ((resultado >=7) && (resultado < 9)){
					System.out.println("El resultado es Notable");
				}else {
						System.out.println("El resultado es Sobresaliente");
				}
	}
}
