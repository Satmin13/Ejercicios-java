/**
double preciosin = 3.50;
	  double sumariva = preciosin * 1.21;
	  System.out.printf (preciosin + " euros más el IVA son: %.2f €", sumariva);
double iva = 21;
double preciosin = 3.50;
	  System.out.printf ("El resultado es: "iva / 100 * preciosin);**/


public class Iva{
	public static void main (String [] args){
		double iva = 21;
double preciosin = 3.50;
	  System.out.printf ("El resultado es: " + (iva / 100 * preciosin + preciosin));
	
	}

}




