/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contas;

/**
 *
 * @author Jonathan
 */
public class CCorrente {
    
    private   int     numero;
    protected double  saldo;

    public CCorrente(int num, double sal){
        this.numero  = num;
        this.saldo   = sal;
    }

    public void creditar(double valor){
        this.saldo += valor;

        System.out.println("Foram creditados: ");
        System.out.println("R$ "+ valor +".");
    }

    public void debitar(double valor){
        
        if ((this.saldo - valor) > 0){
            this.saldo -= valor;

            System.out.println("Foram debitados: ");
            System.out.println("R$ -"+ valor +".");
        }else{
            System.out.println("Saldo Insuficiente!");
        }
    }

    public double get_saldo(){
        return this.saldo;
    }

    public void set_saldo(double saldo){
        this.saldo = saldo;
    }

    @Override
    public String toString(){
        return("Conta:"+ this.numero +", Saldo:"+ this.saldo);
    }


}
