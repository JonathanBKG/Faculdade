/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_de_exercicios_pt3;

/**
 *
 * @author Jonathan
 */
public class Ingresso {
    protected float valor;

    public Ingresso(float val) {
        this.valor = val;
    }

    public void imprimeValor() {
        System.out.println("Valor do Ingresso: R$" + this.valor);
    }
}