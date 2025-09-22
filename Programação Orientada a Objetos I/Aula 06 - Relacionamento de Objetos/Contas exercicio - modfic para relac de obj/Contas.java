/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contas;

/**
 *
 * @author Jonathan
 */
public class Contas {
    public static void main(String[] args){
        System.out.println("### INICIANDO SIMULAÇÃO BANCÁRIA ###\n");

        // --- 1. Testando a Conta Corrente (CCorrente) ---
        System.out.println("--- Testando Conta Corrente ---");

        Cliente cli1 = new Cliente("Ana", "123.456.789.00");
        CCorrente conta1 = new CCorrente(1, 1000, cli1);
        System.out.println(conta1);
        System.out.println("Saldo inicial: R$" + conta1.get_saldo());

        conta1.debitar(500);  // Débito válido
        conta1.debitar(3000); // Débito inválido (saldo insuficiente)

        System.out.println("Saldo final: R$" + conta1.get_saldo());
        System.out.println(conta1);
        System.out.println("----------------------------------\n");


        // --- 2. Testando a Conta Especial (CEspecial) ---
        System.out.println("--- Testando Conta Especial ---");
        Cliente cli2 = new Cliente("Joao", "321.654.987.00");
        CEspecial conta2 = new CEspecial(2, 2000, cli2, 5000);
        
        System.out.println(conta2);
        System.out.println("Saldo inicial: R$" + conta2.get_saldo() + " | Limite: R$" + 500);
        conta2.debitar(800);   // Débito válido (usa parte do saldo)
        conta2.debitar(600);   // Débito válido (usa o resto do saldo e parte do limite)
        System.out.println("Saldo após usar o limite: R$" + conta2.get_saldo());
        conta2.debitar(200);   // Débito inválido (ultrapassa o limite)
        
        System.out.println(conta2);
        System.out.println("Saldo final: R$" + conta2.get_saldo());
        System.out.println("---------------------------------\n");
        
        


        // --- 3. Testando a Conta Poupança (CPoupanca) ---
        System.out.println("--- Testando Conta Poupança ---");
        Cliente cli3 = new Cliente("Pedro Santos", "111.222.333.00");
        Cpoupanca contaPoupanca = new Cpoupanca(303, 1500, cli3, 100);
        
        System.out.println(contaPoupanca);
        System.out.println("Saldo inicial: R$" + contaPoupanca.get_saldo() + " | Saldo Mínimo: R$" + contaPoupanca.get_saldominimo());
        contaPoupanca.debitar(1400); // Débito válido (saldo restante será 100, que é >= 100)
        contaPoupanca.debitar(50);   // Débito inválido (saldo restante seria 50, que é < 100)
        System.out.println("Saldo final: R$" + contaPoupanca.get_saldo());
        
        System.out.println(contaPoupanca);
        System.out.println("---------------------------------\n");


        // --- 4. Testando a Conta Investimento (CInvestimento) ---
        // Para este teste, vamos criar duas contas de investimento.
        // Uma com o dia do rendimento para HOJE (dia 25) e outra para um dia diferente.
        
        System.out.println("--- Testando Conta Investimento ---");
        // Conta com dia de investimento para HOJE (25)
        Cliente cli4 = new Cliente("Ana Costa", "444.555.666.00");
        CInvestimento contaInvest1 = new CInvestimento(404, 5000, cli4, 25, 30);
        
        System.out.println(contaInvest1);
        System.out.println("Conta 1 - Saldo inicial: R$" + contaInvest1.get_saldo() + " | Dia do rendimento: " + 25);
        contaInvest1.atualizar_saldo(); // Deve aplicar o rendimento
        System.out.println("Conta 1 - Saldo final: R$" + contaInvest1.get_saldo());
        System.out.println(contaInvest1);
        
        System.out.println(); // Linha em branco para separar

        // Conta com dia de investimento para dia 10.
        Cliente cli5 = new Cliente("Carlos Lima", "777.888.999.00");
        CInvestimento contaInvest2 = new CInvestimento(505, 10000, cli5, 10, 30);
        
        System.out.println(contaInvest2);
        System.out.println("Conta 2 - Saldo inicial: R$" + contaInvest2.get_saldo() + " | Dia do rendimento: " + 10);
        contaInvest2.atualizar_saldo(); // NÃO deve aplicar o rendimento
        System.out.println("Conta 2 - Saldo final: R$" + contaInvest2.get_saldo());
        System.out.println(contaInvest2);
        System.out.println("-------------------------------------\n");

        System.out.println("### SIMULAÇÃO FINALIZADA ###");
    }
}
