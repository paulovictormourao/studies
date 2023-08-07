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
            System.out.println("Digite 1 para ir para o menu de exibição");
            System.out.println("Digite 2 para ir para o menu de registro");
            System.out.println("Digite 3 para ir para o menu de remoção");
            System.out.println("Digite 4 para ir para o menu de servico");
            System.out.println("Digite 0 para sair");


            int choice = Verifies.verify(5);

            switch (choice) {

                case (0) -> looping = false;

                case (1) -> Funcoes.exibir(listaDeAutores, listaDeLivros, listaDeEditoras);

                case (2) -> Funcoes.registrar(listaDeAutores, listaDeLivros, listaDeEditoras);

                case (3) -> Funcoes.remove(listaDeAutores, listaDeLivros, listaDeEditoras);

                case (4) -> {
                    Funcoes.servico(listaDeLivros, listaDeEditoras);
                }
            }
        }
    }
}
