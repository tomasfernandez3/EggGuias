
package Guia4;

import java.util.Scanner;

public class Eje1G4 {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el primer numero entero");
        int num1= leer.nextInt();
        System.out.println("Ingrese el segundo numero entero");
        int num2= leer.nextInt();
            System.out.println("Seleccione una opcion: ");
            System.out.println("Opcion 1:Suma");
            System.out.println("Opcion 2:Resta");
            System.out.println("Opcion 3:Multiplicacion");
            System.out.println("Opcion 4:Division entera");
            System.out.println("Opcion 5:Salir");
        int opcion = leer.nextInt();
        int retorno = mate(num1, num2, opcion);
        System.out.println("Su opcion "+ opcion +" el resultado que da es: "+  retorno);
    }
     public static int mate(int num1, int num2, int opcion) {
        Scanner leer=new Scanner(System.in);
        int retorno = 0;
        char son;
        switch (opcion){
            case 1:
                retorno= num1 + num2;
                break;
            case 2:
                retorno= num1 - num2;
                break;
            case 3:
                retorno= num1 * num2;
                break;
            case 4:
                retorno= num1 / num2;
                break;
            case 5: System.out.println("¿Estas seguro que deseas salir?(S/N)");
                        son= leer.next().charAt(0);
                    if (son == 'S'|| son == 's') {
                        System.out.println("Adios, ¡Nos vemos pronto!");
                        System.exit(0);
                    }
                    break;
            default:
             System.out.println("Opcion invalida, intente otra vez del 1 al 5");
        }
        
        return retorno;
     }
}
