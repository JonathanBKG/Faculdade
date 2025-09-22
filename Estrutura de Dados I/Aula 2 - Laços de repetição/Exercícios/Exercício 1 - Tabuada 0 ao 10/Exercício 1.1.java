/*
 * 
 * COLOCAR NO APACHE NETBEANS PARA O CÓDIGO FUNCIONAR!!
 */

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

        for (int cont1 = 0; cont1 <= 10; cont1++) {
            for (int cont2 = 0; cont2 <= 10; cont2++) {

                int result = cont1 * cont2;

                System.out.println(cont1 + " * " + cont2 + "=" + result);
            }
        }
    }
}