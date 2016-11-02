public class CalcularVolumen{
	public static void main (String[] args)
	{
	System.out.print("Escriba el radio de la figura: ");
	double radio = Double.parseDouble(System.console().readLine());
	System.out.print("Ahora la altura: ");
	double altura = Double.parseDouble(System.console().readLine());
	double volumen = 3.1415 * radio * radio * altura / 3;

	System.out.printf("El volúmen de la figura es de %.2f cm cubicos", volumen);
	
	}


}
