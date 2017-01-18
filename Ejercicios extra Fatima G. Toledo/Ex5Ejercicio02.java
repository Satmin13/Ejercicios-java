/**
2. Muestra por pantalla una secuencia aleatoria de 10 números múltiplos de 11 comprendidos entre el
330 y el 550 ambos incluidos.
**/


public class Ex5Ejercicio02 {

	public static void main(String [] args) {
		
		int i = 0;
		
		do {
			int alea = (int)(Math.random() * (220) + 330);
			if (alea%11 == 0){
				System.out.println(alea + " es multiplo de 11. ");
				i++;
			} 
		} while (i<11);
		
	}
}

		
		
		
