package com.mycompany.exercicio8;

/**
 *
 * @author Gustavo
 */
public class Exercicio8 {

    public static void main(String[] args) {
        
        SistemaSeguro sistema = new SistemaSeguro(true);
        
        sistema.desautenticar();
        System.out.println(sistema.isAutenticacao());
        sistema.autenticar();
        System.out.println(sistema.isAutenticacao());
        
    }
}
