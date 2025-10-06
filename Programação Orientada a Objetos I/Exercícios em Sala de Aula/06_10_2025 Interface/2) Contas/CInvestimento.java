/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contas;

import java.time.LocalDate;

/**
 *
 * @author Jonathan
 */
public class CInvestimento extends CCorrente {
    private int dia_investimento;
    private int periodo;

    public CInvestimento(int num, double sal, int dinv, int per){
        super(num, sal);
        this.dia_investimento = dinv;
        this.periodo = per;
    }

    public void atualizar_saldo(){
        
        int diaAtual = LocalDate.now().getDayOfMonth();

         //Compara o dia atual com o dia definido para o investimento
        if (diaAtual == this.dia_investimento) {
            // Se for o dia correto, aplica os juros
            // Vamos assumir uma taxa de juros de 0.5% (ou 0.005) para este exemplo.
            double taxaJuros = 0.005f;
            
            double saldoAtual = get_saldo();
            double rendimento = saldoAtual * taxaJuros;
            
            // Atualiza o saldo na conta mãe
            set_saldo(saldoAtual + (int)rendimento);
            
            System.out.println("Rendimento aplicado! Saldo atualizado para: R$" + get_saldo());
        } else {
            // Se não for o dia, informa o usuário
            System.out.println("Hoje não é o dia de aplicar o rendimento. Próximo rendimento no dia " + this.dia_investimento);
        }

    }

    public double calculaTributos(){
        double saldoAtual = get_saldo();
        double tributo = saldoAtual * 0.05; // 5%
        
        return tributo;
    }  
    
    @Override
    public String toString(){
        return(super.toString() +", Dia do Investimento: "+ this.dia_investimento);
    }
}
