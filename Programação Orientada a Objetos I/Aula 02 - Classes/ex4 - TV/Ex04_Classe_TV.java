/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tv;

import java.util.Scanner;
/**
 *
 * @author Jonathan
 */
public class Ex04_Classe_TV {
    public static void main(String[] args) {
        TV tv = new TV(10, 30);
        int opcao = 9;
        Scanner teclado = new Scanner(System.in);

        while (opcao != 0){
            tv.menu();

            opcao = teclado.nextInt();

            if(opcao == 1){
                System.out.println("Digite o numero do canal: ");
                int canal = teclado.nextInt();

                tv.mudarCanal(canal);
            }else if(opcao == 2){
                System.out.println("Quanto voce quer aumentar?");
                int volume = teclado.nextInt();

                tv.aumentarVol(volume);
            }else if(opcao == 3){
                System.out.println("Quanto voce quer diminuir?");
                int volume = teclado.nextInt();

                tv.diminuirVol(volume);
            }else if(opcao == 4){
                tv.mostrarStatusTV();
            }else if(opcao < 0 || opcao > 4){
                System.out.println("Opcao invalida, tente novamente!");
            }
        }
        System.out.println("Desligando!...");
    }
}
