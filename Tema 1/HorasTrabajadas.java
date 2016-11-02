public class HorasTrabajadas{
	public static void main (String[] args)
	{
	System.out.print("Escriba el número de horas trabajadas al día: ");
	double horastrabajo = Double.parseDouble(System.console().readLine());
	System.out.printf("Su salario semanal es de: %.2f €", (horastrabajo * 5) * 12);
	
	}


}
