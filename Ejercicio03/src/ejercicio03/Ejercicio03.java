/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author LAB.ELECT
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int nmultiplicando;
        int multiplicador;
        int resultado = 0;

        System.out.println("Ingrese el primer valor");
        nmultiplicando = entrada.nextInt();
        System.out.println("Ingrese el segundo valor");
        multiplicador = entrada.nextInt();

        while (multiplicador > 0) {
            if (multiplicador % 2 != 0) {
                resultado = resultado + nmultiplicando;
            }
            nmultiplicando = nmultiplicando * 2;
            multiplicador = multiplicador / 2;
        }
        System.out.println("Resultado: " + resultado);
    }

}
