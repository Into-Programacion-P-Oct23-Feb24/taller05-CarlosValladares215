/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author vcarl
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        // Variables para calcular el área de un triángulo
        double base;
        double altura;
        double area;

        // Pedimos por pantalla la altura y base
        System.out.println("            Área de un triángulo");
        System.out.println("-----------------------------------------------");
        System.out.println("* Ingrese la base del triángulo");
        base = entrada.nextDouble();
        System.out.println("* Ingrese la altura del triángulo");
        altura = entrada.nextDouble();

        // Formula que calculara el área de una triángulo
        area = (base * altura) / 2;
        
        // Presentamos por pantalla el resultado
        System.out.println("-----------------------------------------------");
        System.out.printf("El área del triángulo es de: %.2f\n",area);
    }

}
