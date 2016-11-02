public class EntradaTecladoConversor{
    public static void main (String []args){
      System.out.print("Por favor escriba una cantidad en pesetas para convertir a euros: ");
      double pesetas = Double.parseDouble ( System.console(). readLine());
      System.out.printf(pesetas + "pesetas son: %.2f euros.", (pesetas / 166.386) );
    }
  
  
  }
