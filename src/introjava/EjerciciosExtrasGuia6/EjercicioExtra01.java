/*
 Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
    usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
package introjava.EjerciciosExtrasGuia6;

import java.util.Scanner;

/**
 *
 * @author LuiG
 */
public class EjercicioExtra01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        System.out.println("ingresa un tiempo en minutos");
        int tiempoEnMinutos = leer.nextInt();
        convertirTiempo(tiempoEnMinutos);
        
        
    }
    
    public static void convertirTiempo(int tiempoEnMinutos){
        final int dias=1440;
        final int horas=60;
        int diasTotal;
        int horasTotal;
        if (tiempoEnMinutos >= 1440){
            diasTotal=tiempoEnMinutos/dias;
            tiempoEnMinutos %=  dias ;
            System.out.println(tiempoEnMinutos);
            horasTotal = tiempoEnMinutos/horas;
            
            tiempoEnMinutos%=  horas;
            System.out.println(tiempoEnMinutos);
            System.out.println("la cantidad de minutos es equivalante a "+diasTotal+" dias "+ horasTotal+" horas "+tiempoEnMinutos+" minutos ");
        }else{
            horasTotal = tiempoEnMinutos/horas;
            System.out.println(tiempoEnMinutos);
            tiempoEnMinutos%=horas;
            System.out.println(tiempoEnMinutos);
            System.out.println("la cantidad de minutos es equivalante a "+ horasTotal+" horas "+tiempoEnMinutos+" minutos ");
           
        }
        
        //hola
    }
    
}
