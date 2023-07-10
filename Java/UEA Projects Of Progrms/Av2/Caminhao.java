package Av2;

public class Caminhao extends Veiculo {
	
	private String carga;
	private int tamanho;

	public Caminhao(String marca, String modelo, int ano) {
		super(marca, modelo, ano);
		
	}
	
	public void setCarga(String carga)	{
		this.carga = carga;
	}
	
	public void exibirCarga()	{
		System.out.printf("A carga do caminhão é %s%n", this.carga);
	}
	
	public void setTamanho(int tamanho)	{
		this.tamanho = tamanho;
	}
	
	public void exibirTamanho()	{
		System.out.printf("O tamanho do caminhão é %d%n", this.tamanho);
	}
	
}
