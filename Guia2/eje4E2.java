package Guia2;


import java.util.Scanner;

/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente 
en grados Fahrenheit. 
La fórmula correspondiente es: F = 32 + (9 * C / 5
*/
public class eje4E2 {

    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
       System.out.println("Ingrese los grados Celsius");
       int c,f;
       c= leer.nextInt();
       f=32+(9*c/5);
       System.out.println("Los grados ingresados en Fahrenheit son:"+ f);
       
        
    }
    
}
