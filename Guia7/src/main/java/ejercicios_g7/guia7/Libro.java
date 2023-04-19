/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_g7.guia7;

import java.util.Scanner;

/**
 *
 * @author Chiva
 */
public class Libro {
    public int ISBN;
    public String Titulo;
    public String Autor;
    public int Paginas;
    //Scanner leer = new Scanner(System.in);
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Libro() {
    }

    public Libro(int ISBN, String Titulo, String Autor, int Paginas) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Paginas = Paginas;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getPaginas() {
        return Paginas;
    }

    public void setPaginas(int Paginas) {
        this.Paginas = Paginas;
    }
    
    public void cargarLibro(){
        System.out.println("Ingrese el numero de ISBN:");
        ISBN = leer.nextInt();
        System.out.println("Ingrese el Titulo del libro:");
        Titulo = leer.next();
        //leer.next();
        System.out.println("Ingrese el Autor:");
        Autor = leer.next();
        System.out.println("Ingrese la cantidad de Paginas:");
        Paginas = leer.nextInt();
        
    }
    public void mostrarLibro() {

        System.out.println("\n Libro:"
                + "\n ISBN:" + ISBN 
                + "\n Titulo: " + Titulo  
                + "\n Autor: " + Autor 
                + "\n Paginas: " + Paginas);

    }
}
