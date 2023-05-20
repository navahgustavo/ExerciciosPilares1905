package com.mycompany.exercicio10;

/**
 *
 * @author Gustavo
 */
public class Roupa extends Produto{
    
    private String tamanho;

    public Roupa(String nome, double preco, String tamanho) {
        super(nome, preco);
        this.tamanho = tamanho;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    
    @Override
    public String toString() {
        return "Peça de roupa: " + getNome() + "\nTamanho: " + tamanho + "\nR$: " + getPreco();
    }
}
