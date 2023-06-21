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
    
    public void emprestarLivro(Livro livroEmprestado)	{
    	livrosEmprestados.add(livroEmprestado);
    }
    
    public String exibirLista() {
        String retorno = "";

        if (this.livrosEmprestados.size() > 0){
            retorno = "\n        {Livros Emprestados}\n";

            for (int i = 0; i < this.livrosEmprestados.size(); i++) {
            retorno += "    " + this.livrosEmprestados.get(i).getTitulo() + "\n";
            }
        }

    	return retorno;
    }
     
}
