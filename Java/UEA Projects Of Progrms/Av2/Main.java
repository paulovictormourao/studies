package Av2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean looping = true;
		Garagem garagem = new Garagem();

		// Exemplos
		Veiculo l200 = new Carro("Mitsubishi", "L200", 2012);
		garagem.adicionarVeiculo(l200);

		Veiculo saveiro = new Carro("Volkswagen", "Saveiro", 2022);
		garagem.adicionarVeiculo(saveiro);

		// Aplicativo
		while (looping){
			System.out.println("\nPrecione 1 para adicionar um novo veiculo");
			System.out.println("Precione 2  para remover um veiculo.");
			System.out.println("Precione 3  para ver os carros na garagem.");
			System.out.println("Precione 0  para sair.");

			int choice = input.nextInt();

			switch (choice){

				case (1) -> {
					System.out.println("Se for uma moto, digite 1");
					System.out.println("Se for um carro, digite 2");
					System.out.println("Se for um caminhao, digite 3");
					System.out.println("Digite 0 para voltar");

					int vehicleType = input.nextInt();

					if (vehicleType != 0)
						addVehicle(vehicleType, garagem);

				}

				case (2) -> removeVehicle(garagem);

				case (3) -> garagem.listarVeiculos();

				case (0) -> looping = false;
			}
		}
	}

	public static void addVehicle(int type, Garagem garagem){

		Scanner input = new Scanner(System.in);

		System.out.print("Digite a Marca: ");
		String marca = input.nextLine();

		System.out.print("Digite o Modelo: ");
		String modelo = input.nextLine();

		System.out.print("Digite o ano: ");
		int ano = input.nextInt();

		switch (type){
			case (1)-> {
				Veiculo moto = new Moto(marca, modelo, ano);
				garagem.adicionarVeiculo(moto);
				System.out.println("A moto foi estacionado");
			}

			case (2)-> {
				Veiculo carro = new Carro(marca, modelo, ano);
				garagem.adicionarVeiculo(carro);
				System.out.println("O carro foi estacionado");
			}

			case (3) -> {
				Veiculo caminhao = new Caminhao(marca, modelo, ano);
				garagem.adicionarVeiculo(caminhao);
				System.out.println("O caminhao foi estacionado");
			}
		}


	}

	public static void removeVehicle(Garagem garagem){
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o nome da marca do veiculo que sera removido: ");
		String marca = input.nextLine();

		System.out.print("Digite o nome do modelo do veiculo que sera removido: ");
		String modelo = input.nextLine();

		garagem.removerVeiculo(marca, modelo);

	}
}
