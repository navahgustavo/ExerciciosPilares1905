package com.mycompany.exercicio7;

/**
 *
 * @author Gustavo
 */
public class Gerente extends Funcionario{
    
    private String setor;

    public Gerente(double salario, String setor) {
        super(salario);
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
    
}
