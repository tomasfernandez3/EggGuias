/*
Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y le pida al 
usuario un número a buscar en el vector. El programa mostrará dónde se encuentra el numero 
y si se encuentra repetido
*/
package Guia5;
import java.util.Scanner;

public class Eje2G5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador,b;
        System.out.println("Ingrese tamaño del arreglo: ");
        int tamaño = scanner.nextInt();
        int[] arreglo = new int[tamaño];
        
        for (int i = 0; i < tamaño; i++) {
            arreglo[i]= (int) (Math.random() * 100);
        }
        System.out.println("Ingrese en que posicion del vector quiere buscar del 0 al " + (tamaño-1));
        b= scanner.nextInt();
        System.out.println("En la posicion " + b + " se encuentra el numero: " + arreglo[b]);
    }
    
}
