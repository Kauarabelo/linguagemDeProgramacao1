import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o número total de eleitores: ");
        int totalEleitores = scanner.nextInt();

        System.out.print("Digite o número de votos brancos: ");
        int votosBrancos = scanner.nextInt();

        System.out.print("Digite o número de votos nulos: ");
        int votosNulos = scanner.nextInt();

        System.out.print("Digite o número de votos válidos: ");
        int votosValidos = scanner.nextInt();

        // Verificação se a soma dos votos corresponde ao total de eleitores
        int somaVotos = votosBrancos + votosNulos + votosValidos;

        if (somaVotos > totalEleitores) {
            System.out.println("Erro: A soma dos votos excede o total de eleitores.");
        } else {
            // Cálculo dos percentuais
            double percBrancos = (votosBrancos * 100.0) / totalEleitores;
            double percNulos = (votosNulos * 100.0) / totalEleitores;
            double percValidos = (votosValidos * 100.0) / totalEleitores;

            // Exibição dos resultados formatados
            System.out.println("\nPercentuais de votos:");
            System.out.printf("Votos Brancos: %.2f%%\n", percBrancos);
            System.out.printf("Votos Nulos: %.2f%%\n", percNulos);
            System.out.printf("Votos Válidos: %.2f%%\n", percValidos);
        }

        scanner.close();
    }
}
