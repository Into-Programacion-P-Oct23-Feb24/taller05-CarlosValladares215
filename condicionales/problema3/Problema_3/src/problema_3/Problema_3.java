/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema_3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author vcarl
 */
public class Problema_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        // Variables usadas para realizar el programa
        String marca;
        int origen;
        double costo;
        double impuesto;
        double precioVenta;

        // Recopilacion de datos para el programa
        System.out.println("                                        Ingrese los"
                + " datos del autómovil");
        System.out.println("-------------------------------------------------"
                + "----------------------------------------------------------");
        System.out.println("* Ingrese la marca de su auto");
        marca = entrada.nextLine();
        System.out.println("* Ingrese un numero del 1 al 4 "
                + "según el origen del auto");
        System.out.println("""
                            1. Alemania 
                            2. Japón 
                            3. Italia 
                            4. USA""");
        origen = entrada.nextInt();
        System.out.println("* Ingrese el costo del auto");
        costo = entrada.nextDouble();
        System.out.println("-------------------------------------------------"
                + "----------------------------------------------------------");
        // Condicional usada para calcular los impuestos
        if (origen == 1) {
            impuesto = (costo * 20) / 100;
            precioVenta = costo - impuesto;
            System.out.printf("Como el origen de su carro es alemán "
                    + "su impuesto por pagar es del 20%%");
        } else {
            if (origen == 2) {
                impuesto = (costo * 30) / 100;
                precioVenta = costo - impuesto;
                System.out.printf("Como el origen de su carro es japones "
                        + "su impuesto por pagar es del 30%%");

            } else {
                if (origen == 3) {
                    impuesto = (costo * 15) / 100;
                    precioVenta = costo - impuesto;
                    System.out.println("Como el origen de su carro es italiano "
                            + "su impuesto por pagar es del 15%");
                } else {
                    if (origen == 4) {
                        impuesto = (costo * 8) / 100;
                        precioVenta = costo - impuesto;
                        System.out.printf("Como el origen de su carro es de "
                                + "Estados Unidos"
                                + " su impuesto por pagar es del 15%%");
                    } else {
                        impuesto = 0;
                        precioVenta = costo;
                        System.out.printf("Solo se pueden escojer 4 paises, "
                                + "por lo tanto al no poder determinar "
                                + "el porcentaje su impuesto es");
                    }
                }
            }
        }
        System.out.printf(": $ %.2f\n", impuesto);
        System.out.printf("El precio de venta es de; $ %.2f \n",
                precioVenta);
    }
}
