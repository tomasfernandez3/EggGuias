
package Guia3;

import java.util.Scanner;

public class Eje7G3 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int correctas = 0;
        int incorrectas = 0;
        while (true) {
            System.out.print("Introduce una cadena: ");
            String cadena = scanner.nextLine();
            if (cadena.equals("&&&&&")) {
                break;
            } else if (cadena.length() != 5 || cadena.charAt(0) != 'X' || cadena.charAt(4) != 'O') {
                System.out.println("Secuencia incorrecta");
                incorrectas++;
            } else {
                System.out.println("Secuencia correcta");
                correctas++;
            }
        }
        System.out.println("Lecturas correctas: " + correctas);
        System.out.println("Lecturas incorrectas: " + incorrectas);
    }
}