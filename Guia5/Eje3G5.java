
package Guia5;

import java.util.Scanner;

public class Eje3G5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador;
        int undigito = 0, dosdigitos = 0, tresdigitos = 0, cuatrodigitos = 0, cincodigitos = 0;

        System.out.println("Ingrese tamaño del arreglo: ");
        int tamaño = scanner.nextInt();

        int[] arreglo = new int[tamaño];

        for (int i = 0; i < tamaño; i++) {
            arreglo[i] = (int) (Math.random() * 10000);

        }

        for (int i = 0; i < tamaño; i++) {
            contador = 0;
            while (arreglo[i] != 0) {
                arreglo[i] =(int) arreglo[i] / 10;
                contador++;
                
             
                
            }
            switch (contador) {
                case 1:
                    undigito++;
                    break;
                case 2:
                    dosdigitos++;
                    break;
                case 3:
                    tresdigitos++;
                    break;
                case 4:
                    cuatrodigitos++;
                    break;
                case 5:
                    cincodigitos++;
                    break;
            }
//           contador=0;
        }

        System.out.println("Números de 1 digito: " + undigito);
        System.out.println("Números de 2 digitos: " + dosdigitos);
        System.out.println("Números de 3 digitos: " + tresdigitos);
        System.out.println("Números de 4 digitos: " + cuatrodigitos);
        System.out.println("Números de 5 digitos: " + cincodigitos);

    }
    }
    

