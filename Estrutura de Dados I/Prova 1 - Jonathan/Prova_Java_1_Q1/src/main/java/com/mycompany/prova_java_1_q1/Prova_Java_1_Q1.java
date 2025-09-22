/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prova_java_1_q1;
import java.util.Scanner;
/**
 *
 * @author Jonathan
 */
class Tcelular{
    String nome;
    Double valor;
}
public class Prova_Java_1_Q1 {

    public static void main(String[] args) {
        int qnt_cel = 5;
        
        Tcelular[] celular = new Tcelular[qnt_cel];
        Scanner teclado = new Scanner(System.in);
        
        for (int i = 0; qnt_cel > i; i++){
            celular[i] = new Tcelular();
            
            System.out.println("Digite o nome do modelo do "+ (i + 1) +" celular:");
            celular[i].nome = teclado.nextLine().toLowerCase();
            
            System.out.println("Qual o valor desse modelo?");
            celular[i].valor = teclado.nextDouble();
            teclado.nextLine();
        }
        
        System.out.println("Lista de celulares custo benefício (< 2000):");
        
        for (int i = 0; qnt_cel > i; i++){
            double preco_cel = celular[i].valor;
            if (preco_cel < 2000.00){
                System.out.println(celular[i].nome);
                System.out.println(celular[i].valor +"\n");
            }
        }
    }
}
