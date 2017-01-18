/**
3. Realiza un programa que elimine un determinado dígito de un número introducido por teclado. Utiliza el tipo long
donde sea necesario para aceptar números largos.
Ejemplo:
Introduzca un número entero: 291081756
¿Qué dígito desea eliminar? 1
El número resultante es el 2908756
**/

public class Ex2Ejercicio03 {
	
	public static void main (String[]args) {
	
		System.out.println("Escriba un número entero: ");
		long num = Long.parseLong(System.console().readLine());
		long num2 = num;
		System.out.println("Escriba el número que quiere eliminar: ");
		long eliminar = Long.parseLong(System.console().readLine());
		boolean menor10 = false;
		int digitos = 1;
		long resto;
		
		 if(num>10) { //cuento digitos
			 
			 do {
				 
			 num = num/10 ;
			 digitos++;
			 
				if(num<10) {menor10=true;}// cambio el valor si es menor de 10
				
			} while (menor10 == false);
			
		} else {menor10=true;}
		
		long [] numeros = new long [digitos];// creo array
		
	
			 for (int i = 0 ; i< digitos ; i++){
			
			 resto = num2%10;
			 numeros[i] = resto ;
			 num2 = num2 / 10;
			 
				if(num2<10) {menor10=true;}
			} 
	
		System.out.println("Números introducidos : " );
		for(int i = digitos-1 ; i>=0 ;i--) { // muestro array
			System.out.print( numeros[i] + "  ");
			}
			
		System.out.println("\nNúmeros introducidos sin eliminado: " );
		for(int i = digitos-1 ; i>=0 ;i--) { // muestro array sin numero
			if (eliminar==numeros[i]){
				} else {System.out.print(  numeros[i] + "  ");}
			}
		//System.out.println("veces" + digitos);	
		
	}



}
