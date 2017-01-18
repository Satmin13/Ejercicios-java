/**
 2. Realiza un programa que pinte por pantalla un plano inclinado construido con ladrillos (carácter #) y que tiene la
caída de izquierda a derecha. Sobre este plano inclinado rueda una bolita (la letra O). El dibujo será como una
fotografía de la bolita rodando. La bolita se colocará de forma aleatoria sobre una de las posibles posiciones que
puede ocupar en el plano inclinado desde lo alto hasta tocar el suelo. La altura del plano inclinado será indicada
por el usuario y deberá ser mayor o igual a 3.
Ejemplo:
Por favor, indique la altura del plano inclinado: 5
#
##O
###
####
#####
* **/

public class Ex1Ejercicio02 {
	
	public static void main (String[]args) {
		System.out.println("Introduzca la altura del plano inclinado que construiré con ladrillos. (MAYOR DE TRES)");
		int altura = Integer.parseInt(System.console().readLine());
		
		if (altura >= 3){
			int alea = (int)(Math.random() * (altura)) + 1;
			for (int i = 1 ; i <= altura ; i++){
				
					for(int j = 1; j<=i ; j++) {
						System.out.print("#");
					}
			if (i == alea){System.out.print("0");}
			  System.out.println();//salto de linea
				
			}
			
			
			
		} else{
			System.out.println("Introduzca la altura del plano que debe ser mayor de 3.");
			}
		
	}
	
}
