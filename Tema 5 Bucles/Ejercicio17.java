/**
Ejercicio 17
Realiza un programa que sume los 100 números siguientes a un número entero
y positivo introducido por teclado. Se debe comprobar que el dato introducido
es correcto (que es un número positivo).**/

public class Ejercicio17{
	public static void main(String[]args){
		int num = 0;
		int suma=0;
		do{
			System.out.println("Escribe un número, debe ser positivo.");
			num = Integer.parseInt(System.console().readLine());
			for(int i=num; i<(num+100); i++){
				suma+=i;
			}
			System.out.println("La suma de os 100 números siguientes es " + suma);

		}while(num<0);
	}
}
