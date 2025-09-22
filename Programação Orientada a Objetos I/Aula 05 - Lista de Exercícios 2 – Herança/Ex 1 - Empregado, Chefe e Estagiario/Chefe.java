/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_de_exercicios_pt2;

/**
 *
 * @author Jonathan
 */
public class Chefe extends Empregado{
    private float beneficio;

    public Chefe(int cod, String nom, String mail, float sal, float ben){
        super(cod, nom, mail, sal);
        this.beneficio = ben;
    }

    @Override
    public void aumento_salarial(int percentual){
        float valorDoAumento = this.salario * (percentual / 100.0f);
        valorDoAumento += this.beneficio; // Adiciona o benefício

        this.salario += valorDoAumento;
        System.out.println("Aumentado: R$"+ valorDoAumento);
    }


    
}
