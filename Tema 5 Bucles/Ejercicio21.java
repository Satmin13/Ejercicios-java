/**
Ejercicio 21
Realiza un programa que vaya pidiendo números hasta que se introduzca un
numero negativo y nos diga cuantos números se han introducido, la media de
los impares y el mayor de los pares. El número negativo sólo se utiliza para
indicar el final de la introducción de datos pero no se incluye en el cómputo.
**/
public class Ejercicio21{
	public static void main(String[]args){
		int num = 0;
		int numMedia = 0;
		int suma = 0;
		int sumaImpar = 0;
		int parMayor = 0;
		do{
		System.out.print("Escribe un número positivo: ");
		num = Integer.parseInt(System.console().readLine());
		suma++;
		if(num%2 == 1 && num>0){ //Impar
			numMedia += num;
			sumaImpar++;
		} else{//numero Par
				if( num > parMayor ){
					parMayor = num;
				}
			}
		}while(num>=0);
		
		System.out.println("Han sido: " + (suma-1) + " números positivos introducidos. ");
		System.out.println("Media de impares: " + (numMedia/sumaImpar) + " \nNº de Impares: " + sumaImpar );
		System.out.println("El par mayor inroducido es: " + parMayor);
		
	}

}
