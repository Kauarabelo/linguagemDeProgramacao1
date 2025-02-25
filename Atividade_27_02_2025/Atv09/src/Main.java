import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada da quantidade de maçãs compradas
        System.out.print("Digite a quantidade de maçãs compradas: ");
        int quantidade = scanner.nextInt();

        // Definição do preço por maçã com base na quantidade
        double precoPorMaca = (quantidade < 12) ? 1.30 : 1.00;

        // Cálculo do custo total
        double custoTotal = quantidade * precoPorMaca;

        // Exibição do resultado formatado
        System.out.printf("O custo total da compra é: R$ %.2f\n", custoTotal);

        scanner.close();
    }
}
