/*
Desarrollar una clase Cancion con los siguientes atributos: título y autor.
Se deberá definir además dos constructores: uno vacío que inicializa el título y el autor
a cadenas vacías y otro que reciba como parámetros el título y el autor de la canción. Se
deberán además definir los métodos getters y setters correspondientes.
*/
package com.mycompany.eje1extra_g7;

import java.util.Scanner;

public class Cancion {
     Scanner leer = new Scanner(System.in);
    public String titulo;
    public String autor;

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Cancion() {
    }
    
    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    
    public void caciones(String titulo, String autor) {
        System.out.println("Ingrese el titulo de la cancion: ");
        titulo = leer.nextLine();
        System.out.println("Ingrese el autor: ");
        autor = leer.nextLine();
        System.out.println("La cancion ingresada es: "+ titulo +" "+ "y su autor es: "+ autor);
    }

    @Override
    public String toString() {
        return "Cancion{titulo: " + titulo + "y el autor: " + autor + '}';
    }
     
}
