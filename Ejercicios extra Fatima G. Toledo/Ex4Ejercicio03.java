/**
3. Escribe un programa que rellene un array con 20 números aleatorios comprendidos entre 0 y 1000 y
que los muestre por pantalla. A continuación, el programa pedirá dos números de los que se han
mostrado. Por último, el programa dirá cuántos pasos hay que dar para pasar del primer número al
segundo. Se supone que el usuario introduce correctamente los números, es decir, se encuentran en
el array, no son el mismo, y el primer número aparece antes que el segundo.
Ejemplo:
159 204 20 250 178 790 353 632 229 357 924 54 260 310 140 549 335 826 923 113
Por favor, introduzca el primer número: 790
Ahora introduzca el segundo número: 310
Para pasar del 790 al 310 hay que dar 8 pasos.
**/

public class Ex4Ejercicio03 {

	public static void main(String [] args) {
	
	int [] numeros = new int [20];
	int alea;
	int i;
	
	for ( i = 0; i < 20 ; i++) {
		 alea = (int)(Math.random() * 1000);
		 numeros[i] = alea;		
		}
	for ( i = 0 ; i < 20 ; i++) {
		System.out.print (numeros [i] + " | " );
	}
	
	System.out.println("Escribe un número que se haya mostrado: ");
	int elegido = Integer.parseInt(System.console().readLine());
	System.out.println("Escribe otro número más que se haya mostrado después que el anterior: ");
	int elegido2 = Integer.parseInt(System.console().readLine());
int posicion1=0;
int posicion2=0;

	for (i=0; i<20; i++){
		if(elegido==numeros[i]){
			posicion1 = i;
			}
		if(elegido2==numeros[i]){
			posicion2 = i;
			}
		}
		
		System.out.println("Los pasos a dar desde " + elegido2 + " hasta " + elegido +  " son: " + (posicion2-posicion1));
	}
}
