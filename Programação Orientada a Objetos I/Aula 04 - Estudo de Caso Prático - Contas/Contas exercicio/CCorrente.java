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
    protected float   saldo;
    private   String  cliente;

    public CCorrente(int num, float sal, String cli){
        this.numero  = num;
        this.saldo   = sal;
        this.cliente = cli;
    }

    public void creditar(float num){
        this.saldo += num;

        System.out.println("Foram creditados: ");
        System.out.println("R$ "+ num +".");
    }

    public void debitar(float num){
        
        if ((this.saldo - num) > 0){
            this.saldo -= num;

            System.out.println("Foram debitados: ");
            System.out.println("R$ -"+ num +".");
        }else{
            System.out.println("Saldo Insuficiente!");
        }
    }

    public float get_saldo(){
        return this.saldo;
    }

    public void set_saldo(float saldo){
        this.saldo = saldo;
    }


}
