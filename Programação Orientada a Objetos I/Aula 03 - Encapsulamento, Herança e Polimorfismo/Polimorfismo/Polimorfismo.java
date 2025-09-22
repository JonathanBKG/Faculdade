/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.polimorfismo;

/**
 *
 * @author Jonathan
 */
public class Polimorfismo {

    public static void main(String[] args) {
        Animal meuAnimal; // Criamos uma referência do tipo Animal

        meuAnimal = new Cachorro(); // Agora, ela aponta para um objeto Cachorro
        meuAnimal.emiteSom(); // -> SAÍDA: Au Au!

        meuAnimal = new Gato(); // Agora, a MESMA referência aponta para um Gato
        meuAnimal.emiteSom(); // -> SAÍDA: Miau!
        
        meuAnimal = new Galinha();
        meuAnimal.emiteSom();
    }
}
