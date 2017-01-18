/**
Realiza un programa que genere al azar las capturas que ha hecho un jugador durante una partida. El
número de capturas será un valor aleatorio entre 0 y 15. Hay que tener en cuenta que cada jugador
tiene la posibilidad de capturar algunas de las siguientes piezas (no más): 1 dama, 2 torres, 2 alfiles, 2
caballos y 8 peones. El nombre de las piezas se debe guardar en un array de la forma pieza =
Dama, Torre, Alfil, Caballo, Peón y el valor de cada una de ellas en otro array de la
forma valor = {9, 5, 3, 2, 1}. El alumno puede utilizar más arrays si lo estima oportuno. Al final debe
aparecer la puntuación total. Si hay algún problema con las cadenas de caracteres, se permite
cambiar Peón por Peon.
Ejemplo:
Fichas capturadas por el jugador:
Alfil (3 peones)
Caballo (2 peones)
Peón (1 peones)
Torre (5 peones)
Peón (1 peones)
Puntos totales: 12 peones.
**/

public class Ex5Ejercicio03 {

	public static void main(String [] args) {
		
		
		String [] piezas = new String [5];
		int [] captura = new int [5];
		int [] valor = new int [5];
		int [] valorResultado = new int [15];
		String [] resultado = new String [15];
		piezas[0] = "Damas";
		piezas[1] = "Torre";
		piezas[2] = "Alfil";
		piezas[3] = "Caballo";
		piezas[4] = "Peon";
		
		valor[0] = 9;
		valor[1] = 5;
		valor[2] = 3;
		valor[3] = 2;
		valor[4] = 1;
		
		
		captura[0] = 1;
		captura[1] = 2;
		captura[2] = 2;
		captura[3] = 2;
		captura[4] = 8;
		int suma = 0;
		int contador = 0;
		int aleaFichasCap = (int)(Math.random() * (15) + 1);
		do{
			int piezaAlea = (int)(Math.random() * 5);
			if(captura[piezaAlea]>0){
				resultado[contador]= piezas[piezaAlea];
				valorResultado[contador]= valor[piezaAlea];
				captura[piezaAlea]=captura[piezaAlea]-1;
				contador++;
				suma += valor[piezaAlea];
			}		
		}while (aleaFichasCap>contador); 
		for(int i=0;i<aleaFichasCap;i++)
			System.out.println(resultado[i] + " " + valorResultado[i]);
		System.out.println("La suma total es "+suma);
}
}
