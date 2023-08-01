package user;

import data.Autor;
import data.Editora;
import data.Livro;

import java.util.Scanner;

public class LoopingPrincipal {

    public void Looping(){
        boolean looping = true;
        Autor[] listaDeAutores = new Autor[1000];
        Livro[] listaDeLivros = new Livro[1000];
        Editora[] listaDeEditoras = new Editora[1000];


        while (looping) {
            System.out.println("Digite 1 para fazer um registro de Autor, Editora, ou Livro");
            System.out.println("Digite 0  para Sair");
            int choice = Verifies.verify(4);

            switch (choice) {

                case (0) -> looping = false;

                case (1) -> {



                }

            }
        }
    }

    public static void addLivroEmAutorEditora(Livro livro, Autor autor, Editora editora) {
        autor.addLivros(livro);
        editora.addLivro(livro);
    }

}
