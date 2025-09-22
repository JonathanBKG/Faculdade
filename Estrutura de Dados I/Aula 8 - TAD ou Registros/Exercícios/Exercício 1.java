/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_1_tad;

import java.util.Scanner;

/**
 *
 * @author Jonathan
 */

class Taluno{
    String nome;
    double media;
}
public class Exercicio_1_TAD {

    //Definindo estrutura do TAD



    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o numero de alunos a ser calculado:");
        int num = teclado.nextInt();
        Taluno aluno[] = new Taluno[num];

        int i = 1;

        while (i <= num){
            aluno[i-1] = new Taluno();
            System.out.println("Digite o nome do "+ i +"º aluno e a sua média:");
            aluno[i-1].nome = teclado.next();
            aluno[i-1].media = teclado.nextDouble();

            i += 1;
        }
        i = 1;

        while (i <= num){
            if (aluno[i-1].media <= 6.99){
                System.out.println("Aluno: "+ aluno[i-1].nome +" nota: "+aluno[i-1].media+" | Em exame");
            }
            i += 1;

        }


    }
}
