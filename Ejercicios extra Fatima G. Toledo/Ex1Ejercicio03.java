/**
 3. Escribe un programa que genere la tabla de entrenamiento de un usuario de un gimnasio. El programa debe
pedir el día de la semana (un número del 1 al 7) y debe mostrar de forma aleatoria la secuencia del
entrenamiento en función de las siguientes pautas:

- El entrenamiento empieza siempre con un calentamiento que puede ser bicicleta, elíptica o cinta.
- A continuación sigue el entrenamiento de un grupo muscular grande y de uno pequeño. Los grupos musculares
grandes son espalda, pecho y piernas y los grupos musculares pequeños son biceps, triceps y hombros.
- El entrenamiento finaliza con abdominales o con ejercicio aeróbico (bicicleta, elíptica o cinta). En caso de
finalizar con aeróbico, no se puede repetir el ejercicio que se hizo en el calentamiento.
- Los miércoles y los domingos son días de descanso.

Ejemplo:
Introduzca un número del 1 al 7 correspondiente a un día de la semana: 4
Su entrenamiento de hoy es el siguiente: elíptica, espalda, bíceps y bicicleta.
* */


public class Ex1Ejercicio03 {
	
	public static void main (String[]args) {
		
		System.out.println("Bienvenido al gimnasio, ¿que dia es?, [1-7]");
		int dia = Integer.parseInt(System.console().readLine());
		
		if (dia != 3 && dia != 7) {
			
			int entrenamiento = (int) (Math.random() * 2);
			System.out.println("Entrenamiento a seguir hoy: ");
			
				switch (entrenamiento) {
					
					case 0 :
					System.out.print(" Bicicleta, ");
					break;
					case 1 :
					System.out.print(" Elíptica, ");
					break;
					case 2 :
					System.out.print(" Cinta, ");
					break;
					default:
					}
					
			int entrenamientoMuscularGran = (int) (Math.random() * 2);
			
				switch (entrenamientoMuscularGran) {
					
					case 0 :
					System.out.print("espalda, ");
					break;
					case 1 :
					System.out.print("pecho, ");
					break;
					case 2 :
					System.out.print("piernas, ");
					break;
					default:
					}
			int entrenamientoMuscularPeq = (int) (Math.random() * 2);
			
				switch (entrenamientoMuscularPeq) {
					
					case 0 :
					System.out.print("bíceps, ");
					break;
					case 1 :
					System.out.print("tríceps, ");
					break;
					case 2 :
					System.out.print("hombros, ");
					break;
					default:
					}
			int entrenamientoFinal = (int) (Math.random() * 3);	
			
			if (entrenamientoFinal == entrenamiento) {
				entrenamientoFinal = (int) (Math.random() * 3);
				} 
				else {
					
					switch (entrenamientoFinal) {
					
					case 0 :
					System.out.print("y bicicleta. ");
					break;
					case 1 :
					System.out.print("y elíptica. ");
					break;
					case 2 :
					System.out.print("y cinta. ");
					break;
					default:
					System.out.print("y abdominales. ");
					break;
					}
				}
			
			
			} else {
				System.out.println("¡Hoy no se entrena!");
				}
		
		
		
	}	
	
}
