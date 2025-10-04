public class Celular {
    private String marca;
    private String numero;

    public Celular(String marca, String numero) {
        this.marca = marca;
//        this.numero = numero; substitui ja construindo com a formatacao
        this.numero = numero.substring(0,4) + "-" + numero.substring(4,8);
    }

    public String getMarca() {
        return marca;
    }

    public String getNumero() {
        return numero;
    }

//    void formataNumero() { - o void não retorna nada apenas faz um processo
//        this.numero = numero.substring(0,4) + "-" + numero.substring(4,8);
//    } ao inves de criar esse metodo - ja coloquei no construtor

}
