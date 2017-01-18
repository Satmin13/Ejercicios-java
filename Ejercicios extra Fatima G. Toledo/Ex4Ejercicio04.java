/**
4. Realiza un programa que gestione los votos de las próximas elecciones. La aplicación debe cumplir
los siguientes requisitos:
a) Los nombres de los partidos se deben guardar en un array llamada nombrePartido que se debe
inicializar al principio del programa con los siguientes nombres: Ciudadanos, Podemos, PP, PSOE,
Izquierda Unida y UpyD.
b) El programa debe pedir el número de votos que ha obtenido cada uno de los partidos. Estos
datos se deben guardar en un array llamado votacion.
c) El programa calculará la media de todas las votaciones y la mostrará por pantalla.
d) A continuación, el programa mostrará el mensaje: "Los partidos que han obtenido votos por
encima de la media son: " seguido de los nombres de los partidos cuyos votos han sido superiores
a la media.
e) A continuación, el programa mostrará el mensaje: "Los partidos que han obtenido votos por
debajo de la media son: " seguido de los nombres de los partidos cuyos votos han sido inferiores a
la media.

**/

public class Ex4Ejercicio04 {
	
	public static void main (String[]args) {
		
		int [] votacion = new int [6];
		String [] partido = new String [6];
		int suma = 0;
		
		
		partido [0] = "Ciudadanos";
		partido [1] = "Podemos";
		partido [2] = "PP";
		partido [3] = "PSOE";
		partido [4] = "Izquierda Unida";
		partido [5] = "UPyD";
		
		
		for (int i=0; i<6 ; i++){
		System.out.println("Escriba las votaciones del partido:  " + partido[i]);
		votacion[i]  = Integer.parseInt(System.console().readLine());
		suma += votacion[i];
		}
		int media = suma/6;
		System.out.println("La media de los seis partidos que compiten es de :  " + media);
		
		for(int i=0; i<6 ; i++){
			
			if(votacion[i] >= media) {
				System.out.println("Los partidos que han obtenido votos por encima o igual de la media son: " + partido[i]);
			}	
		}
		
		for(int i=0; i<6 ; i++){
			if(votacion[i] < media) {
					System.out.println("Los partidos que han obtenido votos inferiores a la media son: " + partido[i]);
				}
		}
	}
}
