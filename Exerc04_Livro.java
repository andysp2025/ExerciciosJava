public class Exerc04_Livro {
    public static void main(String[] args) {

        Livro livro1 = new Livro("Poesias","Drumond de Andrade",1975);
        Livro livro2 = new Livro("Matematica","Fulano",2005);

        System.out.println("O livro " + livro1.getTitulo() + " foi escrito por " + livro1.getAutor() + " em " +livro1.getAnoPublicacao());
        System.out.println("O livro " + livro2.getTitulo() + " foi escrito por " + livro2.getAutor() + " em " +livro2.getAnoPublicacao());
    }
}
