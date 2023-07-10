package Av2;

public class Moto extends Veiculo {
	
	private String carenagem;
	private int cilindrada;
	private double velocidade;
	private String tipo;

	public Moto(String marca, String modelo, int ano) {
		super(marca, modelo, ano);
	}
	
	public void setCarenagem(String carenagem) {
		this.carenagem = carenagem;
	}
	
	public void exibirCarenagem()	{
		System.out.printf("A carenagem da moto é %s%n", this.carenagem);
	}
	
	public void setCilindrada(int cilindrada)	{
		this.cilindrada = cilindrada;
	}
	
	public void exibirCilindrada()	{
		System.out.printf("A moto possui %d cilindradas%n", this.cilindrada);
	}
	
	public void setTipo(String tipo)	{
		this.tipo = tipo;
	}
	
	public void exbirTipo() {
		System.out.printf("Tipo da moto: %s%n", this.tipo);
	}
	
	public void acenderFarol()	{
		System.out.printf("O farol está aceso!%n");
	}
	
	public void desligarFarol()	{
		System.out.printf("O farol está desligado!%n");
	}
	
	public void setVelocidade(double velocidade)	{
		this.velocidade = velocidade;
	}
	
	public void exibirVelocidade()	{
		System.out.printf("A moto está a uma velocidade de %f km/h%n", this.velocidade);
	}
	
	public void acelerar() {
		this.velocidade += 1;
	}
	
	public void frear()	{
		this.velocidade -= 1;
	}

}
