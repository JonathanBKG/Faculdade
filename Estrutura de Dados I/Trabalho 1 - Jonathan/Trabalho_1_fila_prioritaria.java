/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabalho_1_fila_prioritaria;

import java.util.Scanner;
/**
 *
 * @author Jonathan
 */

class Tcliente{
    String nome;
    int idade;
    Tcliente proximo;

}

public class Trabalho_1_fila_prioritaria {

    static void menu(){
        System.out.println("=== IFCBank – Sistema de Gerenciamento de Fila com prioridade ===");
        System.out.println("1. Adicionar cliente prioritário");
        System.out.println("2. Atender próximo cliente prioritário");
        System.out.println("3. Exibir informações do cliente da frente");
        System.out.println("4. Exibir toda a fila");
        System.out.println("5. Verificar se fila está vazia");
        System.out.println("0. Sair");
        System.out.println("Escolha uma opção:");
    }

    static Tcliente op1_add_cliente_fila(Tcliente inicio){
        Scanner teclado = new Scanner(System.in);
        Tcliente novoCliente      = new Tcliente();           //Iniciando variável ctrl + C

        System.out.println("Digite o nome do Cliente:");    //Pegando os dados do Cliente
        novoCliente.nome = teclado.nextLine();

        System.out.println("Digite a idade do Cliente:");
        novoCliente.idade = teclado.nextInt();
        teclado.nextLine();

        if (novoCliente.idade < 60){                          //Se a idade do cliente for menor que 60 anos:
            System.out.println("Erro! Cliente não pode ser adicionado a fila prioritária!");    //Não irá nem inserir na fila e irá parar o código aqui.
            System.out.println("Idade inferior a 60 anos.");
            return inicio;
        }

        if (inicio == null || inicio.nome == null){     //Se o cliente for o primeiro da fila:
            inicio = novoCliente;
            System.out.println("Cliente adicionado à fila (1 lugar).");
            return inicio;                              //ctrl + v || novoCliente -> inicio
        }else{                                          //Se não for, o carrinho irá percorrer até o seu lugar na fila.
            Tcliente carrinho = inicio;                 //cria o carrinho
            if (inicio.idade >= novoCliente.idade){             //se a idade -----------------------
                while (carrinho.idade >= novoCliente.idade){    //while para achar o lugar do NovoCliente
                    if (carrinho.proximo == null){              //se carrinho.proximo for nulo
                        break;                                  //chegou no final da fila (sai do while)
                    }else{                                      //se não for nulo 
                        carrinho = carrinho.proximo;            //vai pro proximo da fila
                    }
                    
                }
                novoCliente.proximo = carrinho.proximo;        //colocando o resto da fila após o novo cliente
                carrinho.proximo = novoCliente;                //Onde o carrinho parou, o próx será o novo cliente.
                
            }else if (inicio.idade < novoCliente.idade){       //Se a idade do novoCliente for maior que o 1º da fila
                novoCliente.proximo = inicio;                  //o próx do novo cliente vai ser o inicio (e o resto da fila)
                inicio = novoCliente;
            }else{
                System.out.println("Erro ao inserir na fila. (Linha 64)");
                return inicio;
            }
            
            System.out.println("Cliente adicionado à fila.");  
            return inicio;                               //retorna o inicio que mostra o começo da fila
        }
    }

    static Tcliente op2_atender_prox_fila(Tcliente inicio){
        Tcliente carrinho = inicio;

        if (inicio == null || inicio.nome == null){               //Se não tiver ninguém na fila
            System.out.println("\nNão há clientes na fila!");   //irá retornar nulo e mostrará essa mensagem:
            return null;
        }else{                                                    //Se ouver cliente na fila
            System.out.println("Próximo cliente:");             //irá mostrar o 1º cliente da fila
            System.out.println(carrinho.nome);
            System.out.println(carrinho.idade);
                                                                  //E o começo da fila agora será o inicio.proximo
            inicio = carrinho.proximo;                            //ou carrinho.proximo, que é a mesma coisa, porem é melhor para visualizar
            return inicio;                                        //e retorna o inicio para atualizar a fila.      
        }
    }

    static void op3_mostrar_1o_fila(Tcliente inicio){
        if(inicio == null || inicio.nome == null){              //Se o inicio estiver nulo, não tem ninguem na fila.
            System.out.println("\nNão há clientes na fila!");
        }else{
            System.out.println("Próximo:");
            System.out.println(inicio.nome);
            System.out.println(inicio.idade);
        }
    }

    static void op4_mostrar_fila(Tcliente inicio){
        if(inicio == null || inicio.nome == null){
            System.out.println("\nNão há clientes na fila!");
        }else{
            System.out.println("Fila para atendimento:\n");
            Tcliente carrinho = inicio;
            int i = 1;

            while(carrinho.proximo != null){
                System.out.println(i +") "+ carrinho.nome);

                carrinho = carrinho.proximo;
                i++;
            }
            System.out.println(i +") "+ carrinho.nome);
        }
    }

    static boolean op5_esta_vazia(Tcliente inicio){
        if(inicio == null || inicio.nome == null){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        int opcao = -1;
        Tcliente inicio = new Tcliente();
        Scanner teclado = new Scanner(System.in);

        do { 
            menu();
            System.out.println("\nDigite a opcao desejada: ");
            
            if (teclado.hasNextInt()) {
                opcao = teclado.nextInt();
                teclado.nextLine();

                if (opcao == 1){
                    inicio = op1_add_cliente_fila(inicio);
                }else if(opcao == 2){
                    inicio = op2_atender_prox_fila(inicio);
                }else if(opcao == 3){
                    op3_mostrar_1o_fila(inicio);
                }else if (opcao == 4){
                    op4_mostrar_fila(inicio);
                }else if (opcao == 5){
                    boolean fila = op5_esta_vazia(inicio);
                    if(fila == true){
                        System.out.println("\nA fila está vazia!\n");
                    }else{
                        System.out.println("\nA fila não está vazia!\n");
                    }
                }else if (opcao == 0){
                    System.out.println("Saindo do sistema...");
                }else if (opcao < 0 || opcao > 5){
                    System.out.println("Opção inválida, tente novamente!");
                }
            }else{
                System.out.println("Entrada inválida! Digite um número entre 0 e 5."); 
                teclado.next(); // descarta a entrada inválida
            }
        } while (opcao != 0);
        teclado.close();
    }
}
