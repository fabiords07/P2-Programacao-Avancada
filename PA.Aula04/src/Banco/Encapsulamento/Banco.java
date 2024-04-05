package Banco.Encapsulamento;

public class Banco {
	public String nome;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String cpf;
	private double saldo;
	
	
	public Banco () {
		this.nome = "";
		this.cpf = "";
		this.saldo = 0.0;
	}
	
	public Banco (String nome, String cpf, double saldo) {
		this.nome = nome;
		this.cpf = cpf;
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(double novoSaldo) {
		this.saldo = novoSaldo;
	}

}