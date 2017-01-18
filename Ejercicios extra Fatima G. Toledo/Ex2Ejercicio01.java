/**

Escribe un programa que genere el menú del día de un restaurante vegetariano. El programa debe pedir el día
de la semana, que será un número del uno al siete, y a continuación debe mostrar de forma aleatoria la
secuencia de platos en función de las siguientes condiciones: 
* (a) De primer plato puede haber ensalada, pasta o arroz 
* 
* (b) De segundo plato puede haber hamburguesas de soja, filetes de seitán o albóndigas de tofu que irán
acompañados con una guarnición que puede ser patatas bravas, verduras a la plancha o pimientos asados 
* (c) De postre puede haber flan, helado o arroz con leche 
* (d) Cuando el primer plato es arroz, el postre no puede ser arroz con leche 
* (e) Los sábados y domingos no hay menú (se debe mostrar un mensaje que así lo indique).
Ejemplo:
Selecciona un día de la semana (un número del 1 al 7): 5
Menú del día: pasta de primero, albóndigas de soja con patatas bravas de segundo y arroz con leche de postre.

**/

public class Ex2Ejercicio01 {
	
	public static void main (String[]args) {
		
		System.out.println("Bienvenido a Vegan Budha, ¿qué día es?, [1-7]");
		int dia = Integer.parseInt(System.console().readLine());
		
		if (dia != 6 && dia != 7) {
			
			int primerPlato = (int) (Math.random() * 2);
			System.out.println("El menú de hoy es: ");
			
				switch (primerPlato) {
					
					case 0 :
					System.out.print(" De primero ensalada, ");
					break;
					case 1 :
					System.out.print(" De primero pasta, ");
					break;
					case 2 :
					System.out.print(" De primero arroz, ");
					break;
					default:
					}
					
			int segundoPlato = (int) (Math.random() * 2);
			
				switch (segundoPlato) {
					
					case 0 :
					System.out.print("hamburguesa de soja con ");
					break;
					case 1 :
					System.out.print("filete de seitán con ");
					break;
					case 2 :
					System.out.print("albóndigas de tofu con ");
					break;
					default:
					}
			int guarnicion = (int) (Math.random() * 2);
			
				switch (guarnicion) {
					
					case 0 :
					System.out.print("patatas bravas y ");
					break;
					case 1 :
					System.out.print("verduras plancha y ");
					break;
					case 2 :
					System.out.print("pimientos asados y ");
					break;
					default:
					}
			int postre = (int) (Math.random() * 3);	
			
			if (primerPlato == 2 && postre == 2) {
				postre = (int) (Math.random() * 2);
				} 
				else {
					
					switch (postre) {
					
					case 0 :
					System.out.print("de postre flan. ");
					break;
					case 1 :
					System.out.print("de postre helado. ");
					break;
					case 2 :
					System.out.print("de postre arroz con leche. ");
					break;
					default:
					
					}
				}
			
			
			} else {
				System.out.println("Sábados y Domingos no hay menú.");
				}
	}
	
	
}

