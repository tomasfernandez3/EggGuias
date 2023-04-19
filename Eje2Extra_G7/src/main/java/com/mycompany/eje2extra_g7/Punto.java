/*
Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos,
sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en los 
atributos del objeto. Después, a través de otro método calcular y devolver la distancia que
existe entre los dos puntos que existen en la clase Puntos.
*/
package com.mycompany.eje2extra_g7;

import java.util.Scanner;

public class Punto {
    Scanner sc=new Scanner(System.in);
    public int x;
    public int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public int crearPuntos(int x, int y){
        System.out.println("Indique el Punto X: ");
       x = sc.nextInt();
        System.out.println("Indiquie el punto Y: ");
       y= sc.nextInt();
        int x1;
       return x1 = x;
    }
    
}
