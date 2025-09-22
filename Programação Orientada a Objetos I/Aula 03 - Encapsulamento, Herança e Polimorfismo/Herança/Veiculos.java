/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.heranca;

/**
 *
 * @author Jonathan
 */
public class Veiculos {
    private int passageiros; // Quantas pessoas pode levar [cite: 44]
    private int combustivel;  // Capacidade do tanque em litros [cite: 45]
    private int consumo;      // Km por litro [cite: 46]

    // Este é o "construtor", chamado quando criamos um novo veículo
    public Veiculos(int pass, int comb, int cons){
        this.passageiros = pass;
        this.combustivel = comb;
        this.consumo = cons;
    }

    // Método para calcular a autonomia (distância máxima)
    public int calcular_consumo(){
        return (this.combustivel * this.consumo); // Retorna combustível x consumo
    }

    // Método para nos dizer quantos passageiros o veículo leva
    public int get_passageiros(){
        return this.passageiros;
    }
}
