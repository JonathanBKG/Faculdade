/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto_de_pesquisa_time_de_futebol;

/**
 *
 * @author Jonathan
 */
public class Pessoa {
    
    private String  nome;
    private String  cpf;

    public Pessoa(String nome, String cpf){
        this.nome   = nome;
        this.cpf    = cpf;
    }

    public String setNome(String nome){
        this.nome   = nome;

        return "Nome alterado para: "+ nome +".";
    }
    public String getNome(){
        return this.nome;
    }

    public String setCPF(String cpf){
        if (cpf.length() != 11) {
        return "CPF inválido";
    }else{
        this.cpf = cpf;

        return "CPF alterado para: "+ formatarCpf(cpf) +".";
        }
    }
    public String getCpf() {
        return cpf;
    }
    

    public String formatarCpf(String cpf){
        return cpf.substring(0, 3) + "." + 
               cpf.substring(3, 6) + "." + 
               cpf.substring(6, 9) + "-" + 
               cpf.substring(9, 11);
        
    }
}
