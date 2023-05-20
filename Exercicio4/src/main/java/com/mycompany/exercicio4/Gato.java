package com.mycompany.exercicio4;

/**
 *
 * @author Gustavo
 */
public class Gato extends Animal{

    @Override
    public void emitirSom() {
        System.out.println("Miau Miau Miau");
    }

    @Override
    public void mover() {
        System.out.println("O gato pulou.");
    }
    
}
