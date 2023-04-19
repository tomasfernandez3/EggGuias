/*
 Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos por 
parámetro para que nos indique si es o no un número primo, debe devolver true si es primo,
sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es
primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo

*/
package Guia4;

import java.util.Scanner;

public class Eje3G4 {

    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = Integer.parseInt(leer.nextLine());
        
        if (esPrimo(numero)) {
            System.out.println(numero + " es primo");
        } else {
            System.out.println(numero + " no es primo");
        }
    }
    
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        
        return true;
    }  
    
}
