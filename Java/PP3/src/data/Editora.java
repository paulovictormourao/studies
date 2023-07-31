package data;
import java.util.ArrayList;


public class Editora{
    private String nomeEditora;
    private ArrayList<Livro> livrosEditora = new ArrayList<>();

    public Editora(String nomeEditora) {
        this.nomeEditora = nomeEditora;
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

        if (this.livrosEditora.size() == 0){
            return "Não foi encontrado nem um livro desta Editora";
        }

        else{
            for (Livro livro : this.livrosEditora) {
                retorno += "    " + livro.getTitulo() + "\n";
            }
        }

        return String.format("\n  {Livros Da Editora %s}\n%s\n", getNomeEditora(), retorno);
    }
}


