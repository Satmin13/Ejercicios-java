/**
3. Realiza un programa que pinte una cruz hecha de asteriscos. El programa debe pedir la longitud del
brazo de la cruz. El asterisco del centro no cuenta en esa longitud.
Ejemplo:
Por favor, introduzca la longitud del brazo de la cruz: 2
**/

public class Ex3Ejercicio03{
	public static void main(String[]args){
		
		System.out.println("Por favor, introduzca la longitud del brazo de la cruz");
		int altura = Integer.parseInt(System.console().readLine());
		int i;
		int j;
		
		for ( i = 0 ; i < altura ; i++) { //primera parte vertical
			
			for ( j = 0 ; j < altura ; j++) {//espacios			
					System.out.print(" ");
			}
			System.out.println("*");
			
		}
			
		for (i = 0 ; i < (altura*2)+1 ; i++) {
				System.out.print("*");
		}
		System.out.println();
			
		for ( i = 0 ; i < altura ; i++) { //segunda parte vertical
			
			for ( j = 0 ; j < altura ; j++) 
			{			
					System.out.print(" ");
			}
			System.out.println("*");			
		}
	
	}
}
		
