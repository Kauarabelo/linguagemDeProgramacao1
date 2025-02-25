import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada dos dois valores
        System.out.print("Digite o primeiro valor: ");
        int valor1 = scanner.nextInt();

        System.out.print("Digite o segundo valor: ");
        int valor2 = scanner.nextInt();

        // Exibição dos valores em ordem crescente
        if (valor1 < valor2) {
            System.out.println("Ordem crescente: " + valor1 + " " + valor2);
        } else {
            System.out.println("Ordem crescente: " + valor2 + " " + valor1);
        }

        scanner.close();
    }
}
