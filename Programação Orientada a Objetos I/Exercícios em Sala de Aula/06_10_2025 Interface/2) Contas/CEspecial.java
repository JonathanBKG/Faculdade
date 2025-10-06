/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contas;

/**
 *
 * @author Jonathan
 */
public class CEspecial extends CCorrente implements tributavel {
    private int limite;

    public CEspecial(int num, double sal, int lim){

        super(num, sal);
        this.limite = lim;
    }
    
    @Override
    public void debitar(double valor){
        double saldoAtual = get_saldo();

        if (valor <= (saldoAtual + this.limite)) {
            set_saldo(saldoAtual - valor);
            System.out.println("Débito de R$" + valor + " efetuado na conta especial.");
        } else {
            System.out.println("Saldo Insuficiente");
        }
    }

    @Override
    public double calculaTributos(){
        double saldoAtual = get_saldo();
        double tributo = saldoAtual * 0.01; // 1%
        
        return tributo;
    }
    
    @Override
    public String toString(){
        return(super.toString() +", Limite: R$"+ this.limite);
    }
}
