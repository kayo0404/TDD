/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.aula;

/**
 *
 * @author kayok
 */
public class Calculadora {
    public int somar(int a, int b){
       //throw new UnsupportedOperationException("Não implementado");
       return a + b;
    }
    public int subtrair(int a, int b){
        //throw new UnsupportedOperationException("Não implementado");
        return a - b;
    }
    public int multiplicar(int a, int b){
        //throw new UnsupportedOperationException("Não implementado");
        return a * b;
    }
    public double dividir(int a, int b){
        //    throw new UnsupportedOperationException("Nao implementado");
        if(b == 0){ 
              throw new IllegalArgumentException("Divisão por zero");
        }
        return a / b;
        
    }
}
