package av3.data;

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


    @Override
    public String toString(){
        return String.format("""
                Título: %s
                Autor: %s
                """, getTitulo(), getAutor());
    }
}