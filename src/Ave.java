public class Ave extends Animal {
    private String corPena;

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    public String getCorPena() {
        return corPena;
    }

    @Override
    public void locomover() {
       System.out.println("Voandoo...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Cantando.....");
    }

    @Override
    public void alimentar() {
       System.out.println("Comendo oq tem na árvore");
    }
    
}
