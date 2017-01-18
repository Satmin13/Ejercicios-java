/**

Ejercicio 22
Realiza un programa que pinte por pantalla una serpiente con un serpenteo
aleatorio. La cabeza se representará con el carácter @ y se debe colocar
exactamente en la posición 13 (con 12 espacios delante). A partir de ahí,
el cuerpo irá serpenteando de la siguiente manera: se generará de forma
aleatoria un valor entre 
* tres posibles que hará que el siguiente carácter 
* se coloque una posición a la izquierda del anterior, 
* alineado con el anterior o una posición a la derecha del anterior. 
* La longitud de la serpiente se pedirá por
teclado y se supone que el usuario introducirá un dato correcto.
Ejemplo:
Por favor, introduzca la longitud de la serpiente en caracteres contando la cabeza: 6
 @
 *
*
 *
*
 *
 **/
 public class Ejercicio22 {

  public static void main(String[] args) {
	  
	  System.out.println("Introduzca el tamaño de la serpiente");
	  int y = (Integer.parseInt(System.console().readLine())) - 1;
	  int i;
	  int j;
	  
	  for ( i=0 ; i<13 ; i++) {
		  System.out.print(" ");
	  }
	  
	  System.out.println("@");//cabeza
	  
	  for ( j=0 ; j<y ; j++ ) { //cuerpo
		  
		  for ( i=0 ; i<12 ; i++) {//espacios
		  System.out.print(" ");
		  }
		 int pos = (int)(Math.random() * (2));		 
		 
		 switch(pos){
			 case 0 :
			 System.out.print("*");
			 break;
			 case 1 :
			 System.out.print(" *");
			 break;
			 case 2 :
			 System.out.print("  *");
			 break;
		}
		System.out.println();
		
	  }
	  
	  
	}
}
