/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado base y 
un atributo privado altura. La clase incluirá un método para crear el rectángulo con los datos 
del Rectángulo dados por el usuario. También incluirá un método para calcular la superficie del 
rectángulo y un método para calcular el perímetro del rectángulo. Por último, tendremos un 
método que dibujará el rectángulo mediante asteriscos usando la base y la altura. Se deberán 
además definir los métodos getters, setters y constructores correspondientes.

Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package ejercicios_g7.eje4_g7;

import java.util.Scanner;

public class Rectangulo {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public Rectangulo(){
    }
    
    public void setBase(double base) {
        this.base = base;
    }
    
    public double getBase() {
        return this.base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public void CrearOperaciones(){
        System.out.println("Ingrese la base: ");
        base = leer.nextInt();
        System.out.println("Ingrese la altura: ");
        altura = leer.nextInt();
    }
    
    public double CalcularSuperficie(){
        return this.base * this.altura;
    }
    
    public double CalcularPerimetro() {
        return this.base + this.altura * 2;
    }
    
    public void dibujarRectangulo() {
        for (int i = 0; i < this.altura; i++) {
            for (int j = 0; j < this.base; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
