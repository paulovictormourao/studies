package Av1;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//instanciando as classes autor e livro


		
//		Leitor leitor1 = new Leitor("Wiliam");



		boolean looping = true;
		Autor[] listaDeAutores = new Autor[1000];
		Livro[] listaDeLivros = new Livro[1000];
		Scanner input = new Scanner(System.in);

		// Exemplos
		listaDeAutores[0] = new Autor ("J.R.R Tolkien", "Britânico");
		listaDeAutores[1] = new Autor("Arthur Conan Doyle", "Britânico");
		listaDeAutores[2] = new Autor("Euclides", "Grego");
		listaDeAutores[3] = new Autor("Isaac Asimov", "Russo");


		listaDeLivros[0] = new Livro("O Hobbit", listaDeAutores[0]);
		listaDeAutores[0].addLivros(listaDeLivros[0]);

		listaDeLivros[1] = new Livro("Sherlock Holmes", listaDeAutores[1]);
		listaDeAutores[1].addLivros(listaDeLivros[1]);


		listaDeLivros[2] = new Livro("Os elementos", listaDeAutores[2]);
		listaDeAutores[2].addLivros(listaDeLivros[2]);


		listaDeLivros[3] = new Livro("Fundação", listaDeAutores[3]);
		listaDeAutores[3].addLivros(listaDeLivros[3]);
		listaDeLivros[4] = new Livro("Fundação e Império", listaDeAutores[3]);
		listaDeAutores[3].addLivros(listaDeLivros[4]);
		listaDeLivros[5] = new Livro("Eu robo", listaDeAutores[3]);
		listaDeAutores[3].addLivros(listaDeLivros[5]);

		int numAutor = 4;
		int numLivro = 6;

		while (looping){
			System.out.println("Precione 1 para adicionar um novo autor");
			System.out.println("Precione 2 para ver a lista de autores");
			System.out.println("Precione 3 para ver a para adicionar um livro");
			System.out.println("Precione 4 para ver a lista de livros");
			System.out.println("Precione 0  para sair.");


			int choice = input.nextInt();

			switch (choice) {
				// Adiciona um novo autor
				case (1) -> {
					System.out.print("nome do autor: ");
					String nome = input.next();

					System.out.print("nacionalidade do autor: ");

					String nacionalidade = input.next();

					registrarAutor(listaDeAutores, nome, nacionalidade, numAutor);
					numAutor++;
				}

				// Printa lista de autores
				case(2) -> {
					for(int i = 0; i < numAutor; i++) {

						System.out.printf("[Registro do Autor: %d] %s, %s\n", i + 1,
								listaDeAutores[i].getNomeAutor(), listaDeAutores[i].getNacionalidade());
					}

					System.out.println();

				}

				// Adiciona um novo livro
				case (3) -> {
					System.out.print("titulo: ");
					String titulo = input.next();


					System.out.print("numero de registro do autor: ");
					numAutor = input.nextInt();

					registrarLivro(listaDeLivros, titulo, listaDeAutores[numAutor - 1], numLivro);
					numLivro++;
				}

				// Printa a lista de livros
				case (4) -> {
					for(int i = 0; i < numLivro; i++)
						System.out.printf("[Registro do Livro: %d] %s, %s\n", i + 1,
								listaDeLivros[i].getTitulo(), listaDeLivros[i].getAutor().getNomeAutor());

					System.out.println();
				}

				case(5) -> {
					int NumAutorBuscado = input.nextInt();
					System.out.println(listaDeAutores[NumAutorBuscado - 1].obterLivros());
				}

				case (0) -> looping = false;
			}
		}

	}

	public static void registrarAutor(Autor[] lista, String nome, String nacionalidade, int numAuthor) {

		Autor autorAdd = new Autor(nome, nacionalidade);
		lista[numAuthor] = autorAdd;

		System.out.println();

	}

	public static void registrarLivro(Livro[] listaDeLivros, String titulo, Autor autor, int numLivro){

		Livro livroAux = new Livro(titulo, autor);
		listaDeLivros[numLivro] = livroAux;
		autor.addLivros(livroAux);

		System.out.println();

	}
}
