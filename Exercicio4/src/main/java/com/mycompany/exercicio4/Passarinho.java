package com.mycompany.exercicio4;

/**
 *
 * @author Gustavo
 */
public class Passarinho extends Animal{

    @Override
    public void emitirSom() {
        System.out.println("Piu Piu Piu");
    }

    @Override
    public void mover() {
        System.out.println("O passarinho voou.");
    }
    
}
