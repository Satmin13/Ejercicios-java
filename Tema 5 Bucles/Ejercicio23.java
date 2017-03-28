/**
Ejercicio 23

Escribe un programa que permita ir introduciendo una serie indeterminada
de números mientras su suma no supere el valor 10000. Cuando esto último
ocurra, se debe mostrar el total acumulado, el contador de los números
introducidos y la media.
**/
public class Ejercicio23{

	public static void main(String[]args){
	double suma = 0;
	double num = 0;
	double contador = 0;
		do{
		System.out.print("Inserta un número");
		num = Double.parseDouble(System.console().readLine());
		suma += num;
		contador++;					
		}while(suma<10000);
	
	System.out.print("Suma total= " + suma + ". Media= " + suma/contador);
	
	}

}

