/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

 package com.mycompany.exercicio_2_soma_n_entre_2_num_sub_rotina;

 /**
  *
  * @author Jonathan
  */

import java.util.Scanner;

public class Exercicio_2_soma_N_entre_2_num_Sub_rotina {
 
    static int somaN(int a, int b){
        int num, c, soma;
        if (a > b){
            c = a;
            a = b;
            b = c;
        }

        num = a + 1;
        soma = a;
        
        while (num <= b){
            soma = soma + num;
            num += 1;
        }

        return soma;
    }

    public static void main(String[] args) {
        System.out.println("Informe 2 valores: ");
        Scanner sc = new Scanner(System.in);

        int a, b, total;
        
        a = sc.nextInt();
        b = sc.nextInt();

        total = somaN(a, b);

        System.out.println("A soma dos numeros entre "+ a +" e "+ b +" = "+ total);         

    }
}
 