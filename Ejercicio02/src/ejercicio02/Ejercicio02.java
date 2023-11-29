/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author LAB.ELECT
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int numero;
        int contador = 1;

        System.out.println("Ingrese el valor de n el cual debe ser positivo "
                + "y par");
        numero = entrada.nextInt();

        if (numero > 0 && numero % 2 == 0) {
            while (contador <= numero) {
                System.out.println(contador + "\n");
                contador = contador + 1;
            }

        } else {
            System.out.println("Error: Valor invalido");
        }
    }
}
