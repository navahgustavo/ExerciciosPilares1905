package com.mycompany.exercicio7;

/**
 *
 * @author Gustavo
 */
public class Programador extends Funcionario{
    
    public String linguagemPrincipal;

    public Programador(double salario, String linguagemPrincipal) {
        super(salario);
        this.linguagemPrincipal = linguagemPrincipal;
    }

    public String getLinguagemPrincipal() {
        return linguagemPrincipal;
    }

    public void setLinguagemPrincipal(String linguagemPrincipal) {
        this.linguagemPrincipal = linguagemPrincipal;
    }
    
}
