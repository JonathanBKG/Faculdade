/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex05_classe_tamagushi;

import java.util.Scanner;

/**
 *
 * @author Jonathan
 */
public class Ex05_Classe_Tamagushi {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("--- Bem-vindo ao Mundo Tamagushi! ---");
        System.out.print("Primeiro, escolha um nome para o seu novo amigo: ");
        String nomeInicial = teclado.nextLine();

        // Começa com 0 anos, fome 7 e saúde 8 (de 10)
        Tamagushi meuBichinho = new Tamagushi(nomeInicial, 7, 8, 0);

        int opcao = -1;

        // Loop principal do jogo, continua enquanto a opção não for 0
        while (opcao != 0) {
            meuBichinho.mostrarStatus();

            // Mostra o menu
            System.out.println("\nO que voce deseja fazer?");
            System.out.println("1 - Alimentar");
            System.out.println("2 - Dar carinho");
            System.out.println("3 - Mudar o nome");
            System.out.println("4 - Deixar o tempo passar (envelhecer 1 ano)");
            System.out.println("0 - Sair do programa");
            System.out.print("Escolha uma opcao: ");

            opcao = teclado.nextInt();
            teclado.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Voce alimentou " + meuBichinho.getNome() + ".");
                    meuBichinho.alimentar(2); // Aumenta a satisfação em 2
                    break;
                case 2:
                    System.out.println("Voce deu carinho para " + meuBichinho.getNome() + ".");
                    meuBichinho.darCarinho(); // Aumenta a saúde em 2
                    break;
                case 3:
                    System.out.print("Digite o novo nome: ");
                    String novoNome = teclado.nextLine();
                    meuBichinho.alterarNome(novoNome);
                    System.out.println("O nome do seu bichinho agora e " + novoNome + "!");
                    break;
                case 4:
                    System.out.println("Um ano se passou...");
                    meuBichinho.envelhecer(1);
                    break;
                case 0:
                    System.out.println("Ate logo! Voce e " + meuBichinho.getNome() + " se despedem.");
                    break;
                default:
                    System.out.println("Opcao invalida! Tente novamente.");
                    break;
            }

            if (opcao != 0) {
                System.out.println("\nPressione Enter para continuar...");
                teclado.nextLine();
            }
        }

        teclado.close();
    }
}
