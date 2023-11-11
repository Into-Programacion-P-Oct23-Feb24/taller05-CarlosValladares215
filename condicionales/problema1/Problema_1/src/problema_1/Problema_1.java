/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema_1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Carlos Valladares
 */
public class Problema_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        // asignacion de variables
        int edad;
        double valorCosto;
        double numeroKilovatios;
        double descuento;
        double valorCancelar;
        double costoTotal;

        // Presentar por pantalla informacion usada para el programa
        System.out.println("Ingrese su edad");
        edad = entrada.nextInt();
        System.out.println("Ingrese el valor de costo por kilovatios/hora");
        valorCosto = entrada.nextDouble();
        System.out.println("Ingrese el numero de kilovatios consumidos en el mes");
        numeroKilovatios = entrada.nextDouble();

        // Calculo del costo total sin descuento
        costoTotal = valorCosto * numeroKilovatios;

        // Estructura condicional para dar un descuento
        if (edad > 65) {
            descuento = (costoTotal * 10) / 100;
            valorCancelar = descuento;
        } else {
            valorCancelar = costoTotal;
        }

        // Se muestra el valor total a cancelar de una plantilla de luz
        System.out.printf("""
                          El valor total a cancelar de su plantilla de luz es de: %.2f $ 
                          """,valorCancelar);

    }

}
