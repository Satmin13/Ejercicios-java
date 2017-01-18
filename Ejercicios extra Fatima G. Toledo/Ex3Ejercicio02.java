/**
2. Una pareja quiere pintar los tres dormitorios de su casa, quieren sustituir el color blanco por colores
más alegres. Realiza un programa que genere de forma aleatoria una secuencia de tres colores
aleatorios (uno para cada dormitorio) de tal forma que no se repita ninguno. Los colores entre los que
debe elegir el programa son los siguientes: rojo, azul, verde, amarillo, violeta y naranja.
**/

public class Ex3Ejercicio02{
	public static void main(String[]args){
		
		//int colores = (int) (Math.random() * 6);
		boolean repetido = false;	
		
		int [] habitaciones = new int [3];
		
		for(int i = 0; i<3 ;i++){
			
			int colores = (int) (Math.random() * 6);
				
			System.out.print("Habitación " + i + " en ");
			if (colores == habitaciones[1] || colores == habitaciones[2]  ) { 
				colores = (int) (Math.random() * 6);
					
				} 
			
			else {
				
	
			switch(colores){
			case 0:
				System.out.print("rojo. \n");
				habitaciones [i] = colores;
				break;				
			case 1:
				System.out.print("azul. \n");
				habitaciones [i] = colores;
				break;
			case 2:
				System.out.print("verde. \n");
				habitaciones [i] = colores;
				break;
			case 3:
				System.out.print("amarillo.\n ");
				habitaciones [i] = colores;
				break;
			case 4:
				System.out.print("violeta. \n");
				habitaciones [i] = colores;
				break;
			case 5:
				System.out.print("naranja.\n");
				habitaciones [i] = colores;
				break;}
				
			}
		}
	}
}
			
