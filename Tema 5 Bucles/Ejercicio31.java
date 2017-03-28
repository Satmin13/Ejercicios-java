/**
 * 
 * Ejercicio 31
Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El
programa pedirá la altura. El palo horizontal de la L tendrá una longitud de la
mitad (división entera entre 2) de la altura más uno.
**/


public class Ejercicio31{

	public static void main(String[]args){

	int altura = 1 ;
	System.out.print("Escribe una altura impar");
	int n = Integer.parseInt(System.console().readLine());
	int base = 0;

		if((n%2)==1){
				
			for(int i=0; i<n-1;i++){
				System.out.println("*");}
			for(int i=0;i<=((n-1)/2);i++){
				System.out.print("*");}
		}
		System.out.println();
	}
}
