/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto_de_pesquisa_time_de_futebol;

import java.time.LocalDateTime;
import java.util.List;
/**
 *
 * @author Jonathan
 */
public class Escalacao{
    private int id_escalacao;
    private Jogo jogo;
    private Treinador treinador;    // Quem escalou
    private List<Jogador> jogadores;
    private LocalDateTime dataHora; // Quando foi feita a escalação

    public Escalacao(int id_escalacao, Jogo jogo, Treinador treinador, List<Jogador> jogadores, LocalDateTime dataHora){
        this.id_escalacao   = id_escalacao;
        this.jogo           = jogo;
        this.treinador      = treinador;
        this.jogadores      = jogadores;
        this.dataHora       = dataHora;
    }

    public int getIdEscal(){
        return id_escalacao;
    }
    //----------------------------
    public Jogo getJogo(){
        return jogo;
    }
    public void setJogo(Jogo jogo){
        this.jogo = jogo;
    }
    //-----------------------------
    public Treinador getTreinador(){
        return treinador;
    }
    public void setTreinador(Treinador treinador){
        this.treinador = treinador;
    }
    //-----------------------------
    public List<Jogador> getJogadores(){
        return jogadores;
    }
    public void setJogadores(List<Jogador> jogadores){
        this.jogadores = jogadores;
    }
    

    public LocalDateTime getDataHora(){
        return dataHora;
    }
    public void setDataHora(LocalDateTime dataHora){
        this.dataHora = dataHora;
    }

}
