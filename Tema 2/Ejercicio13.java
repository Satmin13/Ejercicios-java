/**Ejercicio 13
Escribe un programa que ordene tres números enteros introducidos por
teclado.**/

public class Ejercicio13{
	public static void main(String[]args){
	System.out.println("Escribe el primer número para ordenarlo.");
	int a = Integer.parseInt(System.console().readLine());
	System.out.println("Escribe el segundo número para ordenarlo.");
	int b = Integer.parseInt(System.console().readLine());
	System.out.println("Escribe el tercer número para ordenarlo.");
	int c = Integer.parseInt(System.console().readLine());
		
		if((a <= b) && (a <= c)){
			if((b <= c)){
				System.out.println("El orden es: " + a + ", " + b + ", " + c);
			} else {
					System.out.println("El orden es: " + a + ", " + c + ", " + b);
			  }
		} else if ((c <= a) && (c <= b)){					
			if(b <= a){
				System.out.println("El orden es: " + c + ", " + b + ", " + a);
			} else {System.out.println("El orden es: " + c + ", " + a + ", " + b);
			  }
		 } else if(a <= c){
			 System.out.println("El orden es: " + b + ", " + a + ", " + c);
		   } else { 
			   System.out.println("El orden es: " + b + ", " + c + ", " + a);
			 }
		 
	}

}
