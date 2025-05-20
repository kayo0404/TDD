package com.aula;

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
