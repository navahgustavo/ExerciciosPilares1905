package com.mycompany.exercicio2;

/**
 *
 * @author Gustavo
 */
public class ContaBancaria extends Conta{

    public ContaBancaria(double saldo, String titular) {
        super(saldo, titular);
    }
    
    @Override
    public void sacar(double valor) {
        double saldoConta = getSaldo();
        
        if (valor <= saldoConta && valor > 0) {
            setSaldo(saldoConta - valor);
            System.out.println("R$ " + valor + " sacado com sucesso.");
        } else if (valor <= 0) {
            System.out.println("O valor a ser sacado não pode ser zero ou negativo.");
        } else {
            System.out.println("Saldo disponível insuficiente.");
        }
        
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            double saldoConta = getSaldo();
            setSaldo(getSaldo() + valor);
            System.out.println("R$ " + valor + " depositados com sucesso.");
        } else {
            System.out.println("O valor depositado não pode ser zero ou menor.");
        }
        
    }

    @Override
    public void exibirSaldo() {
        System.out.println("O saldo atual é R$ " + getSaldo());
    }
    
}
