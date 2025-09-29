/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contas;

/**
 *
 * @author Jonathan
 */

public class ListaClientes {
    private List<Cliente> cliente;   

    public ListaClientes(){
        cliente = new ArrayList<Cliente>();
    }

    public void addClientes(Cliente cli){
        cliente.add(cli);
    }

    public void imprimeClientes(){
        for(Cliente cli:cliente){
            System.out.println(cli);
        }
    }
}
9
ArrayL