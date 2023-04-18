public class Mamifero extends Animal {
    protected String corPelo;

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    public String getCorPelo() {
        return corPelo;
    }

    @Override
    public void locomover() {
        System.out.println("Se movimentando...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de mamifero");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }


}
