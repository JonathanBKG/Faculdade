/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.emcapsulamento;

/**
 *
 * @author Jonathan
 */
public class Principal {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();

        // ERRADO! Isso daria um erro de compilação,
        // pois "nome" é privado. Não podemos "invadir" o objeto.
        // p.nome = "Joaozinho"; // <-- ISSO NÃO FUNCIONA!

        // CORRETO! Usamos o método público "setter" para alterar o nome.
        p.setNome("Joaozinho");

        // CORRETO! Usamos o método público "getter" para ler o nome.
        System.out.println("Nome: " + p.getNome()); // -> SAÍDA: Nome: Joaozinho
    }
}

// Com o encapsulamento, você pode adicionar essa lógica dentro do método setNome e garantir que o seu 
// objeto Pessoa nunca terá um estado inválido (um nome com números, por exemplo). Se o atributo nome 
// fosse público, qualquer parte do código poderia alterá-lo para qualquer valor, ignorando as regras e 
// potencialmente causando bugs.
