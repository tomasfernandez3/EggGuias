/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la suma de 
sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que permita
introducir un cuadrado por teclado y determine si este cuadrado es mágico o no. El programa 
deberá comprobar que los números introducidos son correctos, es decir, están entre el 1 y el 9.
*/
package Guia5;

import java.util.Scanner;

public class Eje6G5 {
    
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
        int[][] cuadrado = new int[3][3];
        int sumaFila = 0, sumaColumna = 0, sumaDiagonal = 0;
        boolean esMagico = true;
        // Pedimos al usuario que introduzca los números del cuadrado
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print("Introduce el número para la posición [" + i + "][" + j + "]: ");
                cuadrado[i][j] = sc.nextInt();
                
                if(cuadrado[i][j] < 1 || cuadrado[i][j] > 9) {
                    System.out.println("Error: los números deben estar entre 1 y 9");
                    return;
                }
            }
        }
        for(int i = 0; i < 3; i++) {
            sumaFila = 0;
            for(int j = 0; j < 3; j++) {
                sumaFila += cuadrado[i][j];
            }
            if(i == 0) {
                sumaColumna = sumaFila;
            } else if(sumaFila != sumaColumna) {
                esMagico = false;
                break;
            }
        }
        if(esMagico) {
            for(int j = 0; j < 3; j++) {
                sumaColumna = 0;
                for(int i = 0; i < 3; i++) {
                    sumaColumna += cuadrado[i][j];
                }
                if(sumaColumna != sumaFila) {
                    esMagico = false;
                    break;
                }
            }
        }
        if(esMagico) {
            sumaDiagonal = cuadrado[0][0] + cuadrado[1][1] + cuadrado[2][2];
            if(sumaDiagonal != sumaFila) {
                esMagico = false;
            } else {
                sumaDiagonal = cuadrado[0][2] + cuadrado[1][1] + cuadrado[2][0];
                if(sumaDiagonal != sumaFila) {
                    esMagico = false;
                }
            }
        }
        // elresul
        if(esMagico) {
            System.out.println("¡El cuadrado es mágico!");
        } else {
            System.out.println("El cuadrado NO es mágico");
        }
    }
    
}
