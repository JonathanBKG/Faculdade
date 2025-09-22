/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tv;

/**
 *
 * @author Jonathan
 */
public class TV {
    private int canal;
    private int volume;

    public TV(int canal, int volume){
        this.canal  = canal;
        this.volume = volume;
    }

    public void menu(){
        System.out.println("-----------------------");
        System.out.println("1 - Mudar de canal");
        System.out.println("2 - Aumentar Volume");
        System.out.println("3 - Diminuir Volume");
        System.out.println("4 - Mostrar Canal e Nivel volume");
        System.out.println("\n0 - Desligar TV");
        System.out.println("-----------------------");
    }

    public void mudarCanal(int novoCanal) {
        if (novoCanal >= 0 && novoCanal <= 50) {
            this.canal = novoCanal;
            System.out.println("Canal alterado para: " + this.canal);
        } else {
            System.out.println("Canal invalido! Por favor, escolha um canal entre 0 e 50.");
        }
    }


    public void aumentarVol(int quantidade) {
        if ((this.volume + quantidade) <= 100) {
            this.volume += quantidade;
        } else {
            this.volume = 100;
        }
        System.out.println("Volume alterado para: " + this.volume);
    }

    public void diminuirVol(int volume){
        if((this.volume - volume) >= 0){
            this.volume -= volume;
        }else if((this.volume - volume) < 0){
            this.volume = 0;
        }

        System.out.println("Volume alterado para: "+ this.volume);
    }

    public void mostrarStatusTV(){
        System.out.println("----------------------");
        System.out.println("Canal: "+ this.canal);
        System.out.println("Volume: "+ this.volume);
        System.out.println("----------------------");
    }
    
}
