package Av3;
import Av1.Livro;
import java.util.ArrayList;


public class Editora{
    private String nomeEditora;
    private ArrayList<Av1.Livro> livrosEditora = new ArrayList<>();

    public Editora(String nome_do_leitor) {
        this.nomeEditora = nome_do_leitor;
    }

    public void setNomeEditora(String nomeEditora) {
        this.nomeEditora = nomeEditora;
    }

    public String getNomeEditora() {
        return this.nomeEditora;
    }

    public void addLivro(Livro livroAdicionado) {
        livrosEditora.add(livroAdicionado);
    }

    @Override
    public String toString(){
        String retorno = "";

        if (this.livrosEditora.size() > 0){
            for (Livro livro : this.livrosEditora) {
                retorno += "    " + livro.getTitulo() + "\n";
            }
        }

        else{
            retorno = "Não foi encontrado nem um livro desta Editora";
        }

        return String.format("\n        {Livros Da Editora %s}\n%s", getNomeEditora(), retorno);
    }
}


