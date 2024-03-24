package aula04Pratica01Moto;

import aula04Pratica01Base.Veiculo;

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
