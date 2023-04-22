/*
Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N,
con los valores ingresados por el usuario
*/
package Guia5Extras;

import java.util.Scanner;

public class Eje1G5Extra {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector: ");
        int tamaño= leer.nextInt();
        int total= 0;
        int[] vector= new int [tamaño];
        for (int i = 0; i < tamaño; i++) {
            int loco = 0;
            System.out.println("Ingrese el valor del vector " + loco+1);
            vector[i]= leer.nextInt();
        }
        for (int i = 0; i < vector.length; i++) {
            total += vector[i];
        }
        System.out.println("El valor total del vector es: "+ total);
    }
    
}
