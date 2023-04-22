/*
Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos
jugadores jugar un juego de adivinanza de números. El primer jugador elige un número y
el segundo jugador intenta adivinarlo. El segundo jugador tiene un número limitado de 
intentos y recibe una pista de "más alto" o "más bajo" después de cada intento. El juego 
termina cuando el segundo jugador adivina el número o se queda sin intentos. Registra el 
número de intentos necesarios para adivinar el número y el número de veces que cada jugador
ha ganado
*/
package Guia7;

import java.util.Scanner;

public class Juego {
    Scanner sc=new Scanner(System.in);
    public String jugador1;
    public String jugador2;
    public int num1;

    public Juego() {
    }

    public Juego(String jugador1, String jugador2, int num1) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.num1 = num1;
    }

    public void IniciarJuego() {
        int numero;
        int intentos = 2;
        int victoria1 = 0;
        int victoria2 = 0;
            System.out.println("Ingrese el nombre del jugador 1;");
            jugador1= sc.nextLine();
            System.out.println("Ingrese el nombre del jugador 2;");
            jugador2= sc.nextLine();
            System.out.println("Jugador 1: "+ jugador1 + " Elija un numero");
            num1 = sc.nextInt();
            System.out.println("Jugador 2: "+ jugador2 + " adivine el numero ");
            numero = sc.nextInt();
        while (intentos > 0){
            if (num1 == numero){
                System.out.println("Genial adivinaste, Felicidades!!");
                victoria2 += 1;
                break;
            }
            
            else if (numero > num1 ) {
                        System.out.println("Pista: el numero es menor!");
                        intentos--;
                        numero=sc.nextInt();
                        System.out.println("Le quedan: "+ intentos+ " Intentos");
                        }
            else {
                System.out.println("Pista:  el numero es mayor! ");
                intentos--;
                numero=sc.nextInt();
                System.out.println("Le quedan: "+ intentos+ " Intentos");
            }
            if (intentos==0){
                System.out.println("Victoria del jugador 1: "+ (victoria1+1));
                System.out.println("Victoria del jugadro 2: "+ victoria2 + "intentos "+" y "+ intentos);
                
            }
            }
    } 
 
   
    public void setJugador1(String jugador1) {
        this.jugador1 = jugador1;
    }

    public void setJugador2(String jugador2) {
        this.jugador2 = jugador2;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public String getJugador1() {
        return jugador1;
    }

    public String getJugador2() {
        return jugador2;
    }

    public int getNum1() {
        return num1;
    }
    
    
}
