import business.*;
import data.*;
import user.*;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        boolean looping = true;
        Autor[] listaDeAutores = new Autor[1000];
        Livro[] listaDeLivros = new Livro[1000];
        Editora[] listaDeEditoras = new Editora[1000];

        // Exemplos
        listaDeAutores[0] = new Autor("J.R.R Tolkien", "Britânico");
        listaDeAutores[1] = new Autor("Euclides", "Grego");
        listaDeAutores[2] = new Autor("Isaac Asimov", "Russo");

        listaDeEditoras[0] = new Editora("HarperCollins");
        listaDeEditoras[1] = new Editora("Editora Unesp");
        listaDeEditoras[2] = new Editora("Aleph");

        listaDeLivros[0] = new Livro("O Hobbit", listaDeAutores[0], listaDeEditoras[0]);
        addLivroEmAutorEditora(listaDeLivros[0], listaDeAutores[0], listaDeEditoras[0]);

        listaDeLivros[1] = new Livro("Os Elementos", listaDeAutores[1], listaDeEditoras[1]);
        addLivroEmAutorEditora(listaDeLivros[1], listaDeAutores[1], listaDeEditoras[1]);

        listaDeLivros[2] = new Livro("Fundação", listaDeAutores[2], listaDeEditoras[2]);
        addLivroEmAutorEditora(listaDeLivros[2], listaDeAutores[2], listaDeEditoras[2]);

        listaDeLivros[3] = new Livro("Eu robo", listaDeAutores[2], listaDeEditoras[2]);
        addLivroEmAutorEditora(listaDeLivros[3], listaDeAutores[2], listaDeEditoras[2]);
        // Fim dos Exemplos

        while (looping) {
            System.out.println("Digite 1 para fazer um registro de Autor, Editora, ou Livro");

            int choice = Verifies.verify(4);

            switch (choice) {

                case (0) -> looping = false;

                case (1) -> {
                    int choice2 =  Verifies.verify(4);
                    Registrar.registrar(choice2);
                }
            }
        }
    }

    public static void addLivroEmAutorEditora(Livro livro, Autor autor, Editora editora) {
        autor.addLivros(livro);
        editora.addLivro(livro);
    }



}