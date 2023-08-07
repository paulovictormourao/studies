package user;
import data.*;
import business.*;


import java.util.Scanner;
import java.util.ArrayList;

public class Funcoes {

    // Registro
    public static void registrar(ArrayList<Autor> listaDeAutores,
        ArrayList<Livro> listaDeLivros, ArrayList<Editora> listaDeEditoras,
        ArrayList<String> reservados, ArrayList<String> emprestados){


        System.out.println("1] Registro de Autor");
        System.out.println("2] Registro de Editora");
        System.out.println("3] Registro de Livro");
        System.out.println("4] Reserva de Livro");
        System.out.println("5] Emprestimo de Livro");
        System.out.println("0] Para Sair");

        Scanner input = new Scanner(System.in);

        int choice =  Verifies.verify(6);

        switch (choice) {

            case (0) -> {
            }

            case (1) -> {
                System.out.println("Digite o nome do Autor");
                String nomeAutor = input.nextLine();

                System.out.println("Digite a Nacionalidade do Autor");
                String nacionalidade = input.nextLine();

                listaDeAutores.add(new Autor(nomeAutor, nacionalidade));
            }

            case (2) -> {
                System.out.println("Digite o nome da Editora");
                String nomeEditora = input.nextLine();

                listaDeEditoras.add(new Editora(nomeEditora));
            }

            case (3) -> {

                // Lista os Autores Registrados, e pede para selecionar um deles
                for (int i = 0; i < listaDeAutores.size(); i++) {
                    System.out.println(i + "] " + listaDeAutores.get(i).getNomeAutor());
                }
                System.out.println("\nSelecione o Numero do Autor do Livro");
                int autorNum = Verifies.verify(listaDeAutores.size());


                // Lista as Editoras Registradas, e pede para selecionar uma delas
                for (int i = 0; i < listaDeEditoras.size(); i++) {
                    System.out.println(i + "] " + listaDeEditoras.get(i).getNomeEditora());
                }
                System.out.println("\nSelecione o Numero da Editora do Livro");
                int editoraNum = Verifies.verify(listaDeAutores.size());


                // Pergunta o Titulo do Livro
                System.out.println("Digite o nome do Livro");
                String titulo = input.nextLine();

                // Cria o Livro
                Livro livro = new Livro(titulo, listaDeAutores.get(autorNum),
                        listaDeEditoras.get(editoraNum));

                // Adiciona o Livro na Lista de livros
                listaDeLivros.add(livro);

                // Adiciona o livro na Lista de Livros escritos pelo Autor, e na Lista de livros
                //publicados pela Editora
                addLivroEmAutorEditora(livro, listaDeAutores.get(autorNum),
                        listaDeEditoras.get(editoraNum));
            }

            case (4) -> {
                for (int i = 0; i < listaDeLivros.size(); i++) {
                    System.out.println(i + "] " + listaDeLivros.get(i).getTitulo());
                }
                System.out.println("\nSelecione o Numero do Livro");
                int livroNum = Verifies.verify(listaDeAutores.size());
                reservados.add(listaDeLivros.get(livroNum).getTitulo());

            }

            case (5) -> {
                for (int i = 0; i < listaDeLivros.size(); i++) {
                    System.out.println(i + "] " + listaDeLivros.get(i).getTitulo());
                }
                System.out.println("\nSelecione o Numero do Livro");
                int livroNum = Verifies.verify(listaDeAutores.size());
                emprestados.add(listaDeLivros.get(livroNum).getTitulo());

            }

        }
    }

    // Exibição
    public static void exibir(ArrayList<Autor> listaDeAutores,
        ArrayList<Livro> listaDeLivros, ArrayList<Editora> listaDeEditoras,
                              ArrayList<String> reservados, ArrayList<String> emprestados){

        System.out.println("1] Exibir lista de Autores");
        System.out.println("2] Exibir lista de Editoras");
        System.out.println("3] Exibir lista de Livros");
        System.out.println("4] Exibir lista de Reservados");
        System.out.println("5] Exibir lista de Emprestados");
        System.out.println("0] Para Sair");

        int choice =  Verifies.verify(6);

        switch (choice){
            case (1) -> System.out.println(listaDeAutores);

            case (2) -> System.out.println(listaDeEditoras);

            case (3) -> System.out.println(listaDeLivros);

            case(4) -> {
                ReservaServico reserva = new ReservaServico();
                reserva.exibirLista(reservados);
            }
            case(5) ->{
                EmprestimoServico emprestimo = new EmprestimoServico();
                emprestimo.exibirLista(emprestados);
            }

            case (0) -> { }
        }
    }

    // Remove
    public static void remove(ArrayList<Autor> listaDeAutores,
               ArrayList<Livro> listaDeLivros, ArrayList<Editora> listaDeEditoras,
               ArrayList<String> reservados, ArrayList<String> emprestados) {

        System.out.println("1] Remover Autor");
        System.out.println("2] Remover Editora");
        System.out.println("3] Remover Livro");
        System.out.println("4] Remover Reserva");
        System.out.println("4] Remover Emprestimo");
        System.out.println("0] Para Sair");

        int choice = Verifies.verify(6);

        switch (choice) {
            case (1) -> {
                for (int i = 0; i < listaDeAutores.size(); i++) {
                    System.out.println(i +"] " + listaDeAutores.get(i).getNomeAutor());
                }
                System.out.println("\nSelecione o Numero do Autor");
                int autorNum = Verifies.verify(listaDeAutores.size());
                listaDeAutores.remove(autorNum);

            }

            case (2) ->{
                for (int i = 0; i < listaDeEditoras.size(); i++) {
                    System.out.println(i +"] " + listaDeEditoras.get(i).getNomeEditora());
                }
                System.out.println("\nSelecione o Numero da Editora");
                int editoraNum = Verifies.verify(listaDeEditoras.size());
                listaDeEditoras.remove(editoraNum);
            }

            case (3) ->{
                for (int i = 0; i < listaDeLivros.size(); i++) {
                    System.out.println(i +"] " + listaDeLivros.get(i).getTitulo());
                }
                System.out.println("\nSelecione o Numero do Livro");
                int livroNum = Verifies.verify(listaDeLivros.size());
                listaDeLivros.remove(livroNum);
            }

            case (4) -> {
                ReservaServico reserva = new ReservaServico();
                reserva.exibirLista(reservados);
                System.out.println("\nSelecione o Numero do Livro");
                int livroNum = Verifies.verify(reservados.size());
                reservados.remove(livroNum);

            }

            case (5) -> {
                EmprestimoServico emprestimo = new EmprestimoServico();
                emprestimo.exibirLista(emprestados);
                System.out.println("\nSelecione o Numero do Livro");
                int livroNum = Verifies.verify(emprestados.size());
                emprestados.remove(livroNum);

            }

            case (0) -> {
            }
        }
    }

    // Servico
    public static void servico(ArrayList<Livro> listaDeLivros, ArrayList<Editora> listaDeEditoras){

        System.out.println("1] Serviço Livro");
        System.out.println("2] Serviço Editora");
        System.out.println("0] Para Sair");

        int choice = Verifies.verify(3);


        switch (choice) {
            case (0) -> {
            }

            case (1) ->{
                for (int i = 0; i < listaDeLivros.size(); i++) {
                    System.out.println(i +"] " + listaDeLivros.get(i).getTitulo());
                }
                System.out.println("\nSelecione o Numero do Livro");
                int livroNum = Verifies.verify(listaDeLivros.size());
                listaDeLivros.get(livroNum).servicoLivro();
            }

            case (2) -> {
                for (int i = 0; i < listaDeEditoras.size(); i++) {
                    System.out.println(i + "] " + listaDeEditoras.get(i).getNomeEditora());
                }
                System.out.println("\nSelecione o Numero da Editora");
                int editoraNum = Verifies.verify(listaDeEditoras.size());
                listaDeEditoras.get(editoraNum).servicoEditora();
            }
        }
    }

    public static void addLivroEmAutorEditora(Livro livro, Autor autor, Editora editora) {
        autor.addLivros(livro);
        editora.addLivro(livro);
    }

}

