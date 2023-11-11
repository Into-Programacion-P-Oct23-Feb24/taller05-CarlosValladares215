/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author vcarl
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
       
        // Variables necesarias para resolver el problema
        double costoMinutos;
        double numeroMinutos;
        double valorPlantilla;
        
        // Pedimos por pantalla los valores necesarios para realizar la operacion
        System.out.println("     Plantilla de luz de teléfono de una casa");
        System.out.println("-------------------------------------------------"
                + "----");
        System.out.println("* Ingrese el costo por minutos");
        costoMinutos = entrada.nextDouble();
        System.out.println("* Ingrese el número de minutos consumidos en le mes");
        numeroMinutos = entrada.nextDouble();
        
        // Calculamos el valor de la plantilla de luz
        valorPlantilla = costoMinutos * numeroMinutos;
        
        // Mostramos por pantalla los resultados
        System.out.println("-------------------------------------------------"
                + "----");
        System.out.printf("El valor de la plantilla de luz es de; %.2f $"
                ,valorPlantilla);
        System.out.println("");

    }
    
}
