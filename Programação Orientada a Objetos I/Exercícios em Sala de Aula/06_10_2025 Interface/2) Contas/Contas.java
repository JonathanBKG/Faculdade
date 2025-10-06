/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contas;


/**
 *
 * @author Jonathan
 */
public class Contas {
        public static void main(String[] args) {
//        ListaClientes lista = new ListaClientes();
//        Cliente cli1 = new Cliente("Joice", "394.723.947-32");
//        lista.addClientes(cli1);
//        Cliente cli2 = new Cliente("Joao", "701.324.567-09");
//        lista.addClientes(cli2);
//        Cliente cli3 = new Cliente("Ivo", "435.456.324-45");
//        lista.addClientes(cli3);
//        Cliente cli4 = new Cliente("Ana", "730.043.786-05");
//        lista.addClientes(cli4);
//        Cliente cli5 = new Cliente("Carlos", "101.324.876-09");
//        lista.addClientes(cli5);
//
//        ContaCorrente cc1 = new ContaCorrente(1, 1000);
//        cli1.addContas(cc1);
//        ContaCorrente cc2 = new ContaCorrente(2, 2500);
//        cli2.addContas(cc2);
//        ContaPoupanca cp1 = new ContaPoupanca(3, 1000, 1000);
//        cli2.addContas(cp1);
//        ContaEspecial ce1 = new ContaEspecial(4, 1500, 3000);
//        cli3.addContas(ce1);
//        ContaInvestimento ci1 = new ContaInvestimento(5, 2000, 20, 10);
//        cli3.addContas(ci1);
//        ContaInvestimento ci2 = new ContaInvestimento(6, 5000, 20, 5);
//        cli4.addContas(ci2);
//        System.out.println("----------");
//        lista.imprimeClientes();
//        System.out.println("----------");

        CEspecial teste_esp = new CEspecial (100, 1000.0, 100000);
        CInvestimento teste_invest = new CInvestimento(99, 1000.0, 28, 10);
        
        System.out.println("Tributo Conta Especial: "+ teste_esp.calculaTributos());
        System.out.println("Tributo Conta Investimento: "+ teste_invest.calculaTributos());
    }
}