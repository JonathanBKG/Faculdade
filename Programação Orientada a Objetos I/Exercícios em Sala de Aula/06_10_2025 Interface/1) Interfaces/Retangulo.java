/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaces;

/**
 *
 * @author Jonathan
 */

public class Retangulo extends Figura implements areaCalculavel {
    private double base;
    private double altura;
    
    public Retangulo(double base, double altura, String cor) {
        super(cor);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }
    
    public double getAltura() {
        return altura;
    }

    @Override
    public double calcularArea() {
        return base * altura; 
    }
}
