import java.util.Scanner;

public class Exerc01_Carro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Carro carro1 = new Carro("", "", 0);
        Carro carro2 = new Carro("", "", 0);

        System.out.println("EXERCICIO 1 **************** ");
        System.out.println("Digite a marca do carro 1: ");
        carro1.setMarca(scanner.nextLine());
        System.out.println("Digite a modelo do carro 1: ");
        carro1.setModelo(scanner.nextLine());
        System.out.println("Digite a ano do carro 1: " );
        carro1.setAno(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Digite a marca do carro 2:");
        carro2.setMarca(scanner.nextLine());
        System.out.println("Digite a modelo do carro 2:");
        carro2.setModelo(scanner.nextLine());
        System.out.println("Digite a ano do carro 2:");
        carro2.setAno(scanner.nextInt());
        scanner.close();

      System.out.println("Carro 1 - Marca: " + carro1.getMarca() + " - Modelo: " + carro1.getModelo() + " - Ano: " + carro1.getAno());
      System.out.println("Carro 2 - Marca: " + carro2.getMarca() + " - Modelo: " + carro2.getModelo() + " - Ano: " + carro2.getAno());
    }
}
