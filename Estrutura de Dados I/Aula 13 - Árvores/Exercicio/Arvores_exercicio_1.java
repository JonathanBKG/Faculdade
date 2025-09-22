/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arvores_exercicio_1;

/**
 *
 * @author Jonathan
 */
class No{
    int valor;
    No esquerda;
    No direita;
}
public class Arvores_exercicio_1 {
    static No inserirRecursivamente(No raiz, int valor){
        if (raiz == null){          //Inserir um novo dado
            No novo = new No();     //(recursivo e ordenado):
            novo.valor = valor;
            return novo;
        }
        if (valor < raiz.valor){
            raiz.esquerda = inserirRecursivamente(raiz.esquerda, valor);
        }else {
            raiz.direita = inserirRecursivamente(raiz.direita, valor);
        }
        return raiz;
    }

    static No inserirSemRecursividade(No raiz, int valor){
        No novo = new No();     //Inserir um novo dado ordenadamente
        novo.valor = valor;     //sem utilizar recursividade:

        if (raiz == null){
            return novo;
        }

        No atual = raiz;
        No anterior = null;

        while (atual != null){
            anterior = atual;

            if (valor < atual.valor){
                atual = atual.esquerda;
            }else {
                atual = atual.direita;
            }
        }
        if (valor < anterior.valor){
            anterior.esquerda = novo;
        }else {
            anterior.direita = novo;
        }

        return raiz;
    }

    static boolean buscaRecursiva(No raiz, int valor){
        if (raiz == null){
            return false;
        }
        if (valor == raiz.valor){
            return true;
        }else if (valor < raiz.valor){
            return buscaRecursiva(raiz.esquerda, valor);
        }else {
            return buscaRecursiva(raiz.direita, valor);
        }
    }

    static boolean buscarSemRecursividade(No raiz, int valor){
        No atual = raiz;

        while (atual != null){
            if (valor == atual.valor){
                return true;
            }else if (valor < atual.valor){
                atual = atual.esquerda;
            }else {
                atual = atual.direita;
            }
        }

        return false;
    }

    static void emOrdem(No raiz){ //Apresenta toda a árvore em ordem 
        if (raiz != null){      //(obrigatório usar recursividade ou pilha):
            emOrdem(raiz.esquerda);
            System.out.println(raiz.valor +" ");
            emOrdem(raiz.direita);
        }
    }

    static No remover(No raiz, int valor){
        
    }

    public static void main(String[] args) {
        No raiz = null;

        raiz = inserirRecursivamente(raiz, 50);
        raiz = inserirSemRecursividade(raiz, 30);
        raiz = inserirSemRecursividade(raiz, 70);
        raiz = inserirSemRecursividade(raiz, 20);
        raiz = inserirSemRecursividade(raiz, 40);
        raiz = inserirSemRecursividade(raiz, 60);
        raiz = inserirSemRecursividade(raiz, 80);

        System.out.println("Busca por 40: ");
        System.out.println(buscarSemRecursividade(raiz, 40)); // True

        System.out.println("Busca por 90: ");
        System.out.println(buscaRecursiva(raiz, 90)); // False

        System.out.println("Valores em ordem: ");
        emOrdem(raiz);   // Deve imprimir em ordem crescente
    }
}
