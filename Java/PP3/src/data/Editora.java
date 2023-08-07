package data;
import business.ServicoLivro;
import user.Verifies;

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

    public void servicoEditora() {
        ServicoLivro servico = new ServicoLivro(this.nomeEditora, this.toString());
        servico.servicoOpen();

        System.out.println("Digite 1 para ler o conteudo");
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


