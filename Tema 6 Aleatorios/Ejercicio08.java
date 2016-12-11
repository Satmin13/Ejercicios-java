/**Ejercicio 8
Modifica el programa anterior para que la probabilidad de que salga un 1 sea
de 1/2, la probabilidad de que salga x sea de 1/3 y la probabilidad de que salga
2 sea de 1/6. 

Pista: 1/2 = 3/6 y 1/3 = 2/6.
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
