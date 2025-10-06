/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contas;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jonathan
 */

public class ListaClientes {
    private ArrayList<Cliente> clientes;   

    public ListaClientes(){
        clientes = new ArrayList<Cliente>();
    }

    public void addClientes(Cliente cli){
        clientes.add(cli);
    }

    public void imprimeClientes(){
        for(Cliente cli:clientes){
            System.out.println(cli);
        }
    }
}
