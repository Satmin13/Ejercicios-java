public class Ejercicio04
  {
    public static void main (String[] args)
      {
        System.out.println("¿Cúantas horas has trabajado esta semana?");
        int horas = Integer.parseInt(System.console().readLine());
        int horasNormales  ;
        int horasExtra = horas - 40;
        
          if (horas <= 40) {
            System.out.println(("Su salario es: ") + (horas*12));
          }  else {
              System.out.println(("Su salario contiene ") + horasExtra + (" horas extra y es de: ") + (horasExtra * 16 + 40 * 12) + (" €."));
            }
      }
    
    
  }
