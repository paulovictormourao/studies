package Av2;

public class Carro extends Veiculo {

	private String carroceria;
	private int numPassageiros;
	private int numPortas;
	
	public Carro(String marca, String modelo, int ano) {
		super(marca, modelo, ano);
	}
	
	public void setCarroceria(String carroceria)	{
		this.carroceria = carroceria;
	}
	
	public void exibirCarroceria() {
		System.out.printf("A carroceria do carro é do tipo %s%n", this.carroceria);
	}
	
	public void setNumPassageiros(int numPassageiros)	{
		this.numPassageiros = numPassageiros;
	}
	
	public void exibirPassageiros()	{
		System.out.printf("O carro está levando %d passageiros%n", this.numPassageiros);
	}
	
	public void abrirPorta(int numPortasAbertas)	{
		this.numPortas = numPortasAbertas;
		System.out.printf("Foram abertas %d portas%n", this.numPortas);
	}
	
}
