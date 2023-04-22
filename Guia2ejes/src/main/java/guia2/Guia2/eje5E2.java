/*
Escribir un programa que lea un número entero por teclado y 
muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().
*/
package Guia2;

import java.util.Scanner;

public class eje5E2 {
    public static void main(String[] args) {
        System.out.println("Ingrese un valor entero");
        Scanner leer=new Scanner(System.in);
        int num,d,t,r;
        num= leer.nextInt();
        d= num*2;
        t= num*3;
        r= (int) Math.sqrt(num);
        System.out.println("El doble del valor ingresado es:"+ d);
        System.out.println("El triple del valor ingresado es:"+ t);
        System.out.println("La raiz cuadrada del valor ingresado es:"+ r);
        
    }
    
}
