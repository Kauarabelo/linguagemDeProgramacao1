import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do custo de fábrica
        System.out.print("Digite o custo de fábrica do carro: ");
        double custoFabrica = scanner.nextDouble();

        // Definição das porcentagens
        double percentualDistribuidor = 0.28;
        double percentualImpostos = 0.45;

        // Cálculo do custo final ao consumidor
        double custoFinal = custoFabrica * (1 + percentualDistribuidor + percentualImpostos);

        // Exibição do resultado formatado
        System.out.printf("O custo final ao consumidor é: R$ %.2f\n", custoFinal);

        scanner.close();
    }
}
