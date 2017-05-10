/**
Ejercicio 35
Crea una función con la siguiente cabecera:
public static String convierteEnPalotes(int n)
Esta función convierte el número n al sistema de palotes y lo devuelve en una
cadena de caracteres. Por ejemplo, el 470213 en decimal es el | | | | - | | | | | |
| - - | | - | - | | | en el sistema de palotes. Utiliza esta función en un programa
para comprobar que funciona bien. Desde la función no se debe mostrar nada
por pantalla, solo se debe usar print desde el programa principal. 
**/
import java.util.Scanner;

public class Ejercicio35 {

	public static void main (String[]args) {
	
	Scanner s = new Scanner(System.in);
	
    System.out.print("Escriba un número para pasarlo al sistema de palotes: ");
    int num = s.nextInt();
    
    System.out.print(Palotes.convierteAPalotes(num));
    
	}
}
class Palotes {
	
	public static String convierteAPalotes (int n) {
		int numero = n;
		int p = 0;
		String palotes = " ";
		
		while(numero>0) {
			numero = numero/10;
			p++;}
		int [] a = new int [p];
		for (int i = p-1; i >= 0 ; i--){
			a [i] = n%10;
			n = n/10;
		}
		for (int i = 0; i < p ; i++){
			for( int j = 0; j < a[i] ; j++) {
				palotes = palotes + " | ";
			}
			palotes = palotes + " - ";
		}
		return palotes;
	}
}
    
