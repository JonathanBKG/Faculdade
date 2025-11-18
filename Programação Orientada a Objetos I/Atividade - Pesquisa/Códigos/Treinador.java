/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto_de_pesquisa_time_de_futebol;

import java.time.LocalDate;

/**
 *
 * @author Jonathan
 */
public class Treinador extends Pessoa{
    private int anos_exp;
    private String cargo;

    public Treinador(String nome, String cpf, int anosExp, String cargo){
        super(nome, cpf);
        this.anos_exp = anosExp;
        this.cargo    = cargo;
    }

    public String setAnosExp(int ano_inicio){
        /*Para calcularmos a quantidade de anos que o treinador tem de
        * experiência, precisamos saber em que ano o treinador começou
        * sua carreira.
        * 
        * Tempo mínimo de experiência: Para cursos de licenças da CBF, 
        * é comum exigir experiência prévia como atleta profissional 
        * ou como treinador/professor por pelo menos 5 anos.
        * 
        * Idade mínima: 18 anos​
        */
        int anoAtual = LocalDate.now().getYear();
        int anosExp = anoAtual - ano_inicio;

        if(anosExp >= 5 && (ano_inicio + 18) <= anoAtual && (anoAtual - ano_inicio + 18) >= 23){
            this.anos_exp   =   anosExp;
            return "Experiência definida. Treinador tem idade mínima.";
        } else{
            return "Não atende aos critérios mínimos.";
        }
    }

    public String setCargo(String cargo){
        this.cargo = cargo;
        return "Cargo definido para: "+ cargo +".";
    }

    public int getAnosExp(){
        return this.anos_exp;

    }

    public String getCargo(){
        return this.cargo;
    }
}
