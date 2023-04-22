package guia7.eje4extra_g7;

import java.util.Scanner;

public class Cuenta {
    Scanner leer = new Scanner(System.in);
    public double saldo;
    public String titular;

    public Cuenta() {
    }

    public Cuenta(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public void retirarDinero() {

        saldo = 10000;
        double retira;
        System.out.println("saldo inicial " + saldo);
        do {
            System.out.println("monto a retirar");
            retira = leer.nextDouble();
            saldo -= retira;
            if (saldo < retira) {
                System.out.println("saldo insuficiente");
                System.out.println("ingrese un monto menor");
                retira = leer.nextDouble();
            }
            System.out.println("saldo disponible " + saldo);
        } while (saldo > 0);

    }
}
