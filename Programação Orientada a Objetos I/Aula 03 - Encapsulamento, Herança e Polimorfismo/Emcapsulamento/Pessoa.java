/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.emcapsulamento;

/**
 *
 * @author Jonathan
 */
public class Pessoa {
    // 1. O atributo "nome" é PRIVADO!
    // Ninguém de fora da classe Pessoa pode acessá-lo diretamente.
    private String nome;

    // 2. Método PÚBLICO para OBTER o nome (Getter)
    // Funciona como uma "janela de leitura" controlada.
    public String getNome() {
        return this.nome;
    }

    // 3. Método PÚBLICO para DEFINIR o nome (Setter)
    // Funciona como uma "porta de entrada" controlada.
    public void setNome(String nome) {
        // Aqui poderíamos adicionar regras. Ex: "o nome não pode ser vazio".
        this.nome = nome;
    }
}
