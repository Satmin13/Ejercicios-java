/**
	Ejercicio 7
Escribe un programa que muestre tres apuestas de la quiniela en tres columnas
para los 14 partidos y el pleno al quince (15 filas).
**/
public class Ejercicio07{
	public static void main(String[]args){
		
		for(int i=1; i<17 ; i++){
		int num1 = (int)(Math.random()*3);
		int num2 = (int)(Math.random()*3);
		int num3 = (int)(Math.random()*3);
		String cadena = "x";
		
		
		if(i<=15){
				cadena = String.valueOf(0);	

				System.out.println("Partido: " + i + " ->  " + num1 + "  |  " + num2 + "  |  " + num3 + "  |");
						
		}else{			
					System.out.println("Pleno al quince:      " + num1);
			}
		}
		
		
	}
}
