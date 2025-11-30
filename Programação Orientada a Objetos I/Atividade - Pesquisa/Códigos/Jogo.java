/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto_de_pesquisa_time_de_futebol;

import java.time.LocalDateTime;
/**
 *
 * @author Jonathan
 */
public class Jogo {
    private int id;
    private String timeCasa;
    private String timeVisitante;
    private LocalDateTime dataHora;
    private String local;
    private String resultado; // por exemplo: "2x1" ou "a definir"


    public Jogo(int id, String timeCasa, String timeVisitante, LocalDateTime dataHora, String local){
        this.id             =   id;
        this.timeCasa       =   timeCasa;
        this.timeVisitante  =   timeVisitante;
        this.dataHora       =   dataHora;
        this.local          =   local;
        this.resultado      =   "a definir";
    }

    //-----------------------------------------
    public int getId() { 
        return id; 
    }
    public void setId(int id) {
        this.id = id; 
    }
    //-----------------------------------------
    public String getTimeCasa(){
        return timeCasa;
    }
    public void setTimeCasa(String timeCasa){
        this.timeCasa = timeCasa;
    }
    //-----------------------------------------
    public String getTimeVisitante(){
        return timeVisitante;
    }
    public void setTimeVisitante(String timeVisitante){
        this.timeVisitante = timeVisitante;
    }
    //-----------------------------------------
    public LocalDateTime getDataHora(){
        return dataHora;
    }
    public void setDataHora(LocalDateTime dataHora){
        this.dataHora = dataHora;
    }
    //-----------------------------------------
    public String getLocal(){
        return local;
    }
    public void setLocal(String local){
        this.local = local;
    }
    //-----------------------------------------
    public String getResultado(){
        return resultado;
    }
    public void setResultado(String resultado){
        this.resultado = resultado;
    }
}
