/**Ejercicio 24
Escribe un programa que lea un número n e imprima una pirámide de números
con n filas como en la siguiente figura:**/

public class Ejercicio24{
	public static void main(String[]args){
		
	System.out.print("Escribe la altura de la pirámide.");
	int n = Integer.parseInt(System.console().readLine());				

	int espacios = n-1;
	int altura = 0;
	int i = 0;
	while(n >= altura){
		for (i=1;i <= espacios ; i++){//dibujo espacios
			System.out.print(" ");
		}
		for (i=1;i < altura ; i++){//dibujo relleno
		System.out.print(i);			
		}
		for (i=altura;i > 0 ; i--){//dibujo relleno al reves
			System.out.print(i);
		}
		System.out.println();

		espacios--;
		altura++;
	}
	
	}

}
