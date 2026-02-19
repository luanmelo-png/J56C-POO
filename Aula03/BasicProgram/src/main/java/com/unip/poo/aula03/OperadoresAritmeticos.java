/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unip.poo.aula03;

/**
 *
 * @author nathan.silva
 */
public class OperadoresAritmeticos {
    
    public static void main(String[]args){
        int valor = 40 + 10;
        System.out.println("Valor = " + valor);

        int valor2 = valor - 10;
        System.out.println("Valor2 = " + valor2);

        int valor3 = valor2 * 2;
        System.out.println("Valor3 = " + valor3);

        float valor4 = valor3 / 8;
        System.out.println("Valor4 = " + valor4);

        float valor5 = valor4 % 2;
        System.out.println("Valor5 = " + valor5);
        
        float nota = 8.0f;
        System.out.println("nota++ = " + nota++);
        System.out.println("++nota = " + ++nota);
    }

    
}
