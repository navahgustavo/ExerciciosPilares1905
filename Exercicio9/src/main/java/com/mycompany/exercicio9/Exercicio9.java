package com.mycompany.exercicio9;

/**
 *
 * @author Gustavo
 */
public class Exercicio9 {

    public static void main(String[] args) {
        
        Instrumento instrumento = new Violao();
        instrumento.tocar();
        instrumento = new Piano();
        instrumento.tocar();
        instrumento = new Bateria();
        instrumento.tocar();
        
    }
}
