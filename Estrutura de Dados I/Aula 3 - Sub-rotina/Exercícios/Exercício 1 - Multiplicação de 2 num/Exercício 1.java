/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_1_calculadora_sub_rotina;

/**
 *
 * @author Jonathan
 */

import java.util.Scanner;

public class Exercicio_1_Calculadora_Sub_rotina {

//Função para multiplicar os valores
    static int mult(int a, int b){
        int resp;
        resp = a * b;
        return resp;
    }
    public static void main(String[] args) {
        System.out.println("Informe 2 valores para serem multiplicados: ");
        Scanner sc = new Scanner(System.in);

        int a, b, total;

        a = sc.nextInt();
        b = sc.nextInt();

        total = mult(a,b);

        System.out.println(total);

    }
}
