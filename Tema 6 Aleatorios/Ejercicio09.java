/**
Ejercicio 9
Realiza un programa que vaya generando números aleatorios pares entre 0
y 100 y que no termine de generar números hasta que no saque el 24. El
programa deberá decir al final cuántos números se han generado.
**/

public class Ejercicio09{
	
	public static void main(String[]args){
		
	int num ;
	int i = 0;
		
		do{
		num = (int)(Math.random()*100);				
			if(num%2==0){
			System.out.print(num + " ");
			i++;
			}
		} while(num!=24);
			
		System.out.print("Nº generados: " + i);
	}
}
