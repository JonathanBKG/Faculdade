/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Jonathan
 */



class Tcliente{
    int     matricula;
    String  nome;
    String  CPF;
    String  endereco;
    String  telefone;
}

public class Exercicio_3_TAD {
    static void menu(){
        System.out.println("Menu:");
        System.out.println("1 - Cadastrar cliente (CPF, nome, endereço e telefone)");
        System.out.println("2 - Apresentar listagem de todos os clientes");
        System.out.println("3 - Procurar clientes pelo nome e apresentar seus dados");
        System.out.println("4 - Apresentar clientes com telefone no código de área 47");
        System.out.println("0 - Sair");
    }   


    static int op1_cadastro_cliente(int totalClientes){
        Scanner teclado  = new Scanner(System.in);
        Boolean repetir  =  true;
        Boolean repetir2 =  true;

        Tcliente cliente = new Tcliente(); // cria um novo cliente no TAD

        System.out.println("Digite o nome do Cliente:");
        cliente.nome = teclado.nextLine();

        while(repetir){
            System.out.println("Digite o CPF:");
            String cpf_n_formatado = teclado.next();
            teclado.nextLine();

            if (!cpf_n_formatado.matches("\\d{11}")){
                System.out.println("CPF inválido, Tente novamente.");
                continue;
            }

            StringBuilder cpf_montado = new StringBuilder();

            for(int i = 0; i < cpf_n_formatado.length(); i++){
                cpf_montado.append(cpf_n_formatado.charAt(i));

                if(i == 2 || i == 5){
                    cpf_montado.append(".");
                    i++;
                }else if (i == 8){
                    cpf_montado.append("-");
                    i++;
                }
            } 
            cliente.CPF = cpf_montado.toString(); 
            repetir = false;
        }

        System.out.println("Digite o endereço");
        cliente.endereco = teclado.nextLine();

        while (repetir2){
            System.out.println("Digite o Telefone:");
            String num_n_formatado = teclado.next();

            if (!num_n_formatado.matches("\\d{11}")){
                System.out.println("Número Inválido, Digite novamente.");
                continue;
            }

            StringBuilder num_montado = new StringBuilder();
            num_montado.append("(");

            for(int i = 0; i < num_n_formatado.length(); i++){
                num_montado.append(num_n_formatado.charAt(i));

                if(i == 2){
                    num_montado.append(")");
                    i++;
                }else if (i == 8) {
                    num_montado.append("-");
                    i++;
                }
                cliente.telefone = num_montado.toString();
                repetir2 = false;
            }
        }
        System.out.println("Cliente cadastrado com sucesso! =)");
        return +1;
    }


    static void op2_lista_clientes(Tcliente[] clientes, int totalClientes){
        System.out.println("Lista de todos os clientes cadastrados:\n");

        for(int i = 0; i < totalClientes; i++){
            Tcliente cliente = clientes[i];

            System.out.println((i + 1) +") "+ cliente.nome);
        }
    }

// FALTA TERMINAR


    int totalClientes = 0;
}
