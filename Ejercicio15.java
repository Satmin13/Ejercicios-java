/**Ejercicio 15
Escribe un programa que pinte una pirámide rellena con un carácter introducido
por teclado que podrá ser una letra, un número o un símbolo como *, +,
-, $, &, etc. El programa debe permitir al usuario mediante un menú elegir si
el vértice de la pirámide está apuntando hacia arriba, hacia abajo, hacia la
izquierda o hacia la derecha.**/
public class Ejercicio15{
	public static void main(String[]args){
		System.out.println("Escribe una letra o símbolo para que dibujemos una pirámide");
		String car = System.console().readLine();
		System.out.println("Escribe a si quieres que la pirámide tenga su vértice arriba y b si lo quieres abajo!");
		String posicion = System.console().readLine();		
		if (posicion.equals("a")){
			System.out.println("     "+ car );
			System.out.println("    "+ car + car + car );
			System.out.println("   "+ car + car + car + car + car + car);
			System.out.println("  "+ car + car + car + car + car + car + car + car);
		}
		if (posicion.equals("b")){
			System.out.println("  "+ car + car + car + car + car + car + car + car);			
			System.out.println("   "+ car + car + car + car + car + car);
			System.out.println("    "+ car + car + car );
			System.out.println("     "+ car );
		} else {System.out.println("Perdón no lo he entendido :(");}
	}
}
