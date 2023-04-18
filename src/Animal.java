public abstract class Animal{ //nao sera instanciada
    protected Float peso;
    protected int Idade;
    protected int membros;

    public void setPeso(Float peso) {
        this.peso = peso;
    }
    public Float getPeso() {
        return peso;
    }
    public void setIdade(int Idade){
        this.Idade = Idade;
    }
    public int getIdade(){
        return this.Idade;
    }

    public void setMembros(int membros){
        this.membros = membros;
    }
    public int getMembros(){
        return this.membros;
    }


    //metodos serao definidos na classe filha (subclasses de animal)
    public abstract void locomover();
    public abstract void emitirSom();
    public abstract void alimentar();



}