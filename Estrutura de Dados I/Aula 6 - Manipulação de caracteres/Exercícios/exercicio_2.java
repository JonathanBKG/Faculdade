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
public class exercicio_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean repetir = true;

        while (repetir) {
            System.out.println("Digite uma frase:");
            String frase = teclado.nextLine();
            int vogais = 0;

            for (int i = 0; i < frase.length(); i++) {
                char c = Character.toLowerCase(frase.charAt(i));
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                    vogais++;
                }
            }
            System.out.println("O numero de vogais na frase inserida é:");
            System.out.println(vogais +"\n\n");

            System.out.println("Gostaria de ver outra frase?");
            System.out.println("0 - Sim!");
            System.out.println("1 - Não!");
            int resposta = teclado.nextInt();
            teclado.nextLine();

            if (resposta == 1) {
                repetir = false;
            }
        }
    }
    
}
