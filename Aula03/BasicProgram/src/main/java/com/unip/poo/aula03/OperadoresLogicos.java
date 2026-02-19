/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unip.poo.aula03;

/**
 *
 * @author nathan.silva
 */
public class OperadoresLogicos {
    public static void main(String[]args){
        
        boolean temDesconto = false, possuiIdentidade = false, pcd = true;
        int idade = 0;      
        
        idade = 60; possuiIdentidade = true;
        temDesconto = (idade >= 60) && (possuiIdentidade);
        System.out.println("Aplica desconto: " + temDesconto);
        
               
        idade = 12; possuiIdentidade = true;
        temDesconto = (idade >= 60) && (possuiIdentidade);
        System.out.println("Aplica desconto: " + temDesconto);
        
        idade=14; possuiIdentidade = false; 
        temDesconto = ((idade >= 60) && (possuiIdentidade)) ^ pcd;   
        System.out.println("Aplica desconto: " + temDesconto);       
        
    }
}
