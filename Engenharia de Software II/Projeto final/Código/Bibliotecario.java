/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_de_gestao_de_biblioteca;

/**
 *
 * @author Jonathan
 */
public class Bibliotecario {

    private int    id;
    private String nome;
    private String login;
    private String senha;

    public Bibliotecario(int id, String nome, String login, String senha){
        this.id   = id;
        this.nome  = nome;
        this.login = login;
        this.senha = senha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

//-------------------------------------------------

    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

//-------------------------------------------------
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
//-------------------------------------------------
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
//-------------------------------------------------
    public boolean autenticar(String login, String senha) {
        return this.login.equals(login) && this.senha.equals(senha);
    }

}
