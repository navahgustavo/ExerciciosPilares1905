package com.mycompany.exercicio2;

/**
 *
 * @author Gustavo
 */
public abstract class Conta {
    
    private double saldo;
    private String titular;

    public Conta(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public abstract void sacar (double valor);
    
    public abstract void depositar (double valor);
    
    public abstract void exibirSaldo ();
    
}
