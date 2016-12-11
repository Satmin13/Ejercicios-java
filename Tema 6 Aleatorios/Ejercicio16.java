/**
Ejercicio 16
Realiza un simulador de máquina tragaperras simplificada que cumpla los
siguientes requisitos:
a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5
figuras posibles: corazón, diamante, herradura, campana y limón.
b) Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento,
ha perdido.
c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje “Bien,
ha recuperado su moneda.
d) Si las tres figuras son iguales se debe mostrar Enhorabuena, ha ganado
10 monedas.
Ejemplo 1:
diamante diamante limón
Bien, ha recuperado su moneda
Ejemplo 2:
herradura campana diamante
Lo siento, ha perdido
Ejemplo 3:
corazón corazón corazón
Enhorabuena, ha ganado 10 monedas **/

public class Ejercicio16 {
	
	public static void main(String[] args) {
		
		int figura;
		int figura1 = 6;
		int figura2 = 7;
		int figura3 = 8;
				
			for(int i=0 ; i<3 ; i++){
				
				    figura = (int) (Math.random() * 4);
				    
				    if(i==0) {
						figura1 = figura;
						}
					if(i==1) {
						figura2 = figura;
						}
					if(i==2) {
						figura3 = figura;
						}						
					switch(figura){
					case 0:
					System.out.print(" Corazón ");
					break;
					case 1:
					System.out.print(" Diamante ");
					break;
					case 2:
					System.out.print(" Herradura ");
					break;
					case 3:
					System.out.print(" Campana ");
					break;
					case 4:
					System.out.print(" Limón ");
					break;
					
					default:;			
				}
			}//for
			
			
			if ( figura1==figura2 || figura1==figura3 || figura2 == figura3 ) {	

				
				if((figura1==figura2) && (figura1==figura3)) {
					
					System.out.println( " Enhorabuena, has ganado 10 monedas!");
					
					}			
					System.out.println(  " Recuperas tus monedas!");
									
			} else{ System.out.println ( " Lo siento has perdido tus monedas.");}
	
	}
}
