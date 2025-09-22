/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prova_java_1_q2;
import java.util.Scanner;
/**
 *
 * @author Jonathan
 */
class Tpaciente{
    String nome;
    String DN;
    Double peso;
    Double altura;
    String queixas;
}



public class Prova_Java_1_Q2 {
    static void menu(){
        System.out.println("------------------- Menu -------------------");
        System.out.println("1 - Novo paciente na fila");
        System.out.println("2 - Chama o próximo a ser atendido");
        System.out.println("3 - Listar pacientes aguardando atendimento");
        System.out.println("0 - Sair.");
        System.out.println("---------------------------------------------");
    }
    static int op1_novo_paciente_na_fila(Tpaciente[] paciente, int inicio, int fim){
        int fim_fila = fim;
        Scanner teclado = new Scanner(System.in);
        paciente[fim] = new Tpaciente();
        
        if(paciente.length > fim){
            System.out.println("Digite o nome do paciente:");
            paciente[fim].nome = teclado.nextLine();
            
            System.out.println("Digite a data de nascimento:");
            paciente[fim].DN = teclado.next();
            
            System.out.println("Digite o peso:");
            paciente[fim].peso = teclado.nextDouble();
            teclado.nextLine();
            
            System.out.println("Digite a altura:");
            paciente[fim].altura = teclado.nextDouble();
            teclado.nextLine();
            
            System.out.println("Digite a queixa do paciente:");
            paciente[fim].queixas = teclado.nextLine();
            
            
            fim_fila += 1;
            System.out.println("Paciente cadastrado na fila com sucesso!");
            return fim_fila;
        } else {
            System.out.println("Tamanho máximo da fila atingido!");
        }
        return fim_fila;
    }
static int op2_chamar_prox_fila(Tpaciente[] paciente, int inicio, int fim){
        int prox_fila = inicio;
        paciente[fim] = new Tpaciente();
        
        if (prox_fila <= fim){
            String nome_paciente = paciente[prox_fila].nome;
            System.out.println("Próximo da fila: "+ nome_paciente +"!");
            prox_fila += 1;

            return prox_fila;
        }else {
            System.out.println("Não há ninguém na fila!");
            return prox_fila;
        }
    }
    

static void op3_listar_fila(Tpaciente[] paciente,int inicio, int fim){
    paciente[fim] = new Tpaciente();
    int inicio_fila = inicio;
    int fim_fila    = fim;
    
    int i = inicio_fila;
    int posicao = 1;

    if (inicio_fila <= fim_fila){
        System.out.println("Aguardando atendimento:");
        while  (i < fim_fila){
            System.out.println(+ posicao +") "+ paciente[i].nome);
            i += 1;
            posicao += 1;
        }
    }else {
        System.out.println("Não há ninguém na fila!");
    }
}
        
    
    public static void main(String[] args) {
        int opcao = 999;
        int inicio = 0;
        int fim = 0;
        
        Tpaciente[] paciente = new Tpaciente[100];
        
        do{
            menu();
            System.out.println("Digite a opção desejada: ");
            Scanner teclado = new Scanner(System.in);
            opcao = teclado.nextInt();
            
            if (opcao == 1){
                fim = op1_novo_paciente_na_fila(paciente, inicio, fim);
            }else if(opcao == 2){
                inicio = op2_chamar_prox_fila(paciente, inicio, fim);
            }else if(opcao == 3){
                op3_listar_fila(paciente, inicio, fim);
            }else if (opcao > 3 || opcao < 0){
                System.out.println("Opção inválida, tente novamente!");
            }
        }while (opcao != 0);
        
    }
}
