/*
Desarrollar una clase Cancion con los siguientes atributos: título y autor.
Se deberá definir además dos constructores: uno vacío que inicializa el título y el autor
a cadenas vacías y otro que reciba como parámetros el título y el autor de la canción. Se
deberán además definir los métodos getters y setters correspondientes.
*/
package com.mycompany.eje1extra_g7;

import java.util.Scanner;

public class Eje1Extra_G7 {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        Cancion c1= new Cancion();
        String titulo = null, autor = null;
        c1.caciones(titulo, autor);
        
    }
}
