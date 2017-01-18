/**
Ejercicio 23
Las caras de un dado de poker tienen las siguientes figuras: As, K, Q, J, 7 y 8.
Escribe un programa que genere de forma aleatoria la tirada de cinco dados.
Ejemplo 1:
Q J 7 J As
Ejemplo 2:
K 8 J As 7
**/
public class Ejercicio23 {
	
	public static void main (String [] args) {
		int i=0;
		boolean fin = false;
			
		do{ 
			int figura = (int)(Math.random() * (6) );
			
			switch(figura) {
				
				case 0:
				System.out.print(" As");
				break;
				
				case 1:
				System.out.print(" K");
				break;
				
				case 2:
				System.out.print(" Q");
				break;
				
				case 3:
				System.out.print(" J");
				break;
				
				case 4:
				System.out.print(" 7");
				break;
				
				case 5:
				System.out.print(" 8");
				break;
				default:;
				
			}
			if (i==4) {
				fin = true;
				System.out.println();
			}
			i++;
			
		} while(fin==false);
		
		
		}
	
	}
