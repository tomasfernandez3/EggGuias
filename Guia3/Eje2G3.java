/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa 
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto.
Nota: investigar la función equals() en Java.
*/
package Guia3;

import java.util.Scanner;

public class Eje2G3 {

    public static void main(String[] args) {
        System.out.println("Escriba la frase correcta");
        Scanner leer=new Scanner(System.in);
        String frase;
        frase= leer.next();
        String f = frase.toLowerCase();
        
        if (f.equals("eureka")) {
           System.out.println("La frase es CORRECTAA!!");
        } else {
            System.out.println("La frase es incorrecta"+" "+ f);
        }
    }
}
   