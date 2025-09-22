/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_fila_memoria_alocada_07_05_2025;
import java.util.Scanner;
/**
 *
 * @author Jonathan
 */

class Tpaciente{
    String nome;
    int idade;
    String cpf;
    String queixa;
    Tpaciente proximo;
}

public class Exercicio_fila_memoria_alocada_07_05_2025 {
    static void menu(){
        System.out.println("=== Clínica Vida+ – Sistema de Gerenciamento de Fila ===");
        System.out.println("1. Adicionar paciente na fila");
        System.out.println("2. Atender próximo paciente");
        System.out.println("3. Exibir informações do paciente da frente");
        System.out.println("4. Exibir toda a fila");
        System.out.println("5. Verificar se fila está vazia");
        System.out.println("0. Sair");
    }

    static Tpaciente op1_add_paciente_fila(Tpaciente inicio){
        Scanner teclado = new Scanner(System.in);
        Tpaciente p     = new Tpaciente();                  //Iniciando variável ctrl + C

        
        System.out.println("Digite o nome do paciente:");   //Pegando os dados do paciente
        p.nome = teclado.nextLine();

        System.out.println("Digite a idade do paciente:");
        p.idade = teclado.nextInt();
        teclado.nextLine();

        System.out.println("Digite o CPF do paciente:");
        p.cpf = teclado.nextLine();

        System.out.println("Digite a queixa do paciente:");
        p.queixa = teclado.nextLine();


        
        if(inicio == null || inicio.nome == null){      //se o paciente for o primeiro da fila:
            inicio = p;
            System.out.println("Paciente adicionado à fila (1 lugar).");
            return inicio;                 //ctrl + v ||   p -> inicio
        }else{                              //se não for, o carrinho irá percorrer até o final da fila.
            Tpaciente carrinho = inicio;
            while(carrinho.proximo != null){
                carrinho = carrinho.proximo;
            }
            carrinho.proximo = p;           //no final da fila, o carrinho irá colocar o paciente no final da fila. || ctrl + v
            System.out.println("Paciente addicionado à fila.");                                      // carrinho.proximo -> p
            return carrinho;
        }
        
    }

    static Tpaciente op2_chamar_prox_fila(Tpaciente inicio){
        Tpaciente carrinho = inicio;

        if(inicio == null || inicio.nome == null){    //se não tiver um nome no 1º da fila, quer dizer que não tem ninguém na fila!
            System.out.println("\nNão há pacientes na fila!");
            return null;
        }else{
            System.out.println("Próximo paciente:");
            System.out.println(carrinho.nome);
            System.out.println(carrinho.idade);
            System.out.println(carrinho.cpf);
            System.out.println(carrinho.queixa);
            
            inicio = carrinho.proximo; //inicio irá ser o próximo da fila.
            return inicio;            
        }
        
    }

    static void op3_mostrar_1o_fila(Tpaciente inicio){
        
        if(inicio == null || inicio.nome == null){
            System.out.println("\nNão há pacientes na fila!");
        }else{
            System.out.println("\nPróximo da fila:\n");
            System.out.println(inicio.nome);
            System.out.println(inicio.idade);
            System.out.println(inicio.cpf);
            System.out.println(inicio.queixa);
        }
    }

    static void op4_exibir_fila(Tpaciente inicio){
        if(inicio == null || inicio.nome == null){
            System.out.println("\nNão há pacientes na fila!\n\n");
        }else{
            System.out.println("Fila para atendimento:\n");
            Tpaciente carrinho = inicio;
            int i = 1;
        
            while(carrinho.proximo != null){
                System.out.println(i +") "+ carrinho.nome);

                carrinho = carrinho.proximo;
               i++;
            }
            System.out.println(i +") "+ carrinho.nome); //printando o último da fila
        }
    }

    static boolean op5_esta_vazia(Tpaciente inicio){
        if(inicio == null || inicio.nome == null){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        int opcao;
        Tpaciente inicio    = new Tpaciente();

        do { 
            menu();
            System.out.println("\nDigite a opcao desejada: ");
            Scanner teclado = new Scanner(System.in);
            opcao = teclado.nextInt();

            if (opcao == 1){
                inicio = op1_add_paciente_fila(inicio);
            }else if (opcao == 2){
                inicio = op2_chamar_prox_fila(inicio);
            }else if (opcao == 3){
                op3_mostrar_1o_fila(inicio);
            }else if (opcao == 4){
                op4_exibir_fila(inicio);
            }else if (opcao == 5){
                boolean fila = op5_esta_vazia(inicio);
                if(fila == true){
                    System.out.println("\nA fila está vazia!\n");
                }else{
                    System.out.println("\nA fila não está vazia!\n");
                }
            }else if (opcao < 0 || opcao > 5) {
                System.out.println("Opção inválida, tente novamente!");
            }

        } while (opcao != 0);

    }
}
