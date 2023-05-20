package com.mycompany.exercicio1;

/**
 *
 * @author Gustavo
 */
public class Exercicio1 {

    public static void main(String[] args) {
        
        Retangulo retangulo = new Retangulo();
        System.out.println(retangulo.calcularArea(10, 5));
        System.out.println(retangulo.calcularPerimetro(10, 5));
        
        Circulo circulo = new Circulo();
        System.out.println(circulo.calcularArea(5));
        System.out.println(circulo.calcularPerimetro(5));
        
        Triangulo triangulo = new Triangulo();
        System.out.println(triangulo.calcularArea(3));
        System.out.println(triangulo.calcularArea(4, 8));
        System.out.println(triangulo.calcularArea(5, 6, 9));
        System.out.println(triangulo.calcularPerimetro(5, 6, 9));
        
    }
}
