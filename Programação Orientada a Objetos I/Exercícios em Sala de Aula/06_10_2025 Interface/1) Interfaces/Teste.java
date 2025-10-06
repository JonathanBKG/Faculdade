/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaces;

/**
 *
 * @author Jonathan
 */
public class Teste {
    public static void main(String[] args) {
        Quadrado q = new Quadrado(2.0, "Vermelho");
        Retangulo r = new Retangulo(3.0, 4.0, "Verde");
        Circulo c = new Circulo(3.0, "Azul");

        System.out.println("Quadrado: cor = " + q.getCor() + ", área = " + q.calcularArea());
        System.out.println("Retângulo: cor = " + r.getCor() + ", área = " + r.calcularArea());
        System.out.println("Círculo: cor = " + c.getCor() + ", área = " + c.calcularArea());
    }
}
