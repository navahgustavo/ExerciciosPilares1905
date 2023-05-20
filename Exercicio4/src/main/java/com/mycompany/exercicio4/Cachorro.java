package com.mycompany.exercicio4;

/**
 *
 * @author Gustavo
 */
public class Cachorro extends Animal{

    @Override
    public void emitirSom() {
        System.out.println("Au Au Au");
    }

    @Override
    public void mover() {
        System.out.println("O cachorro correu.");
    }
    
}
