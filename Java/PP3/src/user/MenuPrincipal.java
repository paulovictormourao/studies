package user;

import data.Autor;
import data.Editora;
import data.Livro;
import java.util.ArrayList;

public class MenuPrincipal {

    public static void looping() {
        boolean looping = true;
        ArrayList<Autor> listaDeAutores = new ArrayList<>();
        ArrayList<Livro> listaDeLivros = new ArrayList<>();
        ArrayList<Editora> listaDeEditoras = new ArrayList<>();

        Exemplos.exemplos(listaDeAutores, listaDeLivros, listaDeEditoras);

        while (looping) {
            System.out.println("Digite 1 para exibir Autor, Editora, ou Livro registrados");
            System.out.println("Digite 2 para fazer um registro de Autor, Editora, ou Livro");
            System.out.println("Digite 0 para sair");


            int choice = Verifies.verify(4);

            switch (choice) {

                case (0) -> looping = false;

                case (1) -> Funcoes.exibir(listaDeAutores, listaDeLivros, listaDeEditoras);

                case (2) -> Funcoes.registrar(listaDeAutores, listaDeLivros, listaDeEditoras);


            }
        }
    }
}
