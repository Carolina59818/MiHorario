/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mihorario;

import java.util.Scanner;

/**
 *
 * @author caroc
 */
public class MiHorario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Crear un horario de usted de cualquier día de la semana
       //leer un valor de 1  al 24 validar e imprimir la acción que realiza en su horario.
       Scanner entrada = new Scanner(System.in);
       System.out.println("Horario del miercoles");
       System.out.println("Ingrese una hora del dia para mostrar la actividad:");
   
   int numero = entrada.nextInt();     
                         
          switch (numero) {
              case 8: 
                  System.out.println("despertar");
                  break;
            case 9,10: 
                 System.out.println("Tomar clase de calculo");
                   break;
            case 11, 12:
                System.out.println ("Tomar clase de algebra");
                break;
            case 13, 14:
                System.out.println("Preparar la comida");
                  break; 
            case 15: 
                System.out.println("Almorzar");
                  break; 
            case 16:
                System.out.println("Tomar un baño");
                break; 
            case 17,18:
                System.out.println("Hacer tareas pendientes");
                  break; 
            case 19,20: 
                System.out.println("Tomar la clase de lenguaje de programacion");
                  break; 
            case 21: 
                System.out.println("Cenar");
                 break; 
            case 22:     
                  System.out.println("Ver alguna serie o pelicula");
                  break; 
            case 23, 24, 1, 2, 3, 4, 5, 6, 7:    
                  System.out.println("Estar dormida");
                  break;       
            default:
                throw new AssertionError();
        }
}
}        

