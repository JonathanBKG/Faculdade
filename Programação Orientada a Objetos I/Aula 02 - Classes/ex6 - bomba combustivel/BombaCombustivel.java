/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex06_classe_bomba_combustivel;

/**
 *
 * @author Jonathan
 */
public class BombaCombustivel {
    public static class Tanque {
        private String tipoCombustivel;
        private double valorPorUnidade;
        private double quantidade;
        private String unidadeMedida; // "litros" ou "m³"

        public Tanque(String tipo, double valor, double qtd, String unidade) {
            this.tipoCombustivel = tipo;
            this.valorPorUnidade = valor;
            this.quantidade = qtd;
            this.unidadeMedida = unidade;
        }

        public String getTipoCombustivel() { return tipoCombustivel; }
        public double getValorPorUnidade() { return valorPorUnidade; }
        public double getQuantidade() { return quantidade; }
        public String getUnidadeMedida() { return unidadeMedida; }
    }

    // --- ATRIBUTOS DA BOMBA PRINCIPAL ---
    private Tanque[] tanques; 
    private int numeroDeTanques; // Contador para saber quantos tanques temos
    private Tanque tanqueSelecionado;


    public BombaCombustivel() {
        this.tanques = new Tanque[10]; // Cria um vetor com espaço para 10 tanques
        this.numeroDeTanques = 0; // Começa com zero tanques adicionados
        this.tanqueSelecionado = null;
    }

    // --- MÉTODOS DA BOMBA ---
    public void adicionarTanque(Tanque novoTanque) {
        // Verifica se ainda há espaço no vetor
        if (numeroDeTanques < tanques.length) {
            this.tanques[numeroDeTanques] = novoTanque;
            this.numeroDeTanques++;
            
            if (this.tanqueSelecionado == null) {
                this.tanqueSelecionado = novoTanque;
            }
        } else {
            System.out.println("Erro: Nao e possivel adicionar mais tanques.");
        }
    }

    public Tanque[] getTanques() {
        return this.tanques;
    }
    
    public int getNumeroDeTanques() {
        return this.numeroDeTanques;
    }
    
    public Tanque getTanqueSelecionado() {
        return this.tanqueSelecionado;
    }

    public boolean selecionarCombustivel(int indice) {
        if (indice >= 0 && indice < numeroDeTanques) {
            this.tanqueSelecionado = tanques[indice];
            System.out.println("Bomba alterada para: " + tanqueSelecionado.tipoCombustivel);
            return true;
        }
        System.out.println("Selecao invalida!");
        return false;
    }

    public void abastecerPorValor(double valor) {
        if (tanqueSelecionado == null) {
            System.out.println("Erro: Nenhum combustivel selecionado.");
            return;
        }
        double quantidadeAbastecida = valor / tanqueSelecionado.valorPorUnidade;

        if (quantidadeAbastecida <= tanqueSelecionado.quantidade) {
            tanqueSelecionado.quantidade -= quantidadeAbastecida;
            System.out.printf("Abastecimento concluido! Foram colocados %.2f %s de %s.\n",
                quantidadeAbastecida, tanqueSelecionado.unidadeMedida, tanqueSelecionado.tipoCombustivel);
        } else {
            System.out.printf("Nao ha combustivel suficiente. Disponivel: %.2f %s.\n",
                tanqueSelecionado.quantidade, tanqueSelecionado.unidadeMedida);
        }
    }

    public void abastecerPorUnidade(double quantidade) {
         if (tanqueSelecionado == null) {
            System.out.println("Erro: Nenhum combustivel selecionado.");
            return;
        }
        if (quantidade <= tanqueSelecionado.quantidade) {
            double valorAPagar = quantidade * tanqueSelecionado.valorPorUnidade;
            tanqueSelecionado.quantidade -= quantidade;
            System.out.printf("Abastecimento concluido! Valor a pagar: R$ %.2f.\n", valorAPagar);
        } else {
            System.out.printf("Nao ha combustivel suficiente. Disponivel: %.2f %s.\n",
                tanqueSelecionado.quantidade, tanqueSelecionado.unidadeMedida);
        }
    }

    public void alterarValor(double novoValor) {
        if (tanqueSelecionado != null) {
            tanqueSelecionado.valorPorUnidade = novoValor;
            System.out.printf("Valor do %s alterado para R$ %.2f.\n", tanqueSelecionado.tipoCombustivel, novoValor);
        }
    }

    public void alterarQuantidade(double novaQuantidade) {
        if (tanqueSelecionado != null) {
            tanqueSelecionado.quantidade = novaQuantidade;
            System.out.printf("Quantidade de %s alterada para %.2f %s.\n",
                tanqueSelecionado.tipoCombustivel, novaQuantidade, tanqueSelecionado.unidadeMedida);
        }
    }
}
