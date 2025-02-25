import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o salário mensal atual: ");
        double salarioAtual = scanner.nextDouble();

        System.out.print("Digite o percentual de reajuste: ");
        double percentual = scanner.nextDouble();

        // Cálculo do novo salário
        double reajuste = salarioAtual * (percentual / 100);
        double novoSalario = salarioAtual + reajuste;

        // Exibe o resultado
        System.out.printf("O novo salário é: %.2f\n", novoSalario);

        scanner.close();
    }
}
