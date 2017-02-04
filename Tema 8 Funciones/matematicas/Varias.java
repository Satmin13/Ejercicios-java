/**
Ejercicios 1-14
Crea una biblioteca de funciones matemáticas que contenga las siguientes
funciones. Recuerda que puedes usar unas dentro de otras si es necesario.
1. esCapicua: Devuelve verdadero si el número que se pasa como parámetro
es capicúa y falso en caso contrario.
2. esPrimo: Devuelve verdadero si el número que se pasa como parámetro
es primo y falso en caso contrario.
3. siguientePrimo: Devuelve el menor primo que es mayor al número que
se pasa como parámetro.
4. potencia: Dada una base y un exponente devuelve la potencia.
5. digitos: Cuenta el número de dígitos de un número entero.
6. voltea: Le da la vuelta a un número.
7. digitoN: Devuelve el dígito que está en la posición n de un número
entero. Se empieza contando por el 0 y de izquierda a derecha.
8. posicionDeDigito: Da la posición de la primera ocurrencia de un dígito
dentro de un número entero. Si no se encuentra, devuelve -1.
9. quitaPorDetras: Le quita a un número n dígitos por detrás (por la
derecha).
10. quitaPorDelante: Le quita a un número n dígitos por delante (por la
izquierda).
11. pegaPorDetras: Añade un dígito a un número por detrás.
12. pegaPorDelante: Añade un dígito a un número por delante.
13. trozoDeNumero: Toma como parámetros las posiciones inicial y final
dentro de un número y devuelve el trozo correspondiente.
14. juntaNumeros: Pega dos números para formar uno.
**/

package matematicas ;

public class Varias {
	
		
		public static boolean esPrimo(int num) {

		int sum = 2;
		boolean esPrimo = true;
		boolean salir = true;
		
		
			do{
				if(num%sum == 0){		
					System.out.println("El número no es primo. Porque es divisible entre:" + sum);
					esPrimo = false;
					salir = false;
				} 
				sum++;
				if(sum==num){
					esPrimo = true;
					salir = false;
					System.out.println("El número es primo. Porque solo es divisible entre si mismo: " + sum + " y 1.");

					}
			} while( salir == true);	
		return esPrimo;
	}}
