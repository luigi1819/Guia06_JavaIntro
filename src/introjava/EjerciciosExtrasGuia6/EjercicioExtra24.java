/*
    Realizar un programa que complete un vector con los N primeros números de la sucesión
    de Fibonacci. Recordar que la sucesión de Fibonacci es la sucesión de los siguientes
    números:
    1, 1, 2, 3, 5, 8, 13, 21, 34, ...
    Donde cada uno de los números se calcula sumando los dos anteriores a él. Por ejemplo:
    La sucesión del número 2 se calcula sumando (1+1)
    Análogamente, la sucesión del número 3 es (1+2),
    Y la del 5 es (2+3),
    Y así sucesivamente...
    La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente fórmula:
    Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
    Fibonaccin = 1 para todo n<=1
    Por lo tanto, si queremos calcular el término “n” debemos escribir una función que reciba
    como parámetro el valor de “n” y que calcule la serie hasta llegar a ese valor.
    Para conocer más acerca de la serie de Fibonacci consultar el siguiente link:
    https://quantdare.com/numeros-de-fibonacci/
 */
package introjava.EjerciciosExtrasGuia6;

import java.util.Scanner;

/**
 *
 * @author LuiG
 */
public class EjercicioExtra24 {

    public static Scanner leer = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("ingresa el termino N de la sucesion a conocer");
        int posicionFibonachi = leer.nextInt();
        int [] vectorFibonachi = new int [posicionFibonachi];
        generarFibonachi(vectorFibonachi, posicionFibonachi);
        imprimirFibonachi(vectorFibonachi);
        sumaFibonachi(vectorFibonachi);
        // TODO code application logic here
    }
    public static void generarFibonachi(int [] vectorFibonachi,int posicionFibonachi){
        
        for (int i = 0; i < posicionFibonachi; i++) {
            if(i<2){
               vectorFibonachi[i]=1;
            }else{
                vectorFibonachi[i]=vectorFibonachi[i-1]+vectorFibonachi[i-2];
            }
                  
        }
        
    }
    
    public static void imprimirFibonachi(int [] vectorFibonachi){
       String aux="";
       for(int elemento:vectorFibonachi){
           aux+="-"+elemento;
       }
        System.out.println(aux);
    }
    public static void sumaFibonachi(int [] vectorFibonachi){
       int suma=0;
       for(int elemento:vectorFibonachi){
           suma+=elemento;
       }
        System.out.println("la suma de los N elementos de Fibonachi es "+ suma);
    }
    
}
