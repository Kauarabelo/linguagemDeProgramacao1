import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite a idade em anos: ");
        int anos = scanner.nextInt();

        System.out.print("Digite a idade em meses: ");
        int meses = scanner.nextInt();

        System.out.print("Digite a idade em dias: ");
        int dias = scanner.nextInt();

        // Cálculo da idade total em dias
        int idadeEmDias = (anos * 365) + (meses * 30) + dias;

        // Exibe o resultado
        System.out.println("A idade expressa em dias é: " + idadeEmDias);

        scanner.close();
    }
}
