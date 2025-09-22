/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_de_exercicios_pt3;

/**
 *
 * @author Jonathan
 */
public class Normal extends Ingresso {
    
    public Normal(float val) {
        // Chama o construtor da classe mãe (Ingresso)
        super(val);
    }

    public void imprimeTipo() {
        System.out.println("Ingresso Normal");
    }
}