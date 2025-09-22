/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_3_conversao_tempo;


import java.util.Scanner;

/**
 *
 * @author Jonathan
 */
public class Exercicio_3_Conversao_tempo {

    static double CalcM(int seg){
        double resp;
        resp = seg / 60;
        return resp;
    }

    static double CalcH(int seg){
        double resp;
        resp = seg / 3600;
        return resp;
    }
    public static void main(String[] args) {
        System.out.println("Digite um valor que represente a quantidade de segundos: ");
        Scanner sc = new Scanner(System.in);
        double min, horas;


        int seg = sc.nextInt();

        min = CalcM(seg);
        horas = CalcH(seg);

        System.out.println(seg +" segundos = "+ min +" minutos = "+ horas +" %.2f Horas");
    }
}
