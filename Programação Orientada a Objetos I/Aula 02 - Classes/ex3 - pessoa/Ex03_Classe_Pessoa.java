/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pessoa;

/**
 *
 * @author Jonathan
 */
public class Ex03_Classe_Pessoa {
    
    public static void main(String[] args) {
        
        Pessoa pes = new Pessoa("Jonathan", 16, 65.0, 1.65 );

        pes.exibirDados();

        //Envelhecer 6 anos (16 anos + 6 = 22 anos | aumenta 2.5cm de altura)
        pes.Envelhecer(6);

        pes.Engordar(30);

        //Exibe como está a pessoa: (22y, 95kg, 1.675m)
        pes.exibirDados();

        //95kg - 5 = 90kg
        pes.Emagrecer(5);

        //1.675 + 0.20 = 1.875m
        pes.Crescer(0.20);

        pes.exibirDados();
    }
}

