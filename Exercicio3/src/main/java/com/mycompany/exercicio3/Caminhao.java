package com.mycompany.exercicio3;

/**
 *
 * @author Gustavo
 */
public class Caminhao implements Veiculo{

    @Override
    public void acelerar() {
        System.out.println("O caminhao está acelerando.");
    }

    @Override
    public void frear() {
        System.out.println("O caminhao está freando.");
    }
    
}
