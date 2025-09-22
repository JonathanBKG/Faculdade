/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_pilha;

import java.util.Scanner;

/**
 *
 * @author Jonathan
 */
public class Exercicio_pilha {

    static void menu(){
        System.out.println("1 - Empilhar nome (push);");
        System.out.println("2 - Mostrar elemento no topo (top);");
        System.out.println("3 - Desempilhar nome (pop);");
        System.out.println("4 - Sair.");
    }

    static int op1_empilhar(String pilha[], String nome, int topo){
        int tamanho = pilha.length;
        if (topo == tamanho -1){
            return -1;
        }
        topo += 1;
        pilha[topo] = nome;
        return topo;
    }

    static boolean op2_mostrar_topo(String pilha[], int topo){
        if (topo <= -1){
            System.out.println("Não há nomes na pilha!");
            return false;
        }
        System.out.println(pilha[topo]);
        return true;
    }

    static int op3_desempilhar(String pilha[], int topo){
        System.out.println("Removendo da pilha o seguinte elemento: "+ pilha[topo]);
        topo = topo - 1;
        return topo;
    }

    public static void main(String[] args) {
        int opcao = 0;
        int topo = -1;
        String pilha[] = new String[8];


        while (opcao != 4){
            menu();
            System.out.println("Digite a opção desejada: ");
            Scanner sc = new Scanner(System.in);
            opcao = sc.nextInt();

            if (opcao == 1){
                System.out.println("Digite um nome: ");
                String nome = sc.next();
                topo = op1_empilhar(pilha, nome, topo);
                System.out.println("Nome adicionado com sucesso!");
            }

            if (opcao == 2){
                op2_mostrar_topo(pilha, topo);
            }

            if (opcao == 3){
                topo = op3_desempilhar(pilha, topo);
            }
        }
    }
}
