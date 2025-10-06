/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaces;

/**
 *
 * @author Jonathan
 */
public class Circulo extends Figura implements areaCalculavel {
    private double raio;
    
    public Circulo(double raio, String cor) {
        super(cor);
        this.raio = raio;
    }
        
    public double getRaio() {
        return raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}
 
