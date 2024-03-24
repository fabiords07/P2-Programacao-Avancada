package aula04Pratica01Carro;

import aula04Pratica01Base.Veiculo;

public class Carro extends Veiculo {
	int numeroPortas;
	
	public Carro (String modelo, int ano, int numeroPortas) {
		super(modelo, ano);
		this.numeroPortas = numeroPortas;
	}
	
	@Override
	public void imprimirDetalhes() {
		super.imprimirDetalhes();
		System.out.println("Número de portas: " + numeroPortas + ".");
	}
}
