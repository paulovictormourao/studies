package user;
import data.*;


import java.util.Scanner;

public class Registrar {
    public static void registrar(int choice, Autor[] listaDeAutores,
            Livro[] listaDeLivros, Editora[] listaDeEditoras){

        boolean looping = true;

        while (looping) {
            System.out.println("1] Registro de Autor");
            System.out.println("2] Registro de Editora");
            System.out.println("3] Registro de Livro");
            System.out.println("0] Para Sair");

            Scanner input = new Scanner(System.in);

            switch (choice) {

                case (0) -> looping = false;

                case (1) -> {
                    System.out.println("Digite o nome do Autor");
                    String nomeAutor = input.nextLine();

                    System.out.println("Digite a Nacionalidade do Autor");
                    String nacionalidade = input.nextLine();

                }
            }
        }
    }
}
