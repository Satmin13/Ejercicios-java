/**
4. Realiza un programa que pinte un sendero aleatorio. Los bordes se pintan con el carácter #. La
anchura del sendero siempre es la misma, los dos caracteres del borde más cuatro caracteres en
medio, en total 6 caracteres (incluyendo espacios). A cada metro, el sendero puede continuar recto,
girar un carácter a la izquierda o girar un carácter a la derecha, por supuesto de forma aleatoria. Por
cada metro de sendero – representado por una línea – puede que haya un obstáculo o puede que no,
la probabilidad es del 50%. La posición del obstáculo es aleatoria y puede estar entre el primer y el
cuarto carácter dentro de la línea. En caso de existir un obstáculo en un metro de sendero (en una
línea), puede ser una planta (carácter *) o una piedra (carácter O), la probabilidad de que salga uno u
otro es la misma. Recuerda que nunca habrá más de un obstáculo por metro de sendero, habrá uno o
ninguno.
Ejemplo 1:
Introduzca la longitud del sendero en metros: 7
	# * #
	 # O#
	#  #
	 # * #
	#* #
	# O #
	#  #
**/

public class Ex5Ejercicio04 {

	public static void main(String [] args) {
		
		System.out.println("Introduzca la longitud del sendero en metros:");
		int metros = Integer.parseInt(System.console().readLine());
		int sendero;
		int obstaculo;
		
		int i;
		
		
		for (i=0 ; i<metros ; i++) {
			sendero = (int)(Math.random() * 2);//mueve el sendero
			
			System.out.print("      ");
				
				for (int j= 0 ; j<sendero; j++){//
					System.out.print(" ");
					}
					
				System.out.print("#");//primer camino
				obstaculo = (int)(Math.random() * 2);
				
					if (obstaculo==1){
						
						int sitioObstaculo = (int)(Math.random() * 3);
						int tipoObstaculo = (int)(Math.random() * 2);
						
						for (int k=0 ; k<3 ; k++) {
							System.out.print(" ");
							if(k==sitioObstaculo){
								
								if(tipoObstaculo==0){
									System.out.print("O");
									}
								if(tipoObstaculo==1){
									System.out.print("*");}
							} 
						}
					
					} else {
						for (int k=0 ; k<4 ; k++){
							System.out.print(" ");}
						
						}
				System.out.println("#");
		}
	}
}
				
		
	
