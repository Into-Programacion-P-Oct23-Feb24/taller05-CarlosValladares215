/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

import java.text.ChoiceFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author vcarl
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        // Asignacion de variables
        double cpu;
        double teclado;
        double pantalla;
        double raton;
        double costoPartes;
        
        // Pedimos por pantalla los datos
        System.out.println("            Costo de una computadora de "
                + "escritorio");
        System.out.println("-----------------------------------------------"
                + "----------------------");        
        System.out.println("* Ingrese el costo del CPU:");
        cpu = entrada.nextDouble();
        System.out.println("* Ingrese el costo del teclado:");
        teclado = entrada.nextDouble();
        System.out.println("* Ingrese el costo de la pantalla:");
        pantalla = entrada.nextDouble();
        System.out.println("* Ingrese el costo del ratón:");
        raton = entrada.nextDouble();
        
        // Linea de codigo que calcula el costo total
        costoPartes = cpu + teclado + pantalla + raton;
        
        // Mostramos por pantalla los resultados
        System.out.println("-----------------------------------------------"
                + "----------------------");
        System.out.printf("El costo de la computadora de escritorio es de: "
                + "%.2f $",costoPartes);
        System.out.println("");
    }
    
}
