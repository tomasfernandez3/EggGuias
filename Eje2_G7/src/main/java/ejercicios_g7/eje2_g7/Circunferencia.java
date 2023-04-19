
package ejercicios_g7.eje2_g7;

import java.util.Scanner;

public class Circunferencia {
    Scanner leer = new Scanner(System.in);
    
    private double radio;
    
    public Circunferencia (double radio){
     this.radio = radio; // numeral A
     
        
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
        // numeral B
    }
    
    public void crearCircunferencia(){
        System.out.println("Ingrese el radio");
        this.radio=leer.nextDouble();
        // numeral C
    }
    
    public double area(){
        double area;
        
        area = Math.PI*(Math.pow(this.radio,2));
        return area;
        //  numeral D
    }
    
    public double perimetro(){
        double perimetro;
        
        perimetro = Math.PI*2*this.radio;
        return perimetro;
        // numeral E
    }
}
