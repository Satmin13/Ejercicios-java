/**
 1. Realiza un programa que trocee un número introducido por teclado en otros dos números. Un trozo se formará
con los dígitos de las posiciones pares y otro trozo con los dígitos de las posiciones impares. Se debe conservar
el orden de los dígitos. Da igual el trozo que se muestre primero con tal de que cada trozo esté bien formado.
Utiliza el tipo long donde sea necesario para aceptar números largos.
Ejemplo:
Introduzca un número entero: 29108756
Primer trozo: 2185
Segundo trozo: 9076
**/

public class Ex1Ejercicio01 {
	
	public static void main (String[]args) {
		
		System.out.println("Introduce un numero, lo dividiremos dependiendo de su posicion par/impar:");
		int numero = Integer.parseInt(System.console().readLine());
		int numero2 = numero;
		int veces = 1;		
		int resto;
		
		for ( int i=1;numero>10;i++){		
			 numero = numero/10;	
			 veces++;	 
			
			}
		
		int digitos = veces;
		//System.out.print("Veces" + digitos  );
		int[] arrayInicial = new int[digitos];
		
		for ( int j=(veces-1); j>=0 ; j--){
			resto = numero2%10;
			numero2 = numero2/10;			
			arrayInicial[j] = resto;			
		}
		for ( int k=0; k<digitos ; k++){
		System.out.print(arrayInicial[k] + " ");
		}
		
			System.out.print("\n Posiciones impares: ");//muestro los pares
			for ( int k=0; k<digitos ; k++){
				if(k%2 == 0)
				{System.out.print(arrayInicial[k] + " ");}
			}
			
			System.out.print("\n Posiciones pares: ");//muestro los impares
			for ( int k=0; k<digitos ; k++){
				if(k%2 != 0)
				{System.out.print(arrayInicial[k] + " ");}
			}
		
		
		
	}
	
}
