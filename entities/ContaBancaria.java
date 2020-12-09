package entities;

public class ContaBancaria {

	private int numeroConta;
	private String nome;	
	private double saldoConta;
	

	public ContaBancaria(int numeroConta, String nome, double depositoInicial) {
		this.numeroConta = numeroConta;
		this.nome = nome;
		deposito(depositoInicial);
	}
	
	public ContaBancaria(int numeroConta, String nome) {
		this.numeroConta = numeroConta;
		this.nome = nome;		
	}

	public int getNumeroConta() {
		return numeroConta;
	}
	
	public double getSaldoConta() {
		return saldoConta;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void deposito(double valor) {
		saldoConta += valor;
	}
	
	public void saque(double valor) {
		saldoConta -= valor + 5.00;
	}
	
	public String toString() {
		return "Conta Bancaria "
				+ numeroConta 
				+ ", Nome: " 
				+ nome + 
				", Saldo: "
				+ String.format("%.2f", saldoConta);
	}

}
