/**
* Salida formateada
*
* @author Luis J. Sánchez
*/
public class SalidaFormateada2 {
	public static void main(String[] args) {
		System.out.println(" Artículo  Precio/caja  No cajas");
		System.out.println("-----------------------------------------");
		System.out.printf("%-10s    %8.2f  %6d\n", "manzanas", 4.5, 10);
		System.out.printf("%-10s    %8.2f  %6d\n", "peras", 2.75, 120);
		System.out.printf("%-10s    %8.2f  %6d\n", "aguacates", 10.0, 6);
	}
}
