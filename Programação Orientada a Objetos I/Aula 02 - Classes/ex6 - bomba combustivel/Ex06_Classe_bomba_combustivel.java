/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex06_classe_bomba_combustivel;

import java.util.Scanner;
/**
 *
 * @author Jonathan
 */
public class Ex06_Classe_bomba_combustivel {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        BombaCombustivel bomba = new BombaCombustivel();

        bomba.adicionarTanque(new BombaCombustivel.Tanque("Gasolina Comum", 5.89, 1000.0, "litros"));
        bomba.adicionarTanque(new BombaCombustivel.Tanque("Gasolina Aditivada", 6.09, 800.0, "litros"));
        bomba.adicionarTanque(new BombaCombustivel.Tanque("Etanol", 3.99, 1200.0, "litros"));
        bomba.adicionarTanque(new BombaCombustivel.Tanque("Diesel S10", 6.29, 1500.0, "litros"));
        bomba.adicionarTanque(new BombaCombustivel.Tanque("GNV", 4.99, 500.0, "m³"));

        int opcao = -1;

        while (opcao != 0) {
            BombaCombustivel.Tanque selecionado = bomba.getTanqueSelecionado();

            System.out.println("\n--- BOMBA ATUALMENTE SELECIONADA ---");
            System.out.println("Combustivel: " + selecionado.getTipoCombustivel());
            System.out.printf("Valor: R$ %.2f por %s\n", selecionado.getValorPorUnidade(), selecionado.getUnidadeMedida());
            System.out.printf("Quantidade no Tanque: %.2f %s\n", selecionado.getQuantidade(), selecionado.getUnidadeMedida());
            System.out.println("------------------------------------");

            System.out.println("\nEscolha uma operacao:");
            System.out.println("1 - Abastecer por Valor (R$)");
            System.out.printf("2 - Abastecer por Quantidade (%s)\n", selecionado.getUnidadeMedida());
            System.out.println("3 - Selecionar outro Combustivel");
            System.out.println("4 - Alterar Valor do Combustivel Atual");
            System.out.println("5 - Reabastecer Tanque Atual");
            System.out.println("0 - Sair");
            System.out.print("Opcao: ");

            opcao = teclado.nextInt();
            teclado.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor a ser abastecido (R$): ");
                    double valor = teclado.nextDouble();
                    bomba.abastecerPorValor(valor);
                    break;
                case 2:
                    System.out.printf("Digite a quantidade de %s: ", selecionado.getUnidadeMedida());
                    double quantidade = teclado.nextDouble();
                    bomba.abastecerPorUnidade(quantidade);
                    break;
                case 3:
                    System.out.println("\n--- SELECIONE O COMBUSTIVEL ---");
                    BombaCombustivel.Tanque[] tanques = bomba.getTanques();
                    int totalTanques = bomba.getNumeroDeTanques();
                    for (int i = 0; i < totalTanques; i++) {
                        BombaCombustivel.Tanque t = tanques[i];
                        System.out.printf("%d - %s (R$ %.2f) - Disponivel: %.2f %s\n",
                            (i + 1), t.getTipoCombustivel(), t.getValorPorUnidade(), t.getQuantidade(), t.getUnidadeMedida());
                    }
                    System.out.print("Escolha uma bomba: ");
                    int escolha = teclado.nextInt() - 1; // Subtrai 1 para bater com o índice do vetor
                    bomba.selecionarCombustivel(escolha);
                    break;
                case 4:
                    System.out.print("Digite o novo valor do litro/m³: ");
                    double novoValor = teclado.nextDouble();
                    bomba.alterarValor(novoValor);
                    break;
                case 5:
                    System.out.print("Digite a quantidade para adicionar ao tanque: ");
                    double qtdAdicionar = teclado.nextDouble();
                    bomba.alterarQuantidade(selecionado.getQuantidade() + qtdAdicionar);
                    break;
                case 0:
                    System.out.println("Encerrando o sistema. Ate mais!");
                    break;
                default:
                    System.out.println("Opcao invalida! Tente novamente.");
                    break;
            }
            
            if (opcao != 0) {
                System.out.println("\nPressione Enter para continuar...");
                // Consome a linha pendente dependendo da entrada anterior
                if (opcao == 3 || opcao == 0) {
                     teclado.nextLine();
                } else {
                    // Para opções que leem um double, pode ser necessário consumir duas linhas
                    teclado.nextLine();
                    teclado.nextLine();
                }
            }
        }
        teclado.close();
    }
}
