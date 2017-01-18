/**
Ejercicio 19
Escribe un programa que muestre 50 números enteros aleatorios comprendidos
entre el -100 y el 200 ambos incluidos y separados por espacios. Muestra
luego el máximo de los pares el mínimo de los impares y la media de todos los
números generados.
**/

public class Ejercicio19 {

  public static void main(String[] args) {
	  
	int i = 0;
	//int num = 0;
	int minimo = -100;
	int par = 0;
	int maxPar = 0;
	int minImpar = 0;	
	int impar = 0;
	
		do {		
			int num = (int)(Math.random() * (300) + minimo );
			System.out.println(num);
			
			if (num%2==0) {
			 par = num;
				if(par>maxPar) {
				maxPar = par;
				}
			} else {
				impar = num;
				if(impar<minImpar) {
				minImpar = impar;
				}
			}
			
			i++;			
		} while(i!=50);
	
	System.out.println( "Máximo Par: " + maxPar + ". Mínimo Impar: " + minImpar );
	
	}
}
