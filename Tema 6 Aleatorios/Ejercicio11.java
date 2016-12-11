/**Ejercicio 11
Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al
final aparecerá el número de suspensos, el número de suficientes, el número
de bienes, etc.
**/

public class Ejercicio11{
	public static void main(String[]args){
		
		int susp = 0;
		int suf = 0;
		int bien = 0;
		int not = 0;
		int sobr = 0;	
		
		for(int i = 0; i<20 ;i++){
			
		int nota = (int) (Math.random()*5)+1;		
	
			switch(nota){			
			case 1:
				System.out.println("Suspenso ");
				susp++;
				break;
			case 2:
				System.out.println("Suficiente ");
				suf++;
				break;
			case 3:
				System.out.println("Bien ");
				bien++;
				break;
			case 4:
				System.out.println("Notable ");
				not++;
				break;
			case 5:
				System.out.println("Sobresaliente ");
				sobr++;
				break;	
			default:
			}
		}
		System.out.println("RECUENTO  ----- \nSuspensos: " + susp + ". Suficientes: " + suf + ". Bien: " + bien + ". Notables: " + not + ". Sobresalientes: " + sobr);
	}
}
