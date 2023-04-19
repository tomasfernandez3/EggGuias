
package ejercicios_g7.eje2_g7;

/**
 *
 * @author frayeulicesamayacuesta
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Circunferencia Guia =  new Circunferencia (1);
        Guia.crearCircunferencia();
        Guia.area();
        Guia.perimetro();
        
        System.out.println("El area:  " + Guia.area());
        System.out.println("El perimetro es: " + Guia.perimetro());
    }
}
