import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada das horas de início e fim
        System.out.print("Digite a hora de início do jogo (0-23): ");
        int horaInicio = scanner.nextInt();

        System.out.print("Digite a hora de fim do jogo (0-23): ");
        int horaFim = scanner.nextInt();

        // Cálculo da duração do jogo
        int duracao;
        if (horaFim >= horaInicio) {
            duracao = horaFim - horaInicio;
        } else {
            duracao = (24 - horaInicio) + horaFim;
        }

        // Exibição da duração do jogo
        System.out.println("A duração do jogo foi de " + duracao + " hora(s).");

        scanner.close();
    }
}
