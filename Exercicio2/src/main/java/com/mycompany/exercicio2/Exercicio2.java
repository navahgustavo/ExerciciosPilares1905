package com.mycompany.exercicio2;

/**
 *
 * @author Gustavo
 */
public class Exercicio2 {

    public static void main(String[] args) {
        
        ContaBancaria conta = new ContaBancaria(100, "Roger");
        
        conta.exibirSaldo();
        conta.depositar(20);
        conta.sacar(10);
        conta.exibirSaldo();
        
    }
}
