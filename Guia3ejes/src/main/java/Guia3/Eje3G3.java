/*
Realizar un programa que solo permita introducir solo frases o palabras 
de 8 de largo. Si el usuario ingresa una frase o palabra de 8 de 
largo se deberá de imprimir un mensaje por pantalla que diga 
“CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
Nota: investigar la función Lenght() en Java.
*/
package Guia3;

import java.util.Scanner;

public class Eje3G3 {
    
    public static void main(String[] args) {
        System.out.println("Escriba una frase o palabra de 8 caracteres");
        Scanner leer=new Scanner(System.in);
        String p;
        p= leer.next();
        
        if (p.length()<=8) {
            System.out.println(p +" "+ "Su frase/palabra es CORRECTA!");
        } else{
            System.out.println("Su frase/palabra es INCORRECTA");
        }
    }
    
}
