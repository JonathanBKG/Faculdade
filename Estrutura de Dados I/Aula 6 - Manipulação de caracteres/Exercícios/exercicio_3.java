/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.manipulacao_de_caracteres;

import java.util.Scanner;
/**
 *
 * @author Jonathan
 */
public class exercicio_3 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        boolean repetir = true;
        boolean repetir_2 = true;

        while(repetir){
            System.out.println("Digite uma frase com algumas palavras:");
            String frase = teclado.nextLine();

            int contEspacos = 0;
            for (int i = 0; i < frase.length(); i++) {
                if(frase.charAt(i) == ' ') {
                    contEspacos++;
                }
            }
            
            System.out.println("A frase tem " + (contEspacos + 1) + " palavras.\n");
            
            while(repetir_2){
                System.out.println("Deseja repetir?");
                System.out.println("0 - Sim!");
                System.out.println("1 - Não!");
                int resposta = teclado.nextInt();
                teclado.nextLine();
                
                if (resposta == 1) {
                    repetir = false;
                    repetir_2 = false;
                }else if(resposta == 0){
                    break;
                }else if (resposta != 0 && resposta != 1){
                    System.out.println("opção inválida, tente novamente.");
                    repetir_2 = true;
                }
            }
        }
    }
}