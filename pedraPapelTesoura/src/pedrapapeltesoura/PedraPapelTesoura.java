
package pedrapapeltesoura;


import java.util.Scanner;
import java.util.Random;

public class PedraPapelTesoura {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random random = new Random();
        String[] opcoes = {"Pedra", "Papel", "Tesoura"};
        int vitorias = 0;
        int derrotas = 0;
        int escolhaJogador;

        System.out.println("Jogo: Pedra, Papel ou Tesoura");

        while (true) {
            mostrarMenu();
            escolhaJogador = ler.nextInt();
           //placar
            if (escolhaJogador == 0) {
                System.out.println("Obrigado por jogar!");
                System.out.println("Vitórias: " + vitorias + " | Derrotas: " + derrotas);
                break;
            }
          //caso a escolha seja maior que 3 ou menor que 1 (opções inválidas, exceto 0, usado para finalizar o código
            if (escolhaJogador < 1 || escolhaJogador > 3) {
                System.out.println("Opção inválida! Escolha entre 1 e 3 ou 0 para sair.");
                continue;
            }
           //randomizar  escolha do computador
            int escolhaComputador = random.nextInt(3) + 1;

            System.out.println("Você escolheu: " + opcoes[escolhaJogador - 1]);
            System.out.println("Computador escolheu: " + opcoes[escolhaComputador - 1]);

            
           //verificar resultado final com o método criado abaixo
            int resultado = verificarResultado(escolhaJogador, escolhaComputador);
            if (resultado == 1) {
                System.out.println("Resultado: Você ganhou!");
                vitorias++;
            } else if (resultado == -1) {
                System.out.println("Resultado: Você perdeu!");
                derrotas++;
            } else {
                System.out.println("Resultado: Empate!");
            }
        }

        ler.close();
    }
    //método para mostrar menu que aparece a cada jogada
    public static void mostrarMenu() {
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Pedra");
        System.out.println("2 - Papel");
        System.out.println("3 - Tesoura");
        System.out.println("0 - Sair do jogo");
        System.out.print("Sua escolha: ");
    }

    //método para verificar se o jogador ganhou, perdeu ou empatou
    public static int verificarResultado(int jogador, int computador) {
        if (jogador == computador) {
            return 0; // Empate
        } else if ((jogador == 1 && computador == 3) ||
                   (jogador == 2 && computador == 1) ||
                   (jogador == 3 && computador == 2)) {
            return 1; // Vitória
        } else {
            return -1; // Derrota
        }
    }
}