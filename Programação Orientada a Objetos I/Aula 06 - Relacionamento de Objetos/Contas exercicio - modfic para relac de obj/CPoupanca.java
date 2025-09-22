/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contas;

/**
 *
 * @author Jonathan
 */
public class Cpoupanca extends CCorrente {
    private float saldoMinimo;

    public Cpoupanca(int num, int sal, Cliente cli, float salmin){
        super(num, sal, cli);
        this.saldoMinimo = salmin;
    }

    @Override
    public void debitar(float valor){
        float saldoAtual = get_saldo();

        if ((saldoAtual - valor) >= this.saldoMinimo) {
            super.debitar(valor);
        }else {
            System.out.println("Operação negada! O saque deixaria o saldo abaixo do mínimo permitido de R$" + this.saldoMinimo);
        }
    }

    public float get_saldominimo() {
        return this.saldoMinimo;
    }

    @Override
    public String toString(){
        return(super.toString() +", Saldo minimo: "+ this.saldoMinimo);
    }
}
