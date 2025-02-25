import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o salário fixo do vendedor: ");
        double salarioFixo = scanner.nextDouble();

        System.out.print("Digite o número de carros vendidos: ");
        int carrosVendidos = scanner.nextInt();

        System.out.print("Digite o valor recebido por carro vendido: ");
        double comissaoPorCarro = scanner.nextDouble();

        System.out.print("Digite o valor total das vendas do vendedor: ");
        double valorTotalVendas = scanner.nextDouble();

        // Cálculo do salário final
        double comissaoTotal = carrosVendidos * comissaoPorCarro;
        double bonusSobreVendas = valorTotalVendas * 0.05;
        double salarioFinal = salarioFixo + comissaoTotal + bonusSobreVendas;

        // Exibição do resultado formatado
        System.out.printf("O salário final do vendedor é: R$ %.2f\n", salarioFinal);

        scanner.close();
    }
}
