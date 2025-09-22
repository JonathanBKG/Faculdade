/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pessoa;

/**
 *
 * @author Jonathan
 */
public class Pessoa {

    private String  nome;
    private int     idade;
    private double  peso;
    private double  altura;

    public Pessoa(String nome, int idade, double peso, double alt){
        this.nome   = nome;
        this.idade  = idade;
        this.peso   = peso;
        this.altura = alt;
    }

    public void Envelhecer(int idade){
        int idadeInicio = this.idade;

        while(this.idade < (idadeInicio + idade)){
            if(this.idade < 21){
                this.altura += 0.005;
            }
            this.idade += 1;
        }
    }

    public void Engordar(double peso){
        this.peso += peso;
    }

    public void Emagrecer(double peso){
        this.peso -= peso;
    }

    public void Crescer(double altura){
        this.altura += altura;
    }

    public void exibirDados(){
        System.out.println("Nome: "+ this.nome);
        System.out.println("Idade: "+ this.idade +" anos");
        System.out.println("Peso: "+ this.peso +"kg");
        System.out.printf("Altura: %.3f cm", this.altura);
        System.out.println("\n--------------------");
    }
}
