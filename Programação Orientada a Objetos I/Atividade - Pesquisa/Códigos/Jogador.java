/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto_de_pesquisa_time_de_futebol;

/**
 *
 * @author Jonathan
 */
public class Jogador extends Pessoa{
    private String  posicao;
    private int     num_camisa;
    private String  status;

    public Jogador(String nome, String cpf, String pos, int num_cam, String status){
        super(nome, cpf);
        this.posicao    = pos;
        this.num_camisa = num_cam;
        this.status     = status;
    }

    public String setPosicao(String pos){
        this.posicao = pos;
        return "Posicao alterada para: "+ pos +"."; 
    }

    public String setNumCamisa(int num_cam){
        this.num_camisa =   num_cam;
        return "Numero da camisa alterado para: "+ num_cam +".";
    }

    public String setStatus(String status){
        this.status = status;
        return "Status do Jogador alterado para: "+ status +".";
    }

    public String getPosicao(){
        return this.posicao;
    }

    public int getNumCamisa(){
        return this.num_camisa;
    }

}
