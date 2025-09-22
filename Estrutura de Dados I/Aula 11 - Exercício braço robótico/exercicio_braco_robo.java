/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_pilha_30_04_2025;

import java.util.Scanner;
/**
 *
 * @author Jonathan
 */
class Troupa{
    String cor;
    String tipo;
    String modelo;
    int altura_dobrado;
    Troupa proximo;

}
public class Exercicio_pilha_30_04_2025 {

    static void menu(){
        System.out.println("------------------- Menu -------------------");
        System.out.println("1 - Empilhar roupa");
        System.out.println("2 - Desempilhar roupa");
        System.out.println("3 - Mostrar roupa no topo");
        System.out.println("4 - Mostrar tamanho da pilha (cm)");
        System.out.println("5 - Verificar se a pilha esta cheia");
        System.out.println("6 - Mostrar todas as roupas da pilha");
        System.out.println("0 - Sair.");
        System.out.println("--------------------------------------------");
    }

    static Troupa op1_empilhar(Troupa topo) {
        Scanner teclado = new Scanner(System.in);
        Troupa nova = new Troupa();
    
        System.out.println("Digite a cor da roupa: ");
        nova.cor = teclado.nextLine();
    
        System.out.println("Digite o tipo da roupa: ");
        nova.tipo = teclado.nextLine();
    
        System.out.println("Digite o modelo da roupa: ");
        nova.modelo = teclado.nextLine();
    
        System.out.println("Digite a altura da roupa DOBRADA:");
        nova.altura_dobrado = teclado.nextInt();
        teclado.nextLine();
    
        // Verifica se a pilha ficará maior que 72cm
        if (somaAlturas(topo) + nova.altura_dobrado > 72) {
            System.out.println("Erro! Pilha atingiu limite de altura!");
            return topo;
        }
    
        nova.proximo = topo;
        System.out.println("Roupa empilhada com sucesso!");
        return nova; // novo topo
    }

    static int somaAlturas(Troupa topo) {
        int total = 0;
        while (topo != null) {
            total += topo.altura_dobrado;
            topo = topo.proximo;
        }
        return total;
    }
    
    static Troupa op2_desempilhar(Troupa topo){
        if (topo == null) {
            System.out.println("A pilha já está vazia!");
            return null;
        }

        System.out.println("Roupa removida do topo:");
        System.out.println("Cor: " + topo.cor);
        System.out.println("Tipo: " + topo.tipo);
        System.out.println("Modelo: " + topo.modelo);
        System.out.println("Altura dobrada: " + topo.altura_dobrado + "cm");

        return topo.proximo;
    }

    static void op3_mostrar_topo(Troupa topo){
        if (topo == null){
            System.out.println("A pilha está vazia!");
        }else{
            System.out.println("Roupa que está no topo:");
            System.out.println("Cor: "+ topo.cor);
            System.out.println("Tipo: "+ topo.tipo);
            System.out.println("Modelo: "+ topo.modelo);
            System.out.println("Altura dobrada: "+ topo.altura_dobrado +"cm");
        }

    }

    static void op4_mostrar_tamanho(Troupa topo){
        System.out.println("O tamanho da pilha é:");
        System.out.println(somaAlturas(topo)+"cm");
    }

    static void op5_verif_se_cheia(Troupa topo){
        int total = somaAlturas(topo);
        System.out.println("O tamanho da pilha é:");
        System.out.println(total +"cm");

        if (total < 72){
            System.out.println("A pilha ainda não está cheia!");
        }else if (total >= 72){
            System.out.println("A pilha está cheia!");
        }
    }

    static void op6_mostrar_roupas(Troupa topo){
        Troupa pilha;
        pilha = topo;
        int i = 1;

        while(pilha != null){
            System.out.println("Roupa - "+ i +":");
            System.out.println("Cor: "+ pilha.cor);
            System.out.println("Tipo: "+ pilha.tipo);
            System.out.println("Modelo: "+ pilha.modelo);
            System.out.println("Altura dobrada: "+ pilha.altura_dobrado +"cm\n");
            pilha = pilha.proximo;

            i++;
        }
    }


    public static void main(String[] args) {
        int opcao = 999;
        Troupa topo = null;

        do { 
            menu();
            System.out.println("Digite a opção desejada: ");
            Scanner teclado = new Scanner(System.in);
            opcao = teclado.nextInt();

            if (opcao == 1){
                topo = op1_empilhar(topo);
            }else if (opcao == 2){
                topo = op2_desempilhar(topo);
            }else if(opcao == 3){
                op3_mostrar_topo(topo);
            }else if(opcao == 4){
                op4_mostrar_tamanho(topo);
            }else if(opcao == 5){
                op5_verif_se_cheia(topo);
            }else if(opcao == 6){
                op6_mostrar_roupas(topo);
            }else if (opcao > 6 || opcao < 0){
                System.out.println("Opção inválida, tente novamente!\n");
            }
        } while (opcao != 0);
    }
}
