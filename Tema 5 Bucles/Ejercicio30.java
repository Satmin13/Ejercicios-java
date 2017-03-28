/**
 * Ejercicio 30
Realiza una programa que calcule las horas transcurridas entre dos horas de
dos días de la semana. No se tendrán en cuenta los minutos ni los segundos.
El día de la semana se puede pedir como un número (del 1 al 7) o como una
cadena (de lunes a domingo). Se debe comprobar que el usuario introduce
los datos correctamente y que el segundo día es posterior al primero.
* **/

public class Ejercicio30{
	
	public static void main(String[]args){

		System.out.println("Escribe dos días de la semana para calcular las horas que pasan entre ellos");

		System.out.println("Primer día y hora. En números, ejemplo: 1 20, sería el lunes a las 20h") ;

		int dia1 = Integer.parseInt(System.console().readLine());
		System.out.println("Primera hora. En números, ejemplo: 2 20 (sería el martes a las 20h.") ;
		int hora1 = Integer.parseInt(System.console().readLine());

		System.out.println("Segundo día. En números, ejemplo: 2  (sería el martes ") ;
		int dia2 = Integer.parseInt(System.console().readLine());
		System.out.println("Segunda hora. En números, ejemplo: 2 20 (serían las 20h.") ;
		int hora2 = Integer.parseInt(System.console().readLine());
	int horasRestantes = 0;
			if(dia1<dia2 && dia2<8){
			horasRestantes = (dia2-dia1-1)*24;
			horasRestantes += (24-hora1);
			horasRestantes += hora2;
			} else {System.out.print("La fecha introducida no es correcta");}

		System.out.println("Quedan "  + horasRestantes);
	}
}
