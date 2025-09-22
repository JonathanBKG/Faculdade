/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lacos_de_repeticao;

/**
 *
 * @author Jonathan
 */
public class Lacos_de_repeticao {

    public static void main(String[] args) {
        System.out.println("Tabuada do 0 ao 10: ");

        int cont1 = 0;
        int cont2 = 0;
        int result;

        while(cont1 < 10){
            while(cont2 < 10) {

                result = cont1 * cont2;

                System.out.println(cont1 + " * " + cont2 + "=" + result);
                cont2++;
            }
            cont1++;
        }
    }
}