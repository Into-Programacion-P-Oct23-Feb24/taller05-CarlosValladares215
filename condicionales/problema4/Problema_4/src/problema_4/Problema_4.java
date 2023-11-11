/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema_4;

import java.util.Scanner;

/**
 *
 * @author vcarl
 */
public class Problema_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Asignacion de variables
        int numeroDias;
        double precioDiario;
        double subtotal;
        double descuento;
        double totalPagar;
        String tipoDescuento;

        //  Datos de entrada
        System.out.println("                  Hosteria ciudad de la Loja");
        System.out.println(" ------------------------------------------------"
                + "------------------");        
        System.out.println("* Ingrese el numero de dias que "
                + "ha estado hospedandose"
                + " en el hotel");
        numeroDias = entrada.nextInt();
        System.out.println("* Ingrese el precio diario de la habitación");
        precioDiario = entrada.nextDouble();
        // Linea de codigo que calcula el subtotal
        subtotal = precioDiario * numeroDias;

        // Condicional para calcular el descuento
        if ((numeroDias > 5) && (numeroDias <= 10)) {
            descuento = (subtotal * 10) / 100;
            totalPagar = subtotal - descuento;
            tipoDescuento = " del 10%:";
        } else {
            if ((numeroDias > 10) && (numeroDias <= 15)) {
                descuento = (subtotal * 15) / 100;
                totalPagar = subtotal - descuento;
                tipoDescuento = " del 15%: ";
            } else {
                if (numeroDias >15) {
                    descuento = (subtotal * 20) / 100;
                    totalPagar = subtotal - descuento;
                    tipoDescuento = " del 20%:";
                }else{
                    descuento = 0;
                    totalPagar = subtotal ;
                    tipoDescuento = " :";
                }
            }
        }
        
        // Presentacion por pantalla de el resultado
        System.out.println(" ------------------------------------------------"
                + "-----------------");
        System.out.printf("Subtotal por pagar: $ %.2f \n",subtotal);
        System.out.printf("Descuento%s $ %.2f \n"
                ,tipoDescuento,descuento);
        System.out.printf("Total por pagar: $ %.2f \n",totalPagar);
    }
}
