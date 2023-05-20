package com.mycompany.exercicio4;

/**
 *
 * @author Gustavo
 */
public class Exercicio4 {

    public static void main(String[] args) {
        
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();
        Animal passarinho = new Passarinho();
        
        cachorro.emitirSom();
        cachorro.mover();
        
        gato.emitirSom();
        gato.mover();

        passarinho.emitirSom();
        passarinho.mover();
        
    }
}
