/**
1. Realiza un programa que pida 10 números enteros por teclado. A continuación el programa nos tiene
que decir cuál es el número que más se repite y cuántas veces se repite. Si hay varios números
repetidos las mismas veces, se da por bueno cualquiera de ellos.
Ejemplo:
Introduzca diez números enteros:
23
6789
-345
88 6789
9387
2344
-1024
8
El número que más aparece es el 8. Se repite 3 veces.
**/




import java.util.Scanner;


public class Ex5Ejercicio01 {
    public static void main(String[] args) {
        //Array en el que introduzco los números.
        int [] numeros = new int[10];
        //Array que utilizo para comprobar si se repirten
        int [] numeros2 = new int[10];
        Scanner s = new Scanner(System.in);
        //Relleno el array numeros con diez números introducidos por teclado.
        for(int i=0;i<numeros.length;i++){
            System.out.print("Introduzca el número "+(i+1)+" : ");
            int numero = Integer.parseInt(s.nextLine());
            numeros[i]=numero;
        }
        //Introduzco los números del array números en el array números2.
        for(int i=0;i<numeros2.length;i++){
            numeros2[i]=numeros[i];
            
        }

        int repetido=0;
        int [] contadorRepetidos = new int[10];
        
        for(int i=0;i<numeros.length;i++){
            
            
            for(int e=0;e<i;e++){
                if(numeros[i]==numeros2[e]){
                //    contadorRepetidos [i] ++;
                
                repetido = numeros[i];
                
                }
            }
            
            
        }
        System.out.println("El número que más aparece es el "+repetido);
        
        
    }
}
