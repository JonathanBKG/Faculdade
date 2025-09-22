/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex05_classe_tamagushi;

/**
 *
 * @author Jonathan
 */
public class Tamagushi {
    private String  nome;
    private int     fome;
    private int     saude;
    private int     idade;

    public Tamagushi(String nome, int fome, int saude, int idade){
        this.nome   = nome;
        this.fome   = fome;
        this.saude  = saude;
        this.idade  = idade;
    }

    public void menu(){
        System.out.println("-----------------------------------");
        System.out.println("1 - Alterar Nome");
        System.out.println("2 - Alimentar Tamagushi");
        System.out.println("3 - Hora de dormir! (Passa 1 dia)");
        System.out.println("0 - Sair!");
        System.out.println("-----------------------------------");
    }

    public void alterarNome(String nome){
        this.nome = nome;
    }

    public void alterarFome(int fome) {
        this.fome = fome;
        
        if (this.fome < 0) this.fome = 0;
        if (this.fome > 10) this.fome = 10;
    }

    public void alterarSaude(int saude) {
        this.saude = saude;
        
        if (this.saude < 0) this.saude = 0;
        if (this.saude > 10) this.saude = 10;
    }

     // --- MÉTODOS PARA RETORNAR ---
    public String getNome() {
        return this.nome;
    }

    public int getFome() {
        return this.fome;
    }

    public int getSaude() {
        return this.saude;
    }

    public int getIdade() {
        return this.idade;
    }

    public String getHumor() {
        int humorScore = (this.fome + this.saude) / 2;

        if (humorScore >= 8) {
            return "Feliz :D";
        } else if (humorScore >= 5) {
            return "Normal :I";
        } else if (humorScore >= 2) {
            return "Triste :(";
        } else {
            return "Muito mal >:(";
        }
    }

    public void envelhecer(int anos) {
        int idadeFinal = this.idade + anos;
        
        while (this.idade < idadeFinal) {
            this.idade += 1;
            // A cada ano que passa, a fome e a saúde diminuem um pouco
            alterarFome(this.fome - 2);
            alterarSaude(this.saude - 1);
        }
    }

    public void alimentar(int quantidadeComida) {
        // Aumenta a fome (fica mais satisfeito)
        alterarFome(this.fome + quantidadeComida);
    }

    public void darCarinho() {
        // Aumenta a saúde
        alterarSaude(this.saude + 2);
    }



    public void mostrarStatus() {
        System.out.println("--------------------");
        System.out.println("Status de " + this.nome + ":\n");
        System.out.println("Nome: " + this.nome);
        System.out.println("Fome: " + this.fome + "/10");
        System.out.println("Saude: " + this.saude + "/10");
        System.out.println("Idade: " + this.idade + " anos");
        System.out.println("Humor: " + getHumor());
        System.out.println("---------------------");
    }
}
