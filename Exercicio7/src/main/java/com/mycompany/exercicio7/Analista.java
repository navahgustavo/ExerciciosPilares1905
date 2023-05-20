package com.mycompany.exercicio7;

/**
 *
 * @author Gustavo
 */
public class Analista extends Funcionario{
    
    private String especializacao;

    public Analista(double salario, String especializacao) {
        super(salario);
        this.especializacao = especializacao;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }
    
}
