/*
Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla
*/
package Guia2;

import java.util.Scanner;

class eje2E2 {
    public static void main(String[] args){
        System.out.println("Escriba su nombre");
        Scanner sc = new Scanner(System.in);
        String nombre;
        nombre= sc.next();
        
        System.out.println("El nombre escrito es: "+ nombre);
        
    }
}