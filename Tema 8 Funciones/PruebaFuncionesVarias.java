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
import java.lang.Math;
//package matematicas;

public class PruebaFuncionesVarias {
	
	public static void main (String[]args) {
		
		// PROBANDO            PROBANDO           PROBANDO           PROBANDO         PROBANDO
		// LAS FUNCIONES
		
		//1 Dice si es capicua
		System.out.print("Por favor, introduzca un número entero (de 5 cifras como máximo): ");
		int capicua = Integer.parseInt(System.console().readLine());
		
		if(Funciones.esCapicua(capicua)) {
			
				System.out.println("El numero es capicua.\n");
				
			} else {
						System.out.println("El numero no es capicua.\n");
			  }
		
		//2 Devuelve si es primo o no
		
		System.out.println("Escribe un numero y te diré si es primo o no lo es.");
		int num = Integer.parseInt(System.console().readLine());
		
			if(Funciones.esPrimo(num)) {
			
				System.out.println("El numero es primo.\n");
				
			} else {
						System.out.println("El numero no es primo.\n");
			  }
		
		//3 Devuelve el siguiente primo
		System.out.println("Escribe un numero y te diré el siguiente primo \n" );
		int numP = Integer.parseInt(System.console().readLine());
		
		System.out.println("El siguiente primo es: " + Funciones.siguientePrimo(numP) + "\n");
		
		//4 Da potencia
		System.out.println("Escribe una base y a continuación su exponente: \n");
		int base = Integer.parseInt(System.console().readLine());
		System.out.println();
		int exponente = Integer.parseInt(System.console().readLine());
		System.out.println("La potencia de " + base + " elevado a " + exponente + " es: " + Funciones.daPotencia(base, exponente) + "\n");
		
		//5 Devuelve numero de digitos
		System.out.println("Escribe un numero y te diré su numero de digitos.\n");
		int nDigitos = Integer.parseInt(System.console().readLine());
		System.out.println("EL numero tiene " + Funciones.digitos(nDigitos) + " digitos.\n");
		
		//6 Voltea numero
		System.out.println("Escribe un numero y devolveremos su volteado.\n");
		int nVoltea = Integer.parseInt(System.console().readLine());
		System.out.println("El numero volteado " + Funciones.voltea(nVoltea));
				
		//7 Devuelve la posición de un numero
		System.out.println("Escribe un numero de varias cifras.");
		long nLargo = Integer.parseInt(System.console().readLine());
		System.out.println("Indica la posición del número que quieres obtener. " );
		int nPosicion  = Integer.parseInt(System.console().readLine());
		System.out.println("El numero de la posicion " + nPosicion + " es el " + Funciones.digitoN(nLargo, nPosicion));
		
		//8 posicionDeDigito: Da la posición de la primera ocurrencia de un dígito dentro de un número entero. Si no se encuentra, devuelve -1.

		
		//9. quitaPorDetras: Le quita a un número n dígitos por detrás (por la derecha).
		
		// 10. quitaPorDelante: Le quita a un número n dígitos por delante (por la izquierda).
		
		// 11. pegaPorDetras: Añade un dígito a un número por detrás.
		
		// 12. pegaPorDelante: Añade un dígito a un número por delante.
		
		// 13. trozoDeNumero: Toma como parámetros las posiciones inicial y final dentro de un número y devuelve el trozo correspondiente.
		
	    // 14. juntaNumeros: Pega dos números para formar uno.
			
	}
}

class Funciones {
		
		//      FUNCIONES          FUNCIONES          FUNCIONES          FUNCIONES
		
	
		public static boolean esCapicua(int n) {
			
			boolean esCapicua = false;
			
			// número de una cifra
			if (n < 10) {
			  esCapicua = true;
			}
			
			// número de dos cifras
			if ((n >= 10) && (n < 100)) {
			  if ((n / 10) == (n % 10)) {
				esCapicua = true;
			  }
			}

			// número de tres cifras
			if ((n >= 100) && (n < 1000)) {
			  if ((n / 100) == (n % 10)) {
				esCapicua = true;
			  }
			}

			// número de cuatro cifras
			if ((n >= 1000) && (n < 10000)) {
			  if (((n / 1000) == (n % 10)) && ((( n / 100 ) % 10)== (( n / 10) % 10))) {
				esCapicua = true;
			  }
			}
			
			// número de cinco cifras
			if (n >= 10000) {
			  if (((n / 10000) == (n % 10) ) && ((((n / 1000) % 10)) == ((n / 10) % 10))) {
				esCapicua = true;
			  }
			}
			
			
			 return esCapicua;
						
		}
		
		public static boolean esPrimo(int num) {

		int sum = 2;
		boolean esPrimo = false;
		boolean salir = false;
		
		
			do{
				if(num%sum == 0){		
					esPrimo = false;
					salir = true;
				} 
				sum++;
			
				if(sum==num){
					esPrimo = true;
					salir = true;
					}
			} while( salir == false);
				
		
		return esPrimo;
		
	  }
	  
		public static int siguientePrimo(int numP) {

		int sum = 2;
		boolean esPrimo = true;
		boolean salir = true;
		
		numP++;
		
			do{
				
				if(numP%sum == 0){		
					numP++;
					salir = false;
				} 
				sum++;
				if(sum==numP){
					salir = true;
					}
			} while( salir == false);
				
		return numP;
		
	  }
	  
	
	  
	  public static double daPotencia(int base, int exponente) {
	  
	  return Math.pow( base, exponente);
	 
	  }
	  
	  public static int digitos(int nDigitos) {
		 
		  int digitos ;
		  
		  for (digitos = 1 ; digitos < nDigitos ; digitos++) {
			  nDigitos = nDigitos/10;		  
			  
			  }
		 return digitos;
		  
	   }
	
		public static long voltea(long nVoltea) {			
			
			long nVolteado = 0;			
			
				if (nVoltea<=9) {
					return nVoltea;
						}
						
				 while (nVoltea>0) {
					 nVolteado = (nVolteado*10) + (nVoltea%10);
					 nVoltea = nVoltea / 10;				 
				}
				
			return nVolteado;
			
		}
		
		
	   public static int digitoN(long nLargo, int nPosicion) {
		   
				nLargo = voltea(nLargo);

				while (nPosicion-- > 0) {
				  nLargo = nLargo / 10;
				}

				return (int)nLargo % 10;
		}
		
		
}
