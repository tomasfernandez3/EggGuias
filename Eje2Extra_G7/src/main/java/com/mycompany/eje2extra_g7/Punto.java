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
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    
    public Punto() {
    } 
    public void creapuntos(){
        System.out.println("Indique el Punto X1: ");
        x1 = sc.nextInt();
        System.out.println("Indiquie el punto Y1: ");
        y1 = sc.nextInt();
        System.out.println("Indique el Punto X2: ");
        x2 = sc.nextInt();
        System.out.println("Indiquie el punto Y2: ");
        y2 = sc.nextInt();
    }
    public int calcularDistancia() {
        
        int distancia = (int) Math.sqrt(Math.pow(x1, y2)+ Math.pow(x2, y2));
        
        return distancia;
        
    }
}
/*
public double calcularDistancia() {
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return distancia;
    }
*/