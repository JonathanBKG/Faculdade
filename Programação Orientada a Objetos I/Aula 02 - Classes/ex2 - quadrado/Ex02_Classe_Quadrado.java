/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quadrado;

/**
 *
 * @author Jonathan
 */
public class Ex02_Classe_Quadrado {
    
    public static void main(String[] args) {
        Quadrado quad = new Quadrado(10.0);

        System.out.println("O valor do lado e: "+ quad.mostrarLado());

        quad.mudarVlrLado(20.0);

        System.out.println("O novo lado e: "+ quad.mostrarLado());

        quad.calcArea();
    }
}
