public class Main {
    public static void main(String[] args) {
        // Valores dos gastos mensais
        double janeiro = 15000;
        double fevereiro = 23000;
        double marco = 17000;

        // Cálculo da despesa total e média mensal
        double despesaTotal = janeiro + fevereiro + marco;
        double mediaMensal = despesaTotal / 3;

        // Exibição dos resultados
        System.out.println("Despesa total no primeiro trimestre: R$ " + despesaTotal);
        System.out.println("Média mensal de gastos: R$ " + mediaMensal);
    }
}
