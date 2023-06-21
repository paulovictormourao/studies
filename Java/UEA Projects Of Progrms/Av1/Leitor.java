package Av1;

import java.util.ArrayList;

public class Leitor {
    private String nomeLeitor;
    private ArrayList<Livro> livrosEmprestados = new ArrayList<>();
    
    public Leitor(String nome_do_leitor) {
    	this.nomeLeitor = nome_do_leitor;
    }
    
    
    public String getNomeleitor()	{
    	return this.nomeLeitor;
    }
    
    public void emprestarLivro(String titulo_do_livro, Autor autor)	{
    	livrosEmprestados.add(new Livro(titulo_do_livro, autor));
    }
    
    public String exibirLista()	{
    	String retorno = "Lista de Livros Emprestados:\n";
    	for (int i = 0; i < this.livrosEmprestados.size(); i++)	{
    		retorno += "Livro: "+this.livrosEmprestados.get(i).getTitulo();
    	}
    	return retorno;
    }
     
}
