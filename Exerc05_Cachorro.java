public class Exerc05_Cachorro {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro("Rex","Labrador");
        Cachorro cachorro2 = new Cachorro("Toddy","Poodle");

        System.out.println("O cachorro " + cachorro1.getNome() + " é da raça " + cachorro1.getRaca());
        System.out.println("O cachorro " + cachorro2.getNome() + " é da raça " + cachorro2.getRaca());

    }
}
