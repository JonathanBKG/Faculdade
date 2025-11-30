/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_de_gestao_de_biblioteca;

/**
 *
 * @author Jonathan
 */
public class Emprestimo {
    
    private int id;
    private String dataEmprestimo;
    private String dataDevolucao;
    private String status; // Ativo, Devolvido, Atrasado
    private double multa;  // 0.0 se não tiver multa
    private Livro livro;
    private Usuario usuario;

    public Emprestimo(int id, 
                      String dataEmprestimo, 
                      String dataDevolucao, 
                      String status, 
                      double multa, 
                      Livro livro, 
                      Usuario usuario) {
        this.id = id;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.status = status;
        this.multa = multa;
        this.livro = livro;
        this.usuario = usuario;
    }

//-------------------------------------------------
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
//-------------------------------------------------
    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }
//-------------------------------------------------
    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
//-------------------------------------------------
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
//-------------------------------------------------
    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }
//-------------------------------------------------
    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }
//-------------------------------------------------
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
//-------------------------------------------------
// METODO UTIL PARA SIMPLIFICAR O MAIN ------------

    public void registrarDevolucao(String novaDataDevolucao, double novaMulta) {
        this.dataDevolucao = novaDataDevolucao;
        this.multa = novaMulta;
        this.status = "Devolvido";
        this.livro.marcarComoDisponivel(); // usa o método da classe Livro
    }
}
