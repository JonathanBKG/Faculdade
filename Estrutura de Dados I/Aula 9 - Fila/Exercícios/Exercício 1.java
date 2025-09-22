/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.filas;

import java.util.Scanner;

/**
 *
 * @author Jonathan
 */
public class Filas {

    static void menu(){
        System.out.println("1 - Cadastrar nova pessoa na fila");
        System.out.println("2 - Chamar próximo da fila");
        System.out.println("3 - Listar todos que ainda estão aguardando atendimento");
        System.out.println("4 - Sair.");
    }


    static int op1_nova_pessoa_na_fila(String fila[], String nome, int inicio, int fim){
        int fim_fila = fim;

        if(fila.length > fim ){
            fim_fila += 1;
            fila[fim_fila] = nome;
        } else{
            System.out.println("Tamanho máximo da fila atingido!");
        }
        return fim_fila;
    }

    static int op2_chamar_prox_fila(String fila[], int inicio, int fim){
        int prox_fila = inicio;

        if (prox_fila <= fim){
            System.out.println("Próximo da fila: "+ fila[prox_fila] +"!");
            prox_fila += 1;

            return prox_fila;
        }else {
            System.out.println("Não há ninguém na fila!");
            return prox_fila;
        }
    }

    static void op3_listar_fila(String fila[], int inicio, int fim){
        int inicio_fila = inicio;
        int fim_fila = fim;

        int i = inicio_fila;
        int posicao = 1;

        if (inicio_fila <= fim_fila){
            System.out.println("Aguardando atendimento:");
            while  (i <= fim_fila){
                System.out.println(+ posicao +") "+ fila [i]);
                i += 1;
                posicao += 1;
            }
        }else {
            System.out.println("Não há ninguém na fila!");
        }
    }

    public static void main(String[] args) {
        int opcao = 0;
        int inicio = 0;
        int fim = -1;
        String pilha[] = new String[10];

        while (opcao != 4){
            menu();
            System.out.println("Digite a opção desejada: ");
            Scanner teclado = new Scanner(System.in);
            opcao = teclado.nextInt();

            if (opcao == 1){
                System.out.println("Digite o nome da pessoa:");
                String nome = teclado.next();
                fim = op1_nova_pessoa_na_fila(pilha, nome, inicio, fim);
                System.out.println("Pessoa Adicionada a fila com Sucesso!");
            }

            if (opcao == 2){
                inicio = op2_chamar_prox_fila(pilha, inicio, fim);
            }

            if (opcao == 3){
                op3_listar_fila(pilha, inicio, fim);
            }
        }
        System.out.println("Saindo...!");
    }
}


// falta verificar o tamanho da fila na opção 1 "Erro do JAVA, estouro de fila"
// linha 26 do código