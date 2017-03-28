/**
Ejercicio 37
Realiza un conversor del sistema decimal al sistema de palotes.
**/

public class Ejercicio37 {

  public static void main(String[] args) {

    System.out.print("Por favor, introduzca un número entero positivo: ");
    int numIntroducido = Integer.parseInt(System.console().readLine());
    
    // Voltea el número introducido.
    int numero = numIntroducido;
    int volteado = 0;

    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
    } // while
    
    int resto =0 ;
		while (volteado>0) {
		resto = volteado%10;
		volteado = volteado/10;

			for (int i = 0; i < resto ; i++) {
			 System.out.print("|");
			}
			System.out.print("-");
		}
}
}
