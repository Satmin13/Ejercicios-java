public class FacturaIva{
	public static void main(String[] args){
	System.out.print("Escriba un precio sin IVA para hacer su factura: ");
	double preciosin = Double.parseDouble(System.console().readLine());
  double resultado = (preciosin * 0.21);
	System.out.printf("Su factura con 21 de IVA es: %.2f €", resultado);	
	}
}
