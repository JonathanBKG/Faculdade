/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contas;


/**
 *
 * @author Jonathan
 */
public class CPoupanca extends CCorrente {
    private double saldoMinimo;

    public CPoupanca(int num, double sal, float salmin){
        super(num, sal);
        this.saldoMinimo = salmin;
    }

    @Override
    public void debitar(double valor){
        double saldoAtual = get_saldo();

        if ((saldoAtual - valor) >= this.saldoMinimo) {
            super.debitar(valor);
        }else {
            System.out.println("Operação negada! O saque deixaria o saldo abaixo do mínimo permitido de R$" + this.saldoMinimo);
        }
    }
    
    public void atualizar_saldo() {
        super.set_saldo( (super.get_saldo() + (this.saldoMinimo * 0.05)));
        this.saldoMinimo =  super.get_saldo();
    }

    public double get_saldominimo() {
        return this.saldoMinimo;
    }

    @Override
    public String toString(){
        return(super.toString() +", Saldo minimo: "+ this.saldoMinimo);
    }
}
