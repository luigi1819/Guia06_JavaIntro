/*
    Escribir un programa que lea un número entero y devuelva el número de dígitos que
    componen ese número. Por ejemplo, si introducimos el número 12345, el programa
    deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
    de división. Nota: recordar que las variables de tipo entero truncan los números o
    resultados
 */
package introjava.EjerciciosExtrasGuia6;

import java.util.Scanner;

/**
 *
 * @author LuiG
 */
public class EjercicioExtra11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingresa un numero");
        int numero = leer.nextInt();
        int contador=0;
        while(numero>0){
            numero/=10;
            contador++;
        }
        System.out.println("la cantidad de cifras del numero que ingresaste es "+contador);
        // TODO code application logic here
    }
    
}
