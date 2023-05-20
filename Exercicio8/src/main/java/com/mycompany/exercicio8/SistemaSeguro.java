package com.mycompany.exercicio8;

/**
 *
 * @author Gustavo
 */
public class SistemaSeguro implements Autenticavel {

    private boolean autenticacao;

    public SistemaSeguro(boolean autenticacao) {
        this.autenticacao = autenticacao;
    }

    public boolean isAutenticacao() {
        return autenticacao;
    }

    public void setAutenticacao(boolean autenticacao) {
        this.autenticacao = autenticacao;
    }

    @Override
    public void autenticar() {
        this.autenticacao = true;
    }

    @Override
    public void desautenticar() {
        this.autenticacao = false;
    }
    
}
