package pratica01pt3moto;

import pratica01pt1veiculo.Veiculo;

public class Moto extends Veiculo{
	private int cilindradas;
	
	public Moto(String modelo, int ano, int cilindradas) {
		super(modelo, ano);
		this.cilindradas = cilindradas;
	}
	
	@Override
	public void imprimirDetalhes() {
		super.imprimirDetalhes();
		System.out.println("Cilindradas: " + cilindradas);
	}

}