/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *

*/
package Guia3;

import java.util.Scanner;

public class Eje8G3 {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.print("Introduce el tamaño del cuadrado: ");
        int n = leer.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
