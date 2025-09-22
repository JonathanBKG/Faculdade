package exemplolistaencadeada;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



import java.util.Scanner;
/**
 *
 * @author Jonathan
 */
class NoPessoa {
    String   CPF;
    String   nome;
    double   salario;
    NoPessoa proximo;
}

public class Alocacao_dinamica_memoria {

    static NoPessoa insereNoInicio(NoPessoa ini, String cpf, String nom, double sal){
        NoPessoa p = new NoPessoa();
        p.CPF = cpf;
        p.nome = nom;
        p.salario = sal;
        p.proximo = ini;
        return p;
    }

    static NoPessoa insereNoFinal(NoPessoa ini, String cpf, String nom, double sal){
        NoPessoa p;
        p = ini;
        while(p.proximo != null){
            p = p.proximo;
        }
        if (p.proximo == null){
            NoPessoa p2 = new NoPessoa();
            p2.CPF = cpf;
            p2.nome = nom;
            p2.salario = sal;
            p2.proximo = null;
            p.proximo = p2;
        return p;
        }
        return null;
    }

    static void mostra(NoPessoa ini){
        NoPessoa p;
        p = ini;
        while (p.proximo != null){
            System.out.println(p.CPF +" "+ p.nome +" "+ p.salario);
            p = p.proximo;
        }
    }

    static NoPessoa procura(NoPessoa ini, String nome){
        NoPessoa p = ini;
        while (p.proximo != null){
            if(p.nome.equals(nome)){
                return p;
            }
            p = p.proximo;
        }
        System.out.println("Nome não encontrado");
        return null;
    }


    public static void main(String[] args) {
        // TO DO code application logic here
        NoPessoa inicio, p;
        inicio = new NoPessoa();

        //Este "for" insere dados na lista só para exemplo...
        for (int i = 0; i < 20; i++) {
            inicio = insereNoInicio(inicio, "cpf" + i, "Joazinho" + i, i * 1000);
        }

        mostra(inicio);

        p = procura(inicio ,"Joazinho15");
        
        if(p != null){
            System.out.println(p.CPF + p.nome + p.salario);
        }
        insereNoFinal(inicio, "20", "Laura", 9999);
    }
        
    
}
