/*
    Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y
    muestre la suma de sus elementos.
 */
package introjava.EjerciciosExtrasGuia6;

import java.util.Scanner;

/**
 *
 * @author LuiG
 */
public class EjercicioExtra22 {
    
public static Scanner leer = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][] matriz;
        System.out.println("dimensiona la matriz numero filas");
        int filas = leer.nextInt();
        System.out.println("dimensiona la matriz numero de columnas");
        int columnas = leer.nextInt();
        matriz= new int [filas][columnas];
        llenarMatriz(matriz, filas, columnas);
    }
    public static void llenarMatriz(int[][]matriz,int filas,int columnas){
        int total=0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j]= (int)(Math.random()*10);
                total+=matriz[i][j];
            }
        }
        System.out.println("la suma de los elementos de la matriz es "+ total);
    }
}
