package user;
import data.*;
import java.util.ArrayList;

// Classe de exemplos para ilustrar o programa

public class Exemplos {
    public static void exemplos( ArrayList<Autor> listaDeAutores, ArrayList<Livro> listaDeLivros, ArrayList<Editora> listaDeEditoras){
        // Exemplos
        listaDeAutores.add(new Autor("J.R.R Tolkien", "Britânico"));
        listaDeAutores.add(new Autor("Euclides", "Grego"));
        listaDeAutores.add(new Autor("Isaac Asimov", "Russo"));

        listaDeEditoras.add(new Editora("HarperCollins"));
        listaDeEditoras.add(new Editora("Editora Unesp"));
        listaDeEditoras.add(new Editora("Aleph"));

        listaDeLivros.add(new Livro("O Hobbit", listaDeAutores.get(0), listaDeEditoras.get(0)));
        Funcoes.addLivroEmAutorEditora(listaDeLivros.get(0), listaDeAutores.get(0), listaDeEditoras.get(0));

        listaDeLivros.add(new Livro("Os Elementos", listaDeAutores.get(1), listaDeEditoras.get(1)));
        Funcoes.addLivroEmAutorEditora(listaDeLivros.get(1), listaDeAutores.get(1), listaDeEditoras.get(1));

        listaDeLivros.add(new Livro("Fundação", listaDeAutores.get(2), listaDeEditoras.get(2)));
        Funcoes.addLivroEmAutorEditora(listaDeLivros.get(2), listaDeAutores.get(2), listaDeEditoras.get(2));

        listaDeLivros.add(new Livro("Eu robo", listaDeAutores.get(2), listaDeEditoras.get(2)));
        Funcoes.addLivroEmAutorEditora(listaDeLivros.get(3), listaDeAutores.get(2), listaDeEditoras.get(2));
    }

}
