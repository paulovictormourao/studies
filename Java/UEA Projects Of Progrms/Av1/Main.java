package Av1;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		boolean looping = true;
		Autor[] listaDeAutores = new Autor[1000];
		Livro[] listaDeLivros = new Livro[1000];
		Leitor[] listaDeLeitores = new Leitor[1000];
		Scanner input = new Scanner(System.in);

		// Exemplos
		listaDeAutores[0] = new Autor ("J.R.R Tolkien", "Britânico");
		listaDeAutores[1] = new Autor("Euclides", "Grego");
		listaDeAutores[2] = new Autor("Isaac Asimov", "Russo");


		listaDeLivros[0] = new Livro("O Hobbit", listaDeAutores[0]);
		listaDeAutores[0].addLivros(listaDeLivros[0]);


		listaDeLivros[1] = new Livro("Os Elementos", listaDeAutores[1]);
		listaDeAutores[1].addLivros(listaDeLivros[1]);


		listaDeLivros[2] = new Livro("Fundação", listaDeAutores[2]);
		listaDeAutores[2].addLivros(listaDeLivros[2]);
		listaDeLivros[3] = new Livro("Eu robo", listaDeAutores[2]);
		listaDeAutores[2].addLivros(listaDeLivros[3]);


		listaDeLeitores[0]  = new Leitor("William");


		int numAutor = 3;
		int numLivro = 4;
		int numLeitor = 1;

		System.out.println("      { LISTA DE AUTORES }");
		for(int i = 0; i < numAutor; i++) {

			System.out.printf("[Registro do Autor: %d] %s, %s\n", i + 1,
					listaDeAutores[i].getNomeAutor(), listaDeAutores[i].getNacionalidade());
		}
		System.out.println();

		System.out.println("      { LISTA DE LIVROS }");
		for(int i = 0; i < numLivro; i++)
			System.out.printf("[Registro do Livro: %d] %s, %s\n", i + 1,
					listaDeLivros[i].getTitulo(), listaDeLivros[i].getAutor().getNomeAutor());

		System.out.println();

		System.out.println("      { LISTA DE LEITORES }");
		for (int i = 0; i < numLeitor; i++){
			System.out.printf("Registro do Leitor: %d] %s\n", i + 1, listaDeLeitores[i].getNomeleitor());
		}


		// Aplicativo
		while (looping){
			System.out.println("\nPrecione 1 para adicionar um novo autor");
			System.out.println("Precione 2 para ver a lista de autores");
			System.out.println("Precione 3 para adicionar um livro");
			System.out.println("Precione 4 para ver a lista de livros");
			System.out.println("Precione 5 para ver a lista de livros de um autor");
			System.out.println("Precione 6 para adicionar um novo leitor");
			System.out.println("Precione 7 para ver a lista de leitores");
			System.out.println("Precione 8 para emprestar um livro");
			System.out.println("Precione 0  para sair.");


			int choice = input.nextInt();

			switch (choice) {

				// Adiciona um novo autor
				case (1) -> {
					registrarAutor(listaDeAutores, numAutor);
					numAutor++;
				}

				// Printa lista de autores
				case (2) -> {
					for(int i = 0; i < numAutor; i++) {

						System.out.printf("[Registro do Autor: %d] %s, %s\n", i + 1,
								listaDeAutores[i].getNomeAutor(), listaDeAutores[i].getNacionalidade());
					}
				}

				// Adiciona um novo livro
				case (3) -> {

					registrarLivro(listaDeLivros, listaDeAutores, numLivro);
					numLivro++;
				}

				// Printa a lista de livros
				case (4) -> {
					for(int i = 0; i < numLivro; i++)
						System.out.printf("[Registro do Livro: %d] %s, %s\n", i + 1,
								listaDeLivros[i].getTitulo(), listaDeLivros[i].getAutor().getNomeAutor());

				}

				// Printa lista de livros de um autor
				case (5) -> {
					System.out.print("\nDigite o Numero de Registro de um Autor: ");
					int NumAutorBuscado = input.nextInt();
					System.out.println(listaDeAutores[NumAutorBuscado - 1].obterLivros());
				}

				// Registra novo Leitor
				case (6) ->	{
					System.out.print("\nDigite seu primeiro nome: ");
					String nome = input.next();
					listaDeLeitores[numLeitor] = new Leitor(nome);
					numLeitor++;
				}

				// printa lista de leitores
				case (7) -> {
					for (int i = 0; i < numLeitor; i++){
						System.out.printf("Registro do Leitor: %d] %s", i + 1, listaDeLeitores[i].getNomeleitor());

						System.out.println(listaDeLeitores[i].exibirLista());
					}
				}

				// Empresta livro
				case(8) -> {
					System.out.print("digite o numer de registro do leitor: ");
					int leitor = input.nextInt();

					System.out.print("digite o numer de registro do livro: ");
					int livro = input.nextInt();

					listaDeLeitores[leitor - 1].emprestarLivro(listaDeLivros[livro - 1]);

				}

				case (0) -> looping = false;

			}
		}

	}

	public static void registrarAutor(Autor[] lista, int numAuthor) {
		Scanner input = new Scanner(System.in);

		System.out.print("nome do autor: ");
		String nome = input.nextLine();

		System.out.print("nacionalidade do autor: ");

		String nacionalidade = input.nextLine();

		Autor autorAdd = new Autor(nome, nacionalidade);
		lista[numAuthor] = autorAdd;

	}

	public static void registrarLivro(Livro[] listaDeLivros, Autor[] listaDeAutores, int numLivro){

		Scanner input = new Scanner(System.in);

		System.out.print("titulo: ");
		String titulo = input.nextLine();


		System.out.print("numero de registro do autor: ");
		int numAutor = input.nextInt() - 1;

		Livro livroAux = new Livro(titulo, listaDeAutores[numAutor]);
		listaDeLivros[numLivro] = livroAux;
		listaDeAutores[numAutor].addLivros(livroAux);

	}
}
