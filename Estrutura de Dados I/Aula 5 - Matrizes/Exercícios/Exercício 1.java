/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matrizes_ex_1;

import java.util.Scanner;

/**
 *
 * @author Jonathan
 */
public class Matrizes_ex_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome dos alunos e suas notas:");
        
        int i = 0;
        int n = 0;

        String alunos[] = new String[6];
        String notas[][] = new String[6][3];

        // Laço de repetição para pegar nome do aluno e suas notas:
        while (i < 6){ 
            System.out.println("Digite o nome do "+ (i + 1) +"º Aluno: ");
            alunos[i] = sc.next();

            while (n < 3){
                System.out.println("Digite a "+(n + 1)+"ª nota desse aluno: ");
                notas[n][i] = sc.next();
                n += 1;
            }
            n = 0;
            i += 1;    
        }

        // Continuar apartir daq
        System.out.print(alunos);


    }
}
