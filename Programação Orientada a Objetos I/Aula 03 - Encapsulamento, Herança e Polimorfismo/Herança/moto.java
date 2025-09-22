/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.heranca;

/**
 *
 * @author Jonathan
 */
// A palavra "extends" é a chave! Ela diz que Moto herda de Veiculos
public class moto extends Veiculos {
    private String marca; // Atributo específico da Moto [cite: 62]

    // Construtor da Moto
    public moto(int pass, int comb, int cons, String mar) {
        // "super()" chama o construtor da classe "pai" (Veiculos)
        // para inicializar os atributos que foram herdados.
        super(pass, comb, cons); 
        this.marca = mar; // Inicializa o atributo próprio da Moto [cite: 65]
    }

    // Método específico da Moto para obter a marca
    public String get_marca(){ 
        return this.marca;
    }
}