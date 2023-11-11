/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema05;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author vcarl
 */
public class Problema05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        // Asignacion de variables
        double edad;
        double netflix;
        double ytPremium;
        double dropbox;
        double spotify;
        double subtotal;
        double descuento;
        double total;

        // Pedimos por pantalla los datos necesarios
        System.out.println("               Servicios Digitales a pagar por"
                + " mes");
        System.out.println("-------------------------------------------------"
                + "------------------");
        System.out.println("* Ingrese su edad:");
        edad = entrada.nextDouble();
        System.out.println("* Ingrese el valor a pagar de netflix:");
        netflix = entrada.nextDouble();
        System.out.println("* Ingrese el valor a pagar de youtube premium:");
        ytPremium = entrada.nextDouble();
        System.out.println("* Ingrese el valor a pagar de dropbox:");
        dropbox = entrada.nextDouble();
        System.out.println("* Ingrese el valor a pagar de spotify:");
        spotify = entrada.nextDouble();
        System.out.println("--------------------------------------------"
                + "-----------------------");
        // Calculo del subtotal
        subtotal = netflix + ytPremium + dropbox + spotify;
        // Condicional encargado de resolver el descuento
        if (edad < 30) {
            descuento = (subtotal * 20) / 100;
            total = subtotal - descuento;
            System.out.println("Por ser menor de 30 años usted recibe un"
                    + " 20% de descuento");
        }else{
            total = subtotal;
        }
        
        System.out.printf("El valor total mensual a pagar es de: $ %.2f ",total);
        System.out.println("");
    }

}
