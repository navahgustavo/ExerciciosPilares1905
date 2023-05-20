package com.mycompany.exercicio10;

/**
 *
 * @author Gustavo
 */
public class Exercicio10 {

    public static void main(String[] args) {
        
        Livro livro = new Livro("As Longas Tranças de Um Careca", 99.99, "Careco Calvino");
        Eletronico eletronico = new Eletronico("Barbeador", 79.99, "Philips");
        Roupa roupa = new Roupa("Calça Boca de Sino", 300.99, "G");
        
        System.out.println(livro + "\n\n" + eletronico + "\n\n" + roupa);
        
    }
}
