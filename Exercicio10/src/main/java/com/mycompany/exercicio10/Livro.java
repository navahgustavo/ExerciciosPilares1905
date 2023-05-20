package com.mycompany.exercicio10;

/**
 *
 * @author Gustavo
 */
public class Livro extends Produto{
    
    private String autor;

    public Livro(String nome, double preco, String autor) {
        super(nome, preco);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Livro: " + getNome() + "\nAutor: " + autor + "\nR$: " + getPreco();
    }
    
}
