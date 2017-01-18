/**
4. Realiza un programa que pida 10 números por teclado y que los almacene en un array. A continuación
se debe mostrar el contenido de ese array junto al índice (0 – 9). Seguidamente el programa debe
colocar en las últimas posiciones los números que terminen en 7 dejando el resto en las primeras
posiciones.
**/

public class Ex3Ejercicio04{
	public static void main(String[]args){
		
		int[] nums = new int[10];
		int[] nums2 = new int[10];
		int fin = 9;
		int inicio = 0;
	 
		 for (int i = 0 ; i<10 ; i++) { //pido las 10 numeross
			 
		   System.out.print("Escribe 10 numeros, guardaré los que contegan el 7 al final del array:");
		   nums[i] = Integer.parseInt(System.console().readLine());		   
			   
		 }	
		 
		 for (int i = 0 ; i<10 ; i++) { // muestro el primer array
			 
			System.out.print( i + " -> " + nums[i] + " | ");
			
		}
		
		System.out.println("Array ordenado: \n");
		
		for (int i = 0 ; i<10 ; i++) { //veo los 10 numeros, comparo y guardo en nums2
			 
		   if(nums[i] % 10 == 7) {
			     nums2[fin] = nums[i] ;
			     fin--;
		   } else {
			  nums2[inicio] = nums[i] ;
			   inicio++;
			   }
		 }
		 
		  for (int i = 0 ; i<10 ; i++) { // muestro el segundo array
			 
			System.out.print( i + " -> " + nums2[i] + " | ");
			
		}
		
	}
}
