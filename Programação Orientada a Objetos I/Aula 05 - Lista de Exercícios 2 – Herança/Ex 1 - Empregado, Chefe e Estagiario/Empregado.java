/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_de_exercicios_pt2;

/**
 *
 * @author Jonathan
 */
public class Empregado {
    private    int     codigo;
    private    String  nome; 
    private    String  email;
    protected  float   salario;

    public Empregado(int cod, String nom, String mail, float sal){
        this.codigo     = cod;
        this.nome       = nom;
        this.email      = mail;
        this.salario    = sal;
    }

    public float get_salario(){
        return this.salario;
    }

    public void aumento_salarial(int percentual){
        //Pegando o valor que será adicionado ao salario:
        float valorDoAumento = this.salario * (percentual / 100.0f);

        this.salario += valorDoAumento;

        System.out.println("\nAumentado: R$"+ valorDoAumento);
    }
}
