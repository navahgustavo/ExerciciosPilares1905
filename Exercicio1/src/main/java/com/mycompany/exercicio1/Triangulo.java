package com.mycompany.exercicio1;

/**
 *
 * @author Gustavo
 */
public class Triangulo extends Shape{
    
    @Override
    public double calcularArea() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double calcularPerimetro() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }    
    
    public double calcularArea(double ladoEquilatero) {
        return ((ladoEquilatero * ladoEquilatero) * Math.sqrt(3)) / 4;
    }
    
    public double calcularArea(double baseIsoceles, double alturaIsoceles) {
        return (baseIsoceles * alturaIsoceles) / 2;
    }
    
    public double calcularArea(double ladoA, double ladoB, double ladoC) {
        double s = (ladoA + ladoB + ladoC) / 2;
        return Math.sqrt(s * (s - ladoA) * (s - ladoB) * (s - ladoC));
    }
    
    public double calcularPerimetro(double ladoA, double ladoB, double ladoC) {
        return ladoA + ladoB + ladoC;
    }

    
}
