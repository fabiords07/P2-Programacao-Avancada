package aula04Banco;

public class Banco {

	public String nome;
	public String cpf;
	private double saldo;
	
	public Banco (String nome, String cpf, double saldo) {
		this.nome = nome;
		this.cpf = cpf;
		this.saldo = saldo;
	}
	
	public Banco () {
		this.nome = "Sem nome";
		this.cpf = "CPF cancelado";
		this.saldo = 0;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(double novoSaldo) {
		this.saldo = novoSaldo;
	}

}