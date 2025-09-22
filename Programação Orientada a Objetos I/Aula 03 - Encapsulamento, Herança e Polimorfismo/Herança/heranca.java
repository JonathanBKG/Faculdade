/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.heranca;

/**
 *
 * @author Jonathan
 */
public class Heranca {

    public static void main(String[] args) {
    // Criando um objeto do tipo Veiculos
        Veiculos minivan = new Veiculos(7, 80, 9);

        // Criando outro objeto do tipo Veiculos
        Veiculos sportcar = new Veiculos(2, 9, 35);

        // Criando um objeto do tipo Moto
        moto Moto = new moto(2, 10, 20, "honda");

        // --- Usando os objetos ---

        // A minivan pode levar 7 passageiros
        System.out.print("Minivan pode transportar " + minivan.get_passageiros() + " passageiros ");
        // com autonomia de 720 km (80 litros * 9 km/l)
        System.out.println("com uma autonomia de " + minivan.calcular_consumo() + " quilômetros");

        // A moto pode transportar 2 passageiros (usando get_passageiros() herdado)
        System.out.print("Moto " + Moto.get_marca() + " pode transportar " + Moto.get_passageiros() + " passageiros "); 
        // com autonomia de 200 km (10 litros * 20 km/l) (usando calcular_consumo() herdado)
        System.out.println("com uma autonomia de " + Moto.calcular_consumo() + " quilômetros");
    }
}
