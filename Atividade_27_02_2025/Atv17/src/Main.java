import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura das notas
        System.out.print("Digite a nota da P1: ");
        double P1 = scanner.nextDouble();

        System.out.print("Digite a nota da E1: ");
        double E1 = scanner.nextDouble();

        System.out.print("Digite a nota da E2: ");
        double E2 = scanner.nextDouble();

        System.out.print("Digite a nota da API: ");
        double API = scanner.nextDouble();

        System.out.print("Digite a nota da avaliação X: ");
        double X = scanner.nextDouble();

        System.out.print("Digite a nota da SUB: ");
        double SUB = scanner.nextDouble();

        // Cálculo da média de LP1
        double parte1 = P1 * 0.6 + ((E1 + E2) / 2) * 0.4;
        double parte2 = Math.max(parte1 - 5.9, 0) / (parte1 - 5.9);
        double mediaLP1 = (parte1 * 0.5) + (parte2 * (API * 0.5)) + X + (SUB * 0.3);

        // Exibição do resultado
        System.out.println("A média final de LP1 do aluno é: " + mediaLP1);

        scanner.close();
    }
}
