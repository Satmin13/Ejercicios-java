/**
2. Realiza un programa que genere la versión tacaña de un número a partir de otro introducido por
teclado. La versión tacaña es aquella que contiene los mismos dígitos o menos que el número original
y en el mismo orden. A efectos prácticos es como quitarle dígitos de forma aleatoria a un determinado
número.
Ejemplo 1:
Por favor, introduzca un número: 746812
**/

public class Ex4Ejercicio02{
	public static void main(String[]args){
	
	System.out.println("Introducza un número, por favor: ");
	int numero = Integer.parseInt(System.console().readLine());
	boolean menor10 = false;
	int digitos = 0;
	int numero2 = numero;
	int resto;
	
		do {
			
			if(numero>9){//cuento digitos
			
			numero = numero/10;
			
				} else {menor10=true;}
			digitos++;
			
			}while(menor10 == false );
	
		
	int [] numeros = new int [digitos];
	
		for(int i = 0 ; i < digitos ; i++) {//introduzco el array
			
			resto = numero2%10;
			numeros[i] = resto ;
			numero2 = numero2/10;
			//System.out.print(numeros[i] + " " + numero2);
		}
		
		
		
		for(int i = digitos-1 ; i >= 0 ; i--) {//Los muestro tacañamente
			
		int alea = (int)(Math.random() * digitos);
		
			for (int j = 0 ; j < alea ; j++) {	
			int alea2 = (int)(Math.random() * digitos);
			  if (alea2 == i){
				  System.out.print(numeros[i] + " ");
				  }
			}
		}
		
	}
}
