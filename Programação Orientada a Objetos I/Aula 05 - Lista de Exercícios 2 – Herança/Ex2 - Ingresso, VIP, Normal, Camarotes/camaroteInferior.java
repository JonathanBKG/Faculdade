/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_de_exercicios_pt3;

/**
 *
 * @author Jonathan
 */
public class camaroteInferior extends VIP {
    private String localizacao;

    public camaroteInferior(float val, float valAdicional, String loc) {
        // Chama o construtor da classe mãe (VIP)
        super(val, valAdicional);
        this.localizacao = loc;
    }

    public String getLocalizacao() {
        return this.localizacao;
    }

    public void imprimeLocalizacao() {
        System.out.println("Localizacao: " + this.localizacao);
    }
}