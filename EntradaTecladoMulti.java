public class EntradaTecladoMulti {
	public static void main(String[] args) {
    System.out.print("Por favor, dime un número: ");
    int num1 = Integer.parseInt( System.console().readLine() );
    System.out.print("Por favor, dime otro número: ");
    int num2 = Integer.parseInt( System.console().readLine() );
		System.out.println("La multiplicación de ambos da como resultado " + (num1 * num2));
	}
}
