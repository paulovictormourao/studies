package av3.business;

import java.util.Formatter;

public abstract class Servicos {
    private String conteudo;
    private String nome;

    public Servicos (String nome, String conteudo){
        this.nome = nome;
        this.conteudo = conteudo;


    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public abstract void servicoOpen(String nome, String conteudo);

}
