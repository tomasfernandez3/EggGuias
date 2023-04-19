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

public class Eje4_G7 {

    public static void main(String[] args) {
    
        Scanner leer = new Scanner(System.in);
        Rectangulo calculo = new Rectangulo();
        
        calculo.CrearOperaciones();
        calculo.CalcularPerimetro();
        System.out.println("El perimetro es: " + calculo.CalcularPerimetro());
        calculo.CalcularSuperficie();
        System.out.println("La superficie es: "+ calculo.CalcularSuperficie());
        System.out.println("El Rectangulo impreso es ...");
        calculo.dibujarRectangulo();
     }
}
