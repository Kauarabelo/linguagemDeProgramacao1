import org.example.*;

import java.util.Scanner;

public class TestaClasse {
    public static void main(String[] args) {
        // Instanciando objetos
        Crianca crianca = new Crianca();
        Flor flor = new Flor();
        Caderno caderno = new Caderno();
        Chapeu chapeu = new Chapeu();
        XicaraCha xicara = new XicaraCha();
        UtensilioCozinha utensilio = new UtensilioCozinha();
        FerramentaJardinagem ferramenta = new FerramentaJardinagem();
        InstrumentoMusical instrumento = new InstrumentoMusical();
        Caneta caneta = new Caneta();
        Livro livro = new Livro();
        Fracao fracao1 = new Fracao(3, 4);
        Fracao fracao2 = new Fracao(1, 2);

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== MENU DE TESTES ===");
            System.out.println("1. Testar Classe Criança");
            System.out.println("2. Testar Classe Flor");
            System.out.println("3. Testar Classe Caderno");
            System.out.println("4. Testar Classe Chapéu");
            System.out.println("5. Testar Xícara de Chá");
            System.out.println("6. Testar Utensílio Cozinha");
            System.out.println("7. Testar Ferramenta Jardinagem");
            System.out.println("8. Testar Instrumento Musical");
            System.out.println("9. Testar Caneta");
            System.out.println("10. Testar Livro");
            System.out.println("11. Testar Classe Fração");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch(opcao) {
                case 1:
                    System.out.println("\nTestando Criança:");
                    crianca.brincar();
                    crianca.comer();
                    break;

                case 2:
                    System.out.println("\nTestando Flor:");
                    flor.florescer();
                    flor.crescer();
                    break;

                case 3:
                    System.out.println("\nTestando Caderno:");
                    caderno.folhas();
                    caderno.lido();
                    break;

                case 4:
                    System.out.println("\nTestando Chapéu:");
                    chapeu.vestir();
                    chapeu.ajustar();
                    break;

                case 5:
                    System.out.println("\nTestando Xícara:");
                    xicara.encher();
                    xicara.beber();
                    break;

                case 6:
                    System.out.println("\nTestando Utensílio:");
                    utensilio.usar();
                    utensilio.limpar();
                    break;

                case 7:
                    System.out.println("\nTestando Ferramenta:");
                    ferramenta.cavar();
                    ferramenta.podar();
                    break;

                case 8:
                    System.out.println("\nTestando Instrumento:");
                    instrumento.tocar();
                    instrumento.afinar();
                    break;

                case 9:
                    System.out.println("\nTestando Caneta:");
                    caneta.escrever();
                    caneta.tampar();
                    break;

                case 10:
                    System.out.println("\nTestando Livro:");
                    livro.abrir();
                    livro.folhear();
                    break;

                case 11:
                    System.out.println("\nTestando Frações:");
                    Fracao soma = fracao1.somar(fracao2);
                    Fracao produto = fracao1.multiplicar(fracao2);

                    System.out.println("3/4 + 1/2 = " + soma);
                    System.out.println("3/4 * 1/2 = " + produto);
                    break;

                case 0:
                    System.out.println("Encerrando programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while(opcao != 0);

        scanner.close();
    }
}