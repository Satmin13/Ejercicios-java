/**
Escribe un programa que pida al usuario introducir sus 5 números favoritos. Estos números se deben
guardar en un array. A continuación, se mostrarán todos los números del 1 al 100 junto con “ME
GUSTA” o “no me gusta” según si el número en cuestión está o no está el el array de favoritos tal y
como se muestra en el ejemplo. Nótese que “ME GUSTA” está en mayúsculas para que se pueda
distinguir bien. Por cada 5 números mostrados hay un salto de línea.
Ejemplo:
Por favor, introduzca sus 5 números favoritos:
13
23
55
4
5
1 no me gusta, 2 no me gusta, 3 no me gusta, 4 ME GUSTA, 5 ME GUSTA,
6 no me gusta, 7 no me gusta, 8 no me gusta, 9 no me gusta, 10 no me gusta,
11 no me gusta, 12 no me gusta, 13 ME GUSTA, 14 no me gusta, 15 no me gusta,
**/

public class Ex6Ejercicio02 {
  public static void main(String []args) {
    
    int[] numUser = new int [5];
    int i;
    int j;
    int num1 = 0;
    int num2 = 0; 
    int num3 = 0;
    int num4 = 0;
    int num5 = 0;
    
    System.out.println("Introduce tus números favoritos pulsa ENTER para introducir: ");
    
    for ( i = 0 ; i < 5 ; i++) { //pido los numeros favoritos, los guardo en variables enteras.
      
      numUser[i] = Integer.parseInt(System.console().readLine());
       num1 = numUser[0] ;
       num2 = numUser[1] ;
       num3 = numUser[2] ;
       num4 = numUser[3] ;
       num5 = numUser[4] ;
       
      }        
           
        
      for (j = 1 ; j <= 100 ; j++) {//muestro 100 numeros y los comparo con mis variables para saber cuales son los favoritos.
        
            if ( j == num1 || j == num2 || j == num3 | j == num4 || j == num4 || j == num5) {
              
               System.out.print(" ME GUSTA el " + j + " ");
               }   else {System.out.print ( " " + j + " no me gusta ");  }
               
               
               if (j%5 == 0){ //cada 5 números hace un salto de linea
                 System.out.println();
                }
               
      }     
        
    }
}

