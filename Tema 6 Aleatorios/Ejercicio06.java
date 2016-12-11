/**Ejercicio 6
Escribe un programa que piense un número al azar entre 0 y 100. El usuario
debe adivinarlo y tiene para ello 5 oportunidades. Después de cada intento
fallido, el programa dirá cuántas oportunidades quedan y si el número introducido
es menor o mayor que el número secreto.**/

public class Ejercicio06{
	public static void main(String[]args){
		int numero = (int)(Math.random()*100);
		int introducido = 0;
		int intentos = 0;
		
			do{
				System.out.print("Introduce un número entre 0 y 100: ");
				introducido = Integer.parseInt(System.console().readLine());
				intentos++;
				System.out.println(numero);//para saber el numero que esta dando

				
				if(numero!=introducido && intentos>4){
					System.out.println("Has fallado, el número era: " + numero);
				}

				if(introducido==numero){
					System.out.println("¡Has acertado!");
				}
			}while(numero!=introducido && intentos<5);
			

		
	}
}
