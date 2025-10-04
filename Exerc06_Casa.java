public class Exerc06_Casa {
    public static void main(String[] args) {
        Casa casa1 = new Casa("azul",123);
        Casa casa2 = new Casa("verde",45);

        System.out.println("Casa " + casa1.getCor() + " número " + casa1.getNumero());
        System.out.println("Casa " + casa2.getCor() + " número " + casa2.getNumero());
    }
}
