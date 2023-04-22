/*
Realizar un programa que pida dos números enteros positivos por teclado y muestre por 
pantalla el siguiente menú:El usuario deberá elegir una opción y el programa deberá mostrar 
el resultado por pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se 
elija la opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir
del programa directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro 
que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del 
programa, caso contrario se vuelve a mostrar el menú.
*/
package Guia3;

import java.util.Scanner;

public class Eje6G3 {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int num1,num2,opcion,resto;
        char son;
                
        do {
            System.out.println("Ingrese el primer numero entero");
            num1= leer.nextInt();
            System.out.println("Ingrese el segundo numero entero");
            num2= leer.nextInt();
            System.out.println("Seleccione una opcion: ");
            System.out.println("Opcion 1:Suma");
            System.out.println("Opcion 2:Resta");
            System.out.println("Opcion 3:Multiplicacion");
            System.out.println("Opcion 4:Division entera");
            System.out.println("Opcion 5:Salir");
            opcion= leer.nextInt();
            
            switch(opcion){
                case 1: resto=num1 + num2;
                        System.out.println("La suma entre los dos numeros es: "+ resto);
                    break;
                case 2: resto= num1 - num2;
                        System.out.println("La resta entre los dos numero es:"+ resto);
                    break;
                case 3: resto= num1 * num2;
                        System.out.println("La multiplicacion entre los dos numeros es: "+ resto);
                    break;
                case 4: resto= num1 / num2;
                        System.out.println("La division entre los dos numeros es: "+ resto);
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
       
         }
        while(true);
     }                  
 }
        
   
