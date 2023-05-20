package com.mycompany.exercicio1;

/**
 *
 * @author Gustavo
 */
public class Circulo extends Shape{

    @Override
    public double calcularArea() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double calcularPerimetro() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }    
       
    public double calcularArea(double raio) {
        return Math.PI * (raio * raio);
    }
    
    public double calcularPerimetro(double raio) {
        return 2 * Math.PI * raio;
    }

}
