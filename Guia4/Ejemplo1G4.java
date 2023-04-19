
package Guia4;

import java.util.Scanner;

public class Ejemplo1G4 {
    
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese la frase para codificar: ");
        String frase = leer.nextLine();
        String code = codificacion(frase);
        System.out.println("La frase codificada es: "+ code);
    }
    
    public static String codificacion(String frase) {
        String codigo= "";
        for (int i=0; i < frase.length()-1; i++) {
            char letra= frase.charAt(i);
           switch (letra) {
                case 'a':
                case 'A':
                    codigo += '@';
                    break;
                case 'e':
                case 'E':
                    codigo += '#';
                    break;
                case 'i':
                case 'I':
                    codigo += '$';
                    break;
                case 'o':
                case 'O':
                    codigo += '%';
                    break;
                case 'u':
                case 'U':
                    codigo += '*';
                    break;
                default:
                    codigo += letra;
                    break;
        }
        }
    return codigo;
     }
    
}
