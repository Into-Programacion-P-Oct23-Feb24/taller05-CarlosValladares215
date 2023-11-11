/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author vcarl
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        // Asignacion de variables
        double hijo1;
        double hijo2;
        double hijo3;
        double gastoTotal;

        // Recpilacion de valores para las variables por pantalla
        System.out.println("             Gatos de tres hijos");
        System.out.println("-----------------------------------------------");
        System.out.println("* Gasto del primer hijo:");
        hijo1 = entrada.nextDouble();
        System.out.println("* Gasto del segundo hijo:");
        hijo2 = entrada.nextDouble();
        System.out.println("* Gato del tercer hijo:");
        hijo3 = entrada.nextDouble();
        
        // Linea de codigo que calcula los gatos
        gastoTotal = hijo1 + hijo2 +hijo3;
        
        // Mostramos por pantalla el resultado
        System.out.println("-----------------------------------------------");
        System.out.printf("El padre de familia tiene un total "
                + "de gastos de: $ %.2f",gastoTotal);
        System.out.println("");
                
    }

}
