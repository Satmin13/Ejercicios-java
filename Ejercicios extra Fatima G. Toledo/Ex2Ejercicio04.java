/**
4. Pinta un árbol de Navidad mediante un programa. El follaje del árbol estará hecho con el carácter ^ y estará
adornado con estrellas (asterisco) y bolas (letra O). En la cúspide del árbol siempre habrá una estrella y el
relleno del árbol se pintará de forma aleatoria en función del siguiente patrón: la probabilidad de encontrar un
adorno sobre el follaje es de 1 sobre 3. En caso de pintar un adorno, la probabilidad de que sea una bola es de
2/3 y de que sea una estrella es de 1/3. La estrella de la cúspide se cuenta en la altura. Se debe verificar que
ésta última es mayor o igual que 4.
Ejemplo:
Por favor, indique la altura del árbol de Navidad: 6
**/

public class Ex2Ejercicio04 {
	
	public static void main(String [] args) {
		
			System.out.print("Indica la altura del arbol: ");
			int alto = Integer.parseInt(System.console().readLine());
			int i= 0;
			int alto2 = alto;
			int relleno = 2;
			int probabilidad ;
			int probabilidadAdorno ;
			
			if (alto>=4) {
				
			for(i = 0; i<alto+1 ; i++){
				System.out.print(" ");}
				
			System.out.println("*");//cuspide


			
			for (i = 0 ; i<=alto;i++) { // cada escalon del arbol
				
				
				for(i = 0; i<alto2 ; i++){
					
				System.out.print(" ");}
				
				for(i = 0; i<relleno ; i++){ //parte izquierda
					
					probabilidad = (int)(Math.random()*3);
					probabilidadAdorno = (int)(Math.random()*2);
					
				if(probabilidad==0 ){
					if (probabilidadAdorno==1 ){
					System.out.print("*"); //dibuja estrella
					} else{ System.out.print("O"); }//dibuja bola
				}
				
					else{ //follaje normal
						System.out.print("^");
					}
				}
				
				for(i = 0; i<relleno-1 ; i++){//parte derecha
					probabilidad = (int)(Math.random()*2);
					probabilidadAdorno = (int)(Math.random()*2);
					
				if(probabilidad==0 ){
					if (probabilidadAdorno==1 ){
					System.out.print("*"); //dibuja estrella
					} else{ System.out.print("O"); }//dibuja bola
				}
				
					else{ //follaje normal
						System.out.print("^");
					}
				}
				
				
				System.out.println();
				
				alto2--;
				relleno++;	
			//
			//	
			
			
			}// fin for
			for(i = 0; i<alto-2 ; i++){System.out.print(" ");}
			System.out.println("|   |" );//tronco
		} //fin if
		else {System.out.print("La altura debe ser mayor o igual que cuatro. ");}
		
		
		}
	}
