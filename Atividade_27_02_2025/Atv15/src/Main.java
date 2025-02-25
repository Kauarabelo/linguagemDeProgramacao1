import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do número de horas trabalhadas no mês e do salário por hora
        System.out.print("Digite o número de horas trabalhadas no mês: ");
        int horasTrabalhadasMes = scanner.nextInt();

        System.out.print("Digite o valor do salário por hora: ");
        double salarioPorHora = scanner.nextDouble();

        // Número de horas semanais e total de horas trabalhadas no mês
        int horasSemana = 40;
        int horasTotaisMes = horasSemana * 4;

        // Calcular as horas extras, se houverem
        int horasExtras = 0;
        if (horasTrabalhadasMes > horasTotaisMes) {
            horasExtras = horasTrabalhadasMes - horasTotaisMes;
        }

        // Calcular o salário total
        double salarioBase = horasTotaisMes * salarioPorHora;
        double salarioExtra = horasExtras * salarioPorHora * 1.5;
        double salarioTotal = salarioBase + salarioExtra;

        // Exibir o salário total
        System.out.printf("O salário total do funcionário, incluindo horas extras, é: R$ %.2f\n", salarioTotal);

        scanner.close();
    }
}
