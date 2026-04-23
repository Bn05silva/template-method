package cha;

import bebidaquente.BebidaQuente;

public class Cha extends BebidaQuente {
    @Override
    protected void adicionarIngredientePrincipal() {
        System.out.println("Colocando saquinho de chá...");
    }

    @Override
    protected void adicionarCondimentos() {
        System.out.println("Adicionando limão e mel...");
    }
}
