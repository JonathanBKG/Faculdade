/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_de_exercicios_pt2;

/**
 *
 * @author Jonathan
 */
public class Estagiario extends Empregado{
    private int descontos;

    public Estagiario(int cod, String nom, String mail, float sal, int desc){
        super(cod, nom, mail, sal);
        this.descontos = desc;
    }

    @Override
    public void aumento_salarial(int percentual){
        float valorDoAumento = this.salario * (percentual / 100.0f);
        valorDoAumento -= this.descontos; // Subtrai o desconto

        this.salario += valorDoAumento;
        System.out.println("Aumentado: R$"+ valorDoAumento);
    }
}
