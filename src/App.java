public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");


        //Mamifero
        Mamifero m = new Mamifero();
        m.setCorPelo("Marrom");
        m.setIdade(18);
        m.setMembros(4);
        m.alimentar();
        m.locomover();

        //Reptil
        Reptil r = new Reptil();
        r.alimentar();
        r.locomover();

        //Ave
        Ave a = new Ave();
        a.locomover();
        a.alimentar();

        //Canguru

        Canguru c = new Canguru();
        c.locomover();
        c.alimentar();
        c.usarBolsa();

        Cachorro k = new Cachorro();
        k.locomover();
        k.alimentar();
        k.abanarRabinho();
        k.enterrarOsso();
    }
}
