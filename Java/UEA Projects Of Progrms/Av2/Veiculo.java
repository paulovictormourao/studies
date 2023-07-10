package Av2;

public class Veiculo {
	
	protected String marca;
	protected String modelo;
	protected int ano;
	
	public Veiculo(String marca, String modelo, int ano)	{
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
	}
	
	public String obterMarca()	{
		return this.marca;
	}
	
	public String obterModelo()	{
		return this.modelo;
	}
	
	public int obterAno()	{
		return this.ano;
	}
	
}
