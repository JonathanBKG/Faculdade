/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_de_gestao_de_biblioteca;

/**
 *
 * @author Jonathan
 */
public class Livro {

    private int id;
    private String titulo;
    private String autor;
    private String editora;
    private String categoria;
    private String codigoIdentificador; //Um código interno da biblioteca (ex.: “LIV-0001”, “INF-023”)
    private String status; // disponível, emprestado, reservado, danificado, perdido

    public Livro(int id, String titulo, String autor, String editora, String categoria, String codigoIdentificador, String status) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.categoria = categoria;
        this.codigoIdentificador = codigoIdentificador;
        this.status = status;
    }

//-------------------------------------------------
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
//-------------------------------------------------
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
//-------------------------------------------------
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
//-------------------------------------------------
    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
//-------------------------------------------------
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
//-------------------------------------------------
    public String getCodigoIdentificador() {
        return codigoIdentificador;
    }

    public void setCodigoIdentificador(String codigoIdentificador) {
        this.codigoIdentificador = codigoIdentificador;
    }
//-------------------------------------------------
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
//-------------------------------------------------
// METODOS UTEIS PARA SIMPLIFICAR O MAIN ----------

    public boolean isDisponivel() {
        return "disponivel".equalsIgnoreCase(this.status);
    }

    public void marcarComoEmprestado() {
        this.status = "emprestado";
    }

    public void marcarComoDisponivel() {
        this.status = "disponivel";
    }

}
