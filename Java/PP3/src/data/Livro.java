package data;

import business.ServicoLivro;
import user.Verifies;

public class Livro {
    private String titulo;
    private Autor autor;
    private Editora editora;

    public Livro(String titulo, Autor autor, Editora editora)  {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo()	{
    	return this.titulo;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Autor getAutor()	{
    	return this.autor;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public Editora getEditora() {
        return editora;
    }

    public void servicoLivro(){
        ServicoLivro servico = new ServicoLivro(this.titulo, this.toString());
        servico.servicoOpen();

        System.out.println("Digite 1 para ler o livro");
        System.out.println("Digite 2 para adicionar conteúdo");
        System.out.println("Digite 0 para sair");

        int choice = 0;

        boolean looping = true;

        while (looping) {

            choice = Verifies.verify(3);

            switch (choice) {

                case (1) -> servico.servicoRead();

                case (2) -> servico.servicoAdd();

                case (0) -> looping = false;
            }

        }
    }

    @Override
    public String toString(){
        return String.format("""
                Título: %s
                Autor: %s
                """, getTitulo(), getAutor().getNomeAutor());
    }
}