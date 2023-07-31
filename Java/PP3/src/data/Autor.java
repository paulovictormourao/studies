package data;

import java.util.ArrayList;

public class Autor{

    private String nomeAutor, nacionalidadeAutor;
    private ArrayList<Livro> livros = new ArrayList<>();

    public Autor(String nome, String nacionalidade) {
        this.nomeAutor = nome;
        this.nacionalidadeAutor = nacionalidade;
    }


    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }


    public void setNacionalidadeAutor(String nacionalidadeAutor) {
        this.nacionalidadeAutor = nacionalidadeAutor;
    }

    public String getNacionalidade()	{
    	return this.nacionalidadeAutor;
    }


    public void addLivros(Livro livro)	{
    	livros.add(livro);
    }
    
    public String obterLivros()	{
    	StringBuilder retorno = new StringBuilder("Lista de Livros:\n");
    	for (int i = 0; i < this.livros.size(); i++)	{
    		retorno.append(i+1).append("] ").append(this.livros.get(i).getTitulo()).append("\n");
    	}
    	return retorno.toString();
    }

    @Override
    public String toString(){
        return String.format("""
                Author: %s
                Nacionalidade %s
                %s
                """, getNomeAutor(), getNacionalidade(), obterLivros());
    }
}
