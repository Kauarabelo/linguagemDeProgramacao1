import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada das notas
        System.out.print("Digite a nota da 1ª avaliação: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a nota da 2ª avaliação: ");
        double nota2 = scanner.nextDouble();

        // Cálculo da média aritmética
        double media = (nota1 + nota2) / 2;

        // Verificação se o aluno foi aprovado
        if (media >= 6) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno não aprovado!");
        }

        // Exibição da média calculada
        System.out.printf("Média: %.2f\n", media);

        scanner.close();
    }
}
