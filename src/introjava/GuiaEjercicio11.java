/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;
import  java.util.Scanner;
/**
 *
 * @author LuiG
 */
public class GuiaEjercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int numero1 = leer.nextInt();
        System.out.println("Ingresa un numero 2");
        int numero2 = leer.nextInt();
        int opcion;
        do{
        System.out.println("Menu");
        System.out.println("1.Sumar");
        System.out.println("2.Restar");
        System.out.println("3.Multiplicar");
        System.out.println("4.Dividir");
        System.out.println("5.Salir  ");
        System.out.println("Elija la opcion");
        opcion = leer.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("la suma es "+ (numero1+numero2));    
                break;
                case 2:
                    System.out.println("la resta es "+ (numero1-numero2));
                break;
                case 3:
                    System.out.println("la multiplicacion es "+(numero1*numero2));
                break;
                case 4:
                    System.out.println("la division es "+(numero1/numero2));
                break;
                case 5:
                    if(opcion==5){
                        System.out.println("estas seguro que deseas salir S-Confirmar - N--Negar");
                        String confirmar = leer.nextLine();
                        if(confirmar.equals("s")){
                        opcion=5;
                        }else{
                        break;
                        }
                        
                        
                    }
                break;
            }    
       
        }while(opcion != 5);
        
        
    }
    
}
