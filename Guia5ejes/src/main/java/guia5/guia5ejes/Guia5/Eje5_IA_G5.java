
package Guia5;

public class Eje5_IA_G5 {

    public static void main(String[] args) {
        int[][] matrix = {{0, 1, -2}, {-1, 0, 3}, {2, -3, 0}}; // matriz de ejemplo
        boolean isAntisymmetric = true;
        
        // Comprobar si la matriz es cuadrada
        if (matrix.length != matrix[0].length) {
            isAntisymmetric = false;
        } else {
            // Comprobar si la matriz es antisimétrica
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    if (matrix[i][j] != -matrix[j][i]) {
                        isAntisymmetric = false;
                        break;
                    }
                }
            }
        }
        // Imprimir el resultado
        if (isAntisymmetric) {
            System.out.println("La matriz es antisimétrica");
        } else {
            System.out.println("La matriz no es antisimétrica");
        }
    }
} 
