package cafe;

import bebidaquente.BebidaQuente;

public class Cafe extends BebidaQuente {
    @Override
    protected void adicionarIngredientePrincipal() {
        System.out.println("Adicionando pó de café...");
    }

    @Override
    protected void adicionarCondimentos() {
        System.out.println("Adicionando açúcar e leite...");
    }
}