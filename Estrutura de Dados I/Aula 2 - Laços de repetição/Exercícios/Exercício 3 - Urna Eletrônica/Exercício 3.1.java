/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_3_1_urna_eletronica;

import java.util.Scanner;

/**
 *
 * @author Jonathan
 */
public class Exercicio_3_1_urna_eletronica {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos votantes?");

        int num_votantes = sc.nextInt(); 

        int cand_1_vts = 0;
        int cand_2_vts = 0;
        int cand_3_vts = 0;
        int BRANCO_vts = 0;


        for (int cont = 0; cont <= num_votantes;){
            System.out.println("Eleições IFC 2025: (Digite o numero da opção do seu candidato!)");
            System.out.println("1) Votar no candidato AAA");
            System.out.println("2) Votar no candidato BBB");
            System.out.println("3) Votar no candidato CCC");
            System.out.println("4) Votar em BRANCO");

            int voto = sc.nextInt();

            if (voto == 1){
                cand_1_vts =+ 1;
                cont =+ 1;
                
            }else if (voto == 2){
                cand_2_vts =+ 1;
                cont =+ 1;
                
            }else if (voto == 3){
                cand_3_vts =+ 1;
                cont =+ 1;
                
            }else if (voto == 4){
                BRANCO_vts =+ 1;
                cont =+ 1;
                
            }else {
                System.out.println("Erro: Opção inválida");
                }
                // CONTINUAR PROGRAMA DEPOIS
            }
        }

        
}
