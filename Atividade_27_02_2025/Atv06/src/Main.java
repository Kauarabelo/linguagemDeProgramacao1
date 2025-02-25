import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite a temperatura em graus Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        // Cálculo da conversão
        double celsius = (5.0 / 9.0) * (fahrenheit - 32);

        // Exibição do resultado formatado
        System.out.printf("A temperatura em graus Celsius é: %.2f°C\n", celsius);

        scanner.close();
    }
}
