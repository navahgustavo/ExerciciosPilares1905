package com.mycompany.exercicio10;

/**
 *
 * @author Gustavo
 */
public class Eletronico extends Produto{
    
    private String marca;

    public Eletronico(String nome, double preco, String marca) {
        super(nome, preco);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    @Override
    public String toString() {
        return "Eletronico: " + getNome() + "\nMarca: " + marca + "\nR$: " + getPreco();
    }
    
}
