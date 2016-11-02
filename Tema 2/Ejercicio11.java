/**Ejercicio 11
Escribe un programa que dada una hora determinada (horas y minutos),
calcule los segundos que faltan para llegar a la medianoche.**/
public class Ejercicio11{
	public static void main(String[]args){
	System.out.println("¿Qué hora es? Indica primero los minutos");
	int minutos = Integer.parseInt(System.console().readLine());
	System.out.println("¿Qué hora es? Indica la hora sin minutos");
	int hora = Integer.parseInt(System.console().readLine());

	if(minutos==0){
		int horasRestantes = 23-hora;
		int segundosTotales = horasRestantes*60*60;	
		System.out.println("Quedan "+ segundosTotales +" segundos para las 12 de la noche");
		
		
	} else{
		int segMinutosRestantes = (60-minutos)*60;
		int horasRestantes2 = 23-hora;
		int segundosTotales2 = (horasRestantes2*60*60) + (segMinutosRestantes);
		System.out.println("Quedan "+ segundosTotales2 +" segundos para las 12 de la noche");

		}
	

	}
}
