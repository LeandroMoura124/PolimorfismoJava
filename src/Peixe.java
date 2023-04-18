public class Peixe extends Animal {
    private String corEscama;

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    public String getCorEscama() {
        return corEscama;
    }

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Gluu");
    }

    @Override
    public void alimentar() {
        System.out.println("Comem resto de ao lado de predadores");
    }

    public void fazerBolhas(){
        System.out.println("Fazendo bolhas....");
    }

    
}
