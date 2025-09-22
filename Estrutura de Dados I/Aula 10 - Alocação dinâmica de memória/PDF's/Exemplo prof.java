package exemplolistaencadeada;

import java.util.Scanner;

/**
 *
 * @author Prof_Marcelo_Rauber
 */
class NoPessoa {

    String CPF;
    String nome;
    double salario;
    NoPessoa proximo;
}

public class ExemploListaEncadeada {

    static NoPessoa insereNoInicio(NoPessoa ini, String cpf, String nom, double sal) {
        NoPessoa p = new NoPessoa();
        p.CPF = cpf;
        p.nome = nom;
        p.salario = sal;
        p.proximo = ini;
        return p;
    }

    static void mostra(NoPessoa ini) {
        NoPessoa p;
        p = ini;
        while (p.proximo != null) {
            System.out.println(p.CPF + " " + p.nome + " " + p.salario);
            p = p.proximo;
        }
    }

//É esperado que se encontrar uma pessoa pelo nome, 
//    retorne todas as informações dessa pessoa
//    static NoPessoa procura(String nome) {

//    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TO DO code application logic here
        NoPessoa inicio, p;
        inicio = new NoPessoa();

        //Este "for" insere dados na lista só para exemplo...
        for (int i = 0; i < 20; i++) {
            inicio = insereNoInicio(inicio, "cpf" + i, "Joazinho" + i, i * 1000);
        }

        //se você colocar um BreakPoint na próxima linha, 
        //der o play especial (debug ou depurar o projeto), 
        //parar o mouse sobre a palavra início, e for clicando nos +,
        //poderá ver toda a lista em memória.
        mostra(inicio);

        //p = procura("Joaozinho15");
        //System.out.println(p.CPF + p.nome + p.salario);
    }

}
