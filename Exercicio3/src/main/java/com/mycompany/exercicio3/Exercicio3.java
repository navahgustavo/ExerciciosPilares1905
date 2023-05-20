package com.mycompany.exercicio3;

/**
 *
 * @author Gustavo
 */
public class Exercicio3 {

    public static void main(String[] args) {
        
        Carro carro = new Carro();
        Moto moto = new Moto();
        Caminhao caminhao = new Caminhao();
        
        carro.acelerar();
        moto.acelerar();
        caminhao.acelerar();
        
        carro.frear();
        moto.frear();
        caminhao.frear();
        
    }
}
