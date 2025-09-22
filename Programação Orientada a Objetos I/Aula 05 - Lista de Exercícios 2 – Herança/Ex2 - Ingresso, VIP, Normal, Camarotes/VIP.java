/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_de_exercicios_pt3;

/**
 *
 * @author Jonathan
 */
public class VIP extends Ingresso {
    protected float valorAdicional;

    public VIP(float val, float valAdicional) {
        // Chama o construtor da classe mãe (Ingresso)
        super(val);
        this.valorAdicional = valAdicional;
    }

    public float getValorVIP() {
        return this.valor + this.valorAdicional;
    }
}