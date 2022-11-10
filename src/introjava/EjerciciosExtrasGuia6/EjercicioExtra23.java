/*
    Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
    que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
    20 x 20 caracteres. 
    Las palabras se ubicarán todas en orden horizontal en una fila que
    será seleccionada de manera aleatoria. 
    Una vez concluida la ubicación de las palabras,
    rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
    por pantalla la sopa de letras creada.
    Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
    de Java substring(), Length() y Math.random().
 */
package introjava.EjerciciosExtrasGuia6;

import java.util.Scanner;

/**
 *
 * @author LuiG
 */
public class EjercicioExtra23 {
    public static Scanner leer = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String [][] sopaLetras = new String [20][20];
        insertarPalabras(sopaLetras);
        llenarVacios(sopaLetras);
        imprimirSopa(sopaLetras);
        
    }
    public static void insertarPalabras( String [][] sopaLetras){
        int longitud;
        int fila,columna;
        int contador=0;
        int contador2=0;
       
        do {
            System.out.println("ingresa una palabra");
            String palabra= leer.nextLine();
            longitud=palabra.length();
            if(longitud<6&&longitud>2){    
            contador++;
                System.out.println(contador);
                while(contador!=contador2){
                fila=(int)(Math.random()*(19 - 0) + 0);
                columna=(int)(Math.random()*(12 - 0) + 0);
                    if (sopaLetras[fila][0]==null) {
                        contador2++;
                        for (int i = 0; i < palabra.length(); i++) {
                            //PARA MOVER LAS COLUMNAS AGREGAR COLUMNA++ EN VEZ DE I aca abajo y arriba remplzar 0 por columna
                        sopaLetras[fila][i]=palabra.substring(i, i+1);
                        }  
                    }else{
                        System.out.println("buscando otra posicion");
                    }
                }
            }else{
                System.out.println("palabra valida no valida");
            }
        } while (contador<5); 
    }
    
    public static void llenarVacios(String [][] sopaLetras){
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (sopaLetras[i][j]==null) {
                    sopaLetras[i][j]=String.valueOf((int)(Math.random()*(9 - 0) + 0));
                }
            }
        }
    }
    
    public static void imprimirSopa(String [][] sopaLetras){
        String aux="";
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                aux+=" | "+ sopaLetras[i][j];
                 
            }
            System.out.println(aux);
            aux="";
        }
        
    }
}
