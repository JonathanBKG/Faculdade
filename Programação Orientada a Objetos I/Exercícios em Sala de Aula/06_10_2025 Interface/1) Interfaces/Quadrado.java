/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaces;

/**
 *
 * @author Jonathan
 */
public class Quadrado extends Figura implements areaCalculavel{
    private double lado;

    public Quadrado(double lado, String cor){
        super(cor);
        this.lado = lado;
    }

    @Override
    public double calcularArea(){
        return lado * lado;
    }

    public double getLado(){
        return lado;
    }
}
