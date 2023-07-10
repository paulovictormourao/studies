package Av2;

public class Garagem {
	
	private final Veiculo[] listaVeiculos = new Veiculo[100];


	public void adicionarVeiculo(Veiculo veiculo)	{
		for (int i = 0; i < listaVeiculos.length; i++){

			if (listaVeiculos[i] == null){
				listaVeiculos[i] = veiculo;
				return;
			}
		}
	}
	
	public void removerVeiculo(String marca, String modelo)	{
		boolean removed = false;

		for (int i = 0; i < listaVeiculos.length; i++){

			if (listaVeiculos[i] != null) {
				if ((listaVeiculos[i].obterMarca().equals(marca)) &&
						(listaVeiculos[i].obterModelo().equals(modelo))) {

					removed = true;

					listaVeiculos[i] = null;
					System.out.printf("O veiculo saiu da vaga %d\n", i + 1);
				}
			}
		}

		if (!(removed)) {
			System.out.println("Veiculo não encontrado");
		}
	}
	
	public void listarVeiculos()	{
		for (int i = 0; i < listaVeiculos.length; i++) {

			if (listaVeiculos[i] != null) {
				System.out.printf("[VAGA %d]\n", i + 1);
				System.out.printf("MARCA: %s\n", listaVeiculos[i].obterMarca());
				System.out.printf("CARRO: %s\n", listaVeiculos[i].obterModelo());
				System.out.printf("ANO: %s\n\n", listaVeiculos[i].obterAno());

			}
		}
	}
	
	public int quantidadeVeiculos()	{
		int num = 0;

		for (Veiculo veiculo : listaVeiculos) {
			if (veiculo != null) {
				num++;
			}
		}
		
		return num;
	}
}
