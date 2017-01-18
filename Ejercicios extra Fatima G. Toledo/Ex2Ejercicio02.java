/**
2. Escribe un programa que pida 6 palabras y las almacene en un array. A continuación, en otro array se deben
guardar las mismas palabras pero esta vez cambiadas de orden de forma aleatoria.
**/

public class Ex2Ejercicio02 {	
	
	public static void main (String[]args) {
	
	 String[] letras = new String[6];
	 String[] letrasAlea = new String[6];
	 int [] numAleatorio = new int[6];
	 boolean repetido ;
	 int indice=0;
	 
		 for (int i = 0 ; i<6 ; i++) { //pido las 6 palabras
			 
		   System.out.print("Escribe una palabra y las ordenaremos aleatoriamente, son 6 en total.");
		   letras[i] = System.console().readLine();
		   
			   
		 }	
			 
		for (int i = 0 ; i<6 ; i++) { // muestro el primer array
			 
			System.out.print(letras[i] + "  |  ");
			
		}
		
		
		 for (int i = 0 ; i<6 ; i++) { //6 números en un array
			 int num;
				do {
					repetido = false;
				    num = (int)((Math.random()*7)); //Genero número aleatorio
						for (int j = 0 ; j<6 ; j++){  //Recorro array números
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
		 
		 System.out.println(" ");
		 for (int i = 0 ; i<6 ; i++) { // hago el array desordenado
			letrasAlea[i]=letras[numAleatorio[i]-1];
			System.out.print(letrasAlea[i] + "  |  ");
			
		}
		 
	
		
	}	
	
}
