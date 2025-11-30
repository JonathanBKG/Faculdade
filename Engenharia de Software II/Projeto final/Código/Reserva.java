/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_de_gestao_de_biblioteca;

/**
 *
 * @author Jonathan
 */
public class Reserva {

    private int id;
    private Usuario usuario;
    private Livro livro;
    private String dataReserva;
    private String status; // Ativa, Cancelada, Atendida, Expirada

    public Reserva(int id, Usuario usuario, Livro livro, String dataReserva, String status) {
        this.id = id;
        this.usuario = usuario;
        this.livro = livro;
        this.dataReserva = dataReserva;
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
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
//-------------------------------------------------
    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }
//-------------------------------------------------
    public String getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(String dataReserva) {
        this.dataReserva = dataReserva;
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
    public void cancelar() {
        this.status = "Cancelada";
    }

    public void ativar() {
        this.status = "Ativa";
    }

    public void atender() {
        this.status = "Atendida";
    }
}
