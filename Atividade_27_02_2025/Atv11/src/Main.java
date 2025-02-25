import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do ano atual e do ano de nascimento
        System.out.print("Digite o ano atual: ");
        int anoAtual = scanner.nextInt();

        System.out.print("Digite o seu ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        // Cálculo da idade
        int idade = anoAtual - anoNascimento;

        // Verificação se a pessoa pode votar
        if (idade >= 18) {
            System.out.println("Você pode votar este ano!");
        } else {
            System.out.println("Você não pode votar este ano.");
        }

        scanner.close();
    }
}
