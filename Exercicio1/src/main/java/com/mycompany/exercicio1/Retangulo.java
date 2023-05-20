package com.mycompany.exercicio1;

/**
 *
 * @author Gustavo
 */
public class Retangulo extends Shape{
    
    @Override
    public double calcularArea() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double calcularPerimetro() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }    
    
    public double calcularArea(double base, double altura) {
        return base * altura;
    }
    
    public double calcularPerimetro(double base, double altura) {
        return base * 2 + altura * 2;
    }

}
