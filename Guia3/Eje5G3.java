/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite 
números al usuario hasta que la suma de los números introducidos supere el límite inicial
*/
package Guia3;

import java.util.Scanner;

public class Eje5G3 {
    
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese un valor limite: ");
        int limite = leer.nextInt();
        int suma = 0;
        int num;
        while (suma <= limite) {
            System.out.print("Ingrese un número: ");
            num = leer.nextInt();
            suma += num;
        }
        System.out.println("La suma de los números introducidos es " + suma);
    }
    
}
