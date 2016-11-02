public class Ejercicio01diassemana{
	public static void main (String[] args)
	{
    System.out.print("Escriba un día de la semana ");
    String diasemana = (System.console().readLine().toLowerCase());
  
      if (diasemana.equals("lunes")){
        System.out.print("El lunes tienes a primera hora programación.");      
      } else if (diasemana.equals("martes")){
          System.out.print("El martes tienes a primera hora sistemas inf.");
      } else if (diasemana.equals("miercoles")){
          System.out.print("El maiércoles tienes a primera hora Lenguaje de marcas.");
      } else if (diasemana.equals("jueves")){
          System.out.print("El jueves tienes a primera hora Entorno de desarrollo.");
      } else if (diasemana.equals("viernes")){
          System.out.print("El viernes tienes a primera hora FOL");
      } else if (diasemana.equals("sabado") || diasemana.equals("sábado")){
          System.out.print("El sábado no hay clase!!");
      } else {
          System.out.print("Ese día no hay clase tampoco, home");
      }
      
	}

}
