package app;

import bebidaquente.BebidaQuente;
import cafe.Cafe;
import cha.Cha;

public class App {
    public static void main(String[] args) {
        BebidaQuente cafe = new Cafe();
        BebidaQuente cha = new Cha();

        System.out.println("Preparando Café:");
        cafe.prepararReceita();

        System.out.println("\nPreparando Chá:");
        cha.prepararReceita();
    }
}