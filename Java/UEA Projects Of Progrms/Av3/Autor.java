package Av3;

import Av1.Livro;

import java.util.ArrayList;

public class Autor {

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
    	String retorno = "Lista de Livros:\n";
    	for (int i = 0; i < this.livros.size(); i++)	{
    		retorno += "Livro: "+this.livros.get(i).getTitulo() + "\n";
    	}
    	return retorno;
    }

    @Override
    public String toString(){
        return String.format("Author: %s\n" +
                      "Nacionalidade %s\n" +
                      "%s", getNomeAutor(), getNacionalidade(), obterLivros());
    }
}
