
/**
 4. Escribe un programa que rellene un array con 10 números aleatorios (números entre 0 y 100) y que luego cree
otro array con esos mismos números barajados, es decir, reordenados de forma aleatoria. Puede haber
números repetidos en el array original.
* 
* */

public class Ex1Ejercicio04 {
	
	public static void main (String[]args) {
	
	int [] numeros = new int [10];
	int [] numeros2 = new int [10];
	int [] numAleatorio = new int [10];
	boolean repetido;
	int indice = 0;
	
		for(int i = 0 ; i <= 9 ; i++){
			
			int alea = (int) (Math.random() * 101);
			numeros [i] = alea;
			System.out.print(numeros[i] + "  |  ");
	
		}
		
		
		System.out.println();
		System.out.println("Ahora el array en aleatorio");

		for (int i = 0 ; i<10 ; i++) { //10 números en un array
			 int num;
				do {
					repetido = false;
				    num = (int)((Math.random()*11)); //Genero número aleatorio
						for (int j = 0 ; j<10 ; j++){  //Recorro array números
							if (num==numAleatorio[j]) { //Si el número está ya metido
								repetido=true;
							}
						}
						if (!repetido){
							numAleatorio[indice] = num ;
							indice++;
						}		
				} while(repetido);
		 }
		 
		 System.out.println();
			for(int i = 0 ; i < 10 ; i++){//muestro array barajado
				numeros2[i] = numeros[numAleatorio[i]-1];
				System.out.print(numeros2[i] + "  |  " );
				
			}
					
	}	
	
	
}
