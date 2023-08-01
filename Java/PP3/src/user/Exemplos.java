package user;
import data.*;

// Classe de exemplos para ilustrar o programa

public class Exemplos {
    public static void exemplos( Autor[] listaDeAutores, Livro[] listaDeLivros, Editora[] listaDeEditoras){
        // Exemplos
        listaDeAutores[0] = new Autor("J.R.R Tolkien", "Britânico");
        listaDeAutores[1] = new Autor("Euclides", "Grego");
        listaDeAutores[2] = new Autor("Isaac Asimov", "Russo");

        listaDeEditoras[0] = new Editora("HarperCollins");
        listaDeEditoras[1] = new Editora("Editora Unesp");
        listaDeEditoras[2] = new Editora("Aleph");

        listaDeLivros[0] = new Livro("O Hobbit", listaDeAutores[0], listaDeEditoras[0]);
        LoopingPrincipal.addLivroEmAutorEditora(listaDeLivros[0], listaDeAutores[0], listaDeEditoras[0]);

        listaDeLivros[1] = new Livro("Os Elementos", listaDeAutores[1], listaDeEditoras[1]);
        LoopingPrincipal.addLivroEmAutorEditora(listaDeLivros[1], listaDeAutores[1], listaDeEditoras[1]);

        listaDeLivros[2] = new Livro("Fundação", listaDeAutores[2], listaDeEditoras[2]);
        LoopingPrincipal.addLivroEmAutorEditora(listaDeLivros[2], listaDeAutores[2], listaDeEditoras[2]);

        listaDeLivros[3] = new Livro("Eu robo", listaDeAutores[2], listaDeEditoras[2]);
        LoopingPrincipal.addLivroEmAutorEditora(listaDeLivros[3], listaDeAutores[2], listaDeEditoras[2]);
    }
}
