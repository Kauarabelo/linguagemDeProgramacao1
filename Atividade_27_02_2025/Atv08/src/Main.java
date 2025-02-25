import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do valor
        System.out.print("Digite um valor: ");
        double valor = scanner.nextDouble();

        // Verificação se é positivo ou negativo
        if (valor >= 0) {
            System.out.println("O valor é POSITIVO.");
        } else {
            System.out.println("O valor é NEGATIVO.");
        }

        scanner.close();
    }
}
