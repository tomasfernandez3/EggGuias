/*
Crear un programa que dado un número determine si es par o impar.
*/
package Guia3;

import java.util.Scanner;


public class Eje1G3 {

    
    public static void main(String[] args) {
        System.out.println("Ingrese un numero para determinar si es par o impar");
        Scanner leer=new Scanner(System.in);
        int num;
        String resultado;
        num= leer.nextInt();
        if (num % 2==0){
            System.out.println(num + " es par.");
        } else {
            System.out.println(num + " es impar.");
        }
    }
    
}
