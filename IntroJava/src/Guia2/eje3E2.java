 /**
     *Escribir un programa que pida una frase y la muestre toda en mayúsculas 
     * y después toda en minúsculas.Nota: investigar la función toUpperCase() y 
     * toLowerCase() en Java.
     */
package Guia2;

import java.util.Scanner;

public class eje3E2 {
    
    public static void main(String[] args) {
        System.out.println("Escriba una frase");
        Scanner leer=new Scanner(System.in);
        String frase;
        frase= leer.next();
        System.out.println("Su frase en mayuscula es: "+ frase.toUpperCase());
        
        System.out.println("Su frase en minuscula es: "+ frase.toLowerCase());
          
        
        
    } 
}