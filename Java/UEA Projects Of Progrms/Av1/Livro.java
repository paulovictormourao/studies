package Av1;

import java.util.ArrayList;

public class Livro {
    private String tituloLivro;
    private Autor autorLivro;
    private ArrayList<Leitor> leitores = new ArrayList<>();

    public Livro(String tituloLivro, Autor autorLivro)  {
        this.tituloLivro = tituloLivro;
        this.autorLivro = autorLivro;
    }
    
    public String getTitulo()	{
    	return this.tituloLivro;
    }
    
    public Autor getAutor()	{
    	return this.autorLivro;
    }
    

}