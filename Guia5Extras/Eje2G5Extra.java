/*
Escriba un programa que averigüe si dos vectores de N enteros son iguales 
(la comparación deberá detenerse en cuanto se detecte alguna diferencia entre los elementos).
 */
package Guia5Extras;

import java.util.Scanner;

public class Eje2G5Extra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del primer vector: ");
        int total = 0;
        int[] vector1 = new int[leer.nextInt()];
        System.out.println("Ingrese el tamaño del Segundo vector: ");
        int[] vector2 = new int[leer.nextInt()];
        for (int i = 0; i < vector1.length; i++) {
              System.out.println("Ingrese el valor para el vector 1: ");
            vector1[i] = leer.nextInt();
        }
        for (int i = 0; i < vector2.length; i++) {
            System.out.println("Ingrese el valor para el vector 2: ");
            vector2[i] = leer.nextInt();
        }
        for (int i = 0; i > vector1.length; i++) {
            if (vector1[i] == vector2[i]) {
                System.out.println("Felicidades los vectores son iguales!");
            }

        }
    }
}
