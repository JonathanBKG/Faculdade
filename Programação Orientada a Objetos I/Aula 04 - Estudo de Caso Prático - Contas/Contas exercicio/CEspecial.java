/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contas;

/**
 *
 * @author Jonathan
 */
public class CEspecial extends CCorrente {
    private int limite;

    public CEspecial(int num, int sal, String cli, int lim){

        super(num, sal, cli);
        this.limite = lim;
    }
    
    @Override
    public void debitar(float valor){
        float saldoAtual = get_saldo();

        if (valor <= (saldoAtual + this.limite)) {
            set_saldo(saldoAtual - valor);
            System.out.println("Débito de R$" + valor + " efetuado na conta especial.");
        }
    }
}
