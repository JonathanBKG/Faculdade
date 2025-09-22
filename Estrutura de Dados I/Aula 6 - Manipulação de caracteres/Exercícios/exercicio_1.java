/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.manipulacao_de_caracteres;

import java.util.Scanner;
/**
 *
 * @author Jonathan
 */
public class Manipulacao_de_caracteres {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Boolean repetir = true;
        while (repetir){
            System.out.println("Digite uma frase:");
            String frase = teclado.nextLine();

            int numCarac = frase.length();

            System.out.println("O número de caracteres nessa frase é de:");
            System.out.println(numCarac);

            System.out.println("Gostaria de ver outra frase?");
            System.out.println("0 - Sim!");
            System.out.println("1 - Não!");
            int resposta = teclado.nextInt();
            teclado.nextLine();

            if (resposta == 1){
                repetir = false;
            }
        }
    }
}