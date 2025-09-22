/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_de_exercicios_pt3;

/**
 *
 * @author Jonathan
 */
public class camaroteSuperior extends VIP {
    private float adicionalSuperior;

    public camaroteSuperior(float val, float valAdicionalVIP, float valAdicionalSuperior) {
        // Chama o construtor da classe mãe (VIP)
        super(val, valAdicionalVIP);
        this.adicionalSuperior = valAdicionalSuperior;
    }

    public float getValorcamaroteSuperior() {
        // Pega o valor total do VIP e soma com o adicional do Camarote Superior
        float valorTotalVIP = super.getValorVIP();
        return valorTotalVIP + this.adicionalSuperior;
    }
}