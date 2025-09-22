/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

 package com.mycompany.exercicio_2_2__num_inserido_pelo_usuario;

import java.util.Scanner;
/**
 *
 * @author Jonathan
 */
public class Exercicio_2_2__num_inserido_pelo_usuario {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe qualquer numero: ");

        int num = sc.nextInt();
        int cont = 0;

        while(cont < 9){
            System.out.println(num);
            num = num + num;
            cont++;
        }
    }
}