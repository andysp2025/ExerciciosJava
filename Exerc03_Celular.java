public class Exerc03_Celular {
    public static void main(String[] args) {

        Celular celular1 = new Celular("Samsung", "12345678");
        Celular celular2 = new Celular("Nokia", "87654321");

//        celular1.formataNumero();
//        celular2.formataNumero(); substitui pela formatação já no construtor

        System.out.println("Celular da " + celular1.getMarca() + " com número " + celular1.getNumero());
        System.out.println("Celular da " + celular2.getMarca() + " com número " + celular2.getNumero());
    }
}
