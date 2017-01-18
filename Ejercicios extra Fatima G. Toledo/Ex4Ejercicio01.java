/**
1. El nuevo partido político Izquierda Hacia la Izquierda nos ha pedido una aplicación que genere su
logotipo. El logotipo de este partido es la letra I inclinada hacia la izquierda. Se debe pedir por teclado
la altura del logotipo. La anchura siempre es de 4 asteriscos.
Ejemplo:
Introduzca la altura del logotipo: 5
****
 ****
  ****
   ****
    ****
 **/

public class Ex4Ejercicio01{
	public static void main(String[]args){
	
	System.out.println("Dinos la altura deseada para el logotipo de Izquierda Hacia la Izquierda: ");
	int altura = Integer.parseInt(System.console().readLine());
	
	String relleno = "****";
	int espacios = 0;
	
		for (int i = 0 ; i < altura ; i++) {
			
			for (int j = 0 ; j < espacios ; j++) {
			System.out.print(" ");			
			
			}
		espacios++;	
		System.out.println(relleno);
					
		}

		
	}
}
