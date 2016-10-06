public class MediaClase{
	public static void main (Strings[] args)
	{
	System.out.print("Escriba la nota del primer examen: ");
	Double nota40 = Double.parsedouble ( System.console().readLine() );

	System.out.print("¿Qué nota final te gustaría tener?: ");
	Int notafinal = Integer.parseInt ( System.console().readLine() );
	Double notadeseada = (nota40 * 0.4) - notafinal;
	System.out.printf("La nota tiene que ser más de %2.f", notadeseada);	
	}
}
