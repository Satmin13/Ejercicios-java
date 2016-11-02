public class AreaRectangulo{
    public static void main (String []args){
      System.out.print("Por favor escriba el tamaño de la base en centimetros: ");
      double pesetas = Double.parseDouble ( System.console(). readLine());
      System.out.printf(pesetas + "pesetas son: %.2f euros.", (pesetas / 166.386) );
    }
  
  
  }
