/**
3. Escribe un programa que, a partir de un número generado al azar entre 0 y 100000, pinte una figura
zigzagueante. Por cada dígito del número se debe pintar una diagonal con tantos asteriscos como
indique el dígito, empezando siempre de izquierda a derecha. El dígito 0 se ignora y no tiene ningún
efecto sobre la figura. La dirección de las diagonales se van alternando: primero de izquierda a
derecha, luego de derecha a izquierda, luego otra vez de izquierda a derecha, etc. Observa que, al
final, el número de asteriscos pintados es igual a la suma de todos los dígitos del número. Hay que
dejar un espacio prudencial entre el primer carácter que se pinta y el borde izquierdo de la pantalla
(por ej. 15 o 20 espacios). Fíjate que lo único aleatorio que tiene este ejercicio es la generación del
número.
**/

public class Ex6Ejercicio03 {
  
  public static void main(String[] args) {
        int espacios=20;  
        long numero;
        int cantidad=0;
        long ultimo=0;
        long numeroIntro = (long)(Math.random()*100001);;
        numero = numeroIntro;
        do{
            numero = numero/10;
            cantidad++;
        }while(numero>0);
        long[] posicion=new long[cantidad];
        numero = numeroIntro;
        
        for(int i=0;i<posicion.length;i++){
            ultimo = numero%10;  
            posicion[i]=ultimo;
            numero = numero/10;   
        }
        System.out.print("Número generado: ");
        for(int i=posicion.length-1;i>0;i--){
            System.out.print(posicion[i]);
        }
        System.out.println();
        for(int i=posicion.length-1;i>0;i--){
            for(int e=0;e<posicion[i];e++){
                for(int s=0;s<espacios;s++){
                    System.out.print(" ");
                }
                System.out.println("*");
                if(i%2==0 || i==0){
                    espacios++;
                }else{
                    espacios--;
                }     
            }
        }
    }
}
