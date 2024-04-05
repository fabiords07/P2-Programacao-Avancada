package pratica01pt2carro;

import pratica01pt1veiculo.Veiculo;

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
