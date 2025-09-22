/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quadrado;

/**
 *
 * @author Jonathan
 */
public class Quadrado {
    private double lado;

    public Quadrado(double lad){
        this.lado = lad;
    }

    public void mudarVlrLado(double lad){
        this.lado = lad;
    }

    public double mostrarLado(){
        return this.lado;
    }

    public void calcArea(){
        double LadoQuad = this.lado;
        double area = LadoQuad * LadoQuad;

        System.out.println("A area do Quadrado "+Math.round(LadoQuad)+"x"+Math.round(LadoQuad)+" e: "+area);
    }
}
