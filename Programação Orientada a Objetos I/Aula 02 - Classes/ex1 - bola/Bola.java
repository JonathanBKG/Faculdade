/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bola;

/**
 *
 * @author Jonathan
 */

public class Bola {
    private String cor, material;
    private Double circunferencia;

    public Bola(String cor, String mat, double cir){
        this.cor = cor;
        this.material = mat;
        this.circunferencia = cir;
    }
    public String mostrarCor(){
        return this.cor;
    }
    public void trocarCor(String cor){
        this.cor = cor;
    }
    }
