package bebidaquente;

public abstract class BebidaQuente {

    // Template Method
    public final void prepararReceita() {
        ferverAgua();
        adicionarIngredientePrincipal();
        servirNaXicara();
        adicionarCondimentos();
    }

    // Passos concretos
    private void ferverAgua() {
        System.out.println("Fervendo a água...");
    }

    private void servirNaXicara() {
        System.out.println("Servindo na xícara...");
    }

    // Passos abstratos (definidos pelas subclasses)
    protected abstract void adicionarIngredientePrincipal();
    protected abstract void adicionarCondimentos();
}