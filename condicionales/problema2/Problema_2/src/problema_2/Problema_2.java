/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema_2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author vcarl
 */
public class Problema_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        // Asignacion de variables
        String descripcion;
        double costoPedido;
        double cantidad;
        double precioUnitario;
        double descuento;
        
        // Pedir por pantalla para recopilar la informacion
        System.out.println("Ingrese la descripcion del articulo requerido");
        descripcion = entrada.nextLine();
        System.out.println("Ingrese la cantidad que se requiere");
        cantidad = entrada.nextDouble();        
        System.out.println("Ingrese el precio unitario del producto");
        precioUnitario = entrada.nextDouble();
        
        //  Line de codigo encargada de calcular el costo sin descuento
        costoPedido = precioUnitario * cantidad;
        
        // Condicional que calcula el descuento segun la edad
        if (cantidad > 50) {
            descuento = (costoPedido * 15)/100;
            costoPedido = costoPedido - descuento;
            
        }
        
        System.out.println("-----------------------------------------------"
                + "----------------------");
        System.out.printf("Descripcion del Articulo: %s \n",descripcion);
        System.out.printf("Costo del pedido: $ %.2f \n", costoPedido);
        
    }
    
}
