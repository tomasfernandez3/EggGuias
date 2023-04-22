/*
Crea una aplicación que a través de una función nos convierta una cantidad de euros 
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. 
La función tendrá como parámetros, la cantidad de euros y la moneda a convertir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

*/
package Guia4;

import java.util.Scanner;

public class Eje2G4 {
    
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int opcion;
        double e,total;
        System.out.println("Ingrese la cantidad de Euros que desea convertir: ");
        e= leer.nextInt();
        System.out.println("¿En que moneda lo quiere convertir?: ");
        System.out.println("1: Libras");
        System.out.println("2: Dolares");
        System.out.println("3: Yenes");
        opcion= leer.nextInt();
        total= convertido(e, opcion);
        System.out.println("El dinero se convirtio perfectamente  ");
        System.out.println("Su dinero ahora es: "+ total);
}
    public static double convertido(double e, int opcion) {
        double total = 0;
        switch (opcion) {
            case 1:
                total= e * 0.86;
                break;
            case 2:
                total= e * 1.28611;
                break;
            case 3:
                total= e * 129.852;
                break;
            default:
                System.out.println("Opcion invalida, intente otra vez del 1 al 3");
        }
        return total;
        
    }
}

