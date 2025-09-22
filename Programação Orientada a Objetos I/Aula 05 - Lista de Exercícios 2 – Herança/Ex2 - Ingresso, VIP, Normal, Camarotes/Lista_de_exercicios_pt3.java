/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_de_exercicios_pt3;

/**
 *
 * @author Jonathan
 */
public class Lista_de_exercicios_pt3 {

    public static void main(String[] args) {
        
        System.out.println("--- Testando Ingresso Normal ---");
        Normal ingressoNormal = new Normal(100.0f);
        ingressoNormal.imprimeTipo();
        ingressoNormal.imprimeValor();
        System.out.println("--------------------------------\n");
        
        System.out.println("--- Testando Ingresso VIP ---");
        // Ingresso base de R$100 + R$50 de adicional VIP
        VIP ingressoVip = new VIP(100.0f, 50.0f);
        System.out.println("Valor do Ingresso VIP: R$" + ingressoVip.getValorVIP());
        System.out.println("--------------------------------\n");
        
        System.out.println("--- Testando Camarote Inferior ---");
        // Mesmos valores do VIP, só que com localização
        camaroteInferior camaroteInf = new camaroteInferior(100.0f, 50.0f, "Setor A, Fila 5");
        camaroteInf.imprimeLocalizacao();
        System.out.println("Valor do Camarote Inferior: R$" + camaroteInf.getValorVIP());
        System.out.println("--------------------------------\n");
        
        System.out.println("--- Testando Camarote Superior ---");
        // Base R$100 + Adicional VIP R$50 + Adicional Superior R$80
        camaroteSuperior camaroteSup = new camaroteSuperior(100.0f, 50.0f, 80.0f);
        System.out.println("Valor do Camarote Superior: R$" + camaroteSup.getValorcamaroteSuperior());
        System.out.println("--------------------------------\n");
    }
}