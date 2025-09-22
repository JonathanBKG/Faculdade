package com.mycompany.bola;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jonathan
 */
public class Ex01_Classe_Bola {

    public static void main(String[] args) {
        Bola bolinha = new Bola("lilas", "plastico", 10.0);

        System.out.println("A cor da bola e: "+ bolinha.mostrarCor());

        bolinha.trocarCor("amarela");

        System.out.println("A cor da bola e: "+ bolinha.mostrarCor());
    }
}
